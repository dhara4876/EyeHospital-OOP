/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Doctor;

import Model.Task;
import Users.Doctor;
import Users.Nurse;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class AssignTaskToNurseSceneController implements Initializable {
    
    private Doctor doctor;
    @FXML
    private ComboBox<Integer> nurseIDComboBox;
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @FXML
    private TextArea nurseTaskDetailTextArea;
    
    @FXML
    private TextField doctorIDTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nurseIDComboBox.getItems().addAll(Nurse.loadNurseIDs());
    }    

    @FXML
    private void assignTaskToNurseOnClick(ActionEvent event) {
        Integer receiverId = nurseIDComboBox.getValue(); 
        Integer senderId = Integer.valueOf(doctorIDTextField.getText());
        String details = nurseTaskDetailTextArea.getText(); 


        boolean taskAdded = Doctor.addNewTask(receiverId, senderId, details);

        if (taskAdded) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Task sent");
            a.showAndWait();
        }
        
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = null;
        FXMLLoader doctorLoader = new FXMLLoader(getClass().getResource("Task.fxml"));
        parent = (Parent) doctorLoader.load();
        Scene doctorScene = new Scene(parent);

        TaskController d = doctorLoader.getController();
        d.setDoctor(this.doctor);

        Stage doctorStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        doctorStage.setScene(doctorScene);
        doctorStage.show();
    }
    
}
