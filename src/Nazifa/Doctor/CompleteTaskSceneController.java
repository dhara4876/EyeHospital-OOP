/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Doctor;

import Model.Task;
import Users.Doctor;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class CompleteTaskSceneController implements Initializable {
    
    private Doctor doctor;
    @FXML
    private TableView<Task> taskTableView;
    @FXML
    private TableColumn<Task, Integer> senderIDTableColumn;
    @FXML
    private TableColumn<Task, String> taskTableColumn;
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        senderIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        taskTableColumn.setCellValueFactory(new PropertyValueFactory<>("details"));
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
