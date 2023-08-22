/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Doctor;

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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class MakeAppointmentSceneController implements Initializable {
    
    private Doctor doctor;
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @FXML
    private TextField doctorIDTextField;
    @FXML
    private ComboBox<String> appointmentTimingCombobox;
    @FXML
    private DatePicker appointmentDateDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        appointmentTimingCombobox.getItems().addAll("Dawn","Morning", "Noon", "Afternoon", "Evening", "Night", "Midnight");
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        Parent login = null;
        try {
            login = FXMLLoader.load(getClass().getResource("Appointments.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(MakeAppointmentSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene1 = new Scene(login);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void postAppointmentButtonOnClick(ActionEvent event) { /*
        Boolean addAppointment = Doctor.addAppointment(ItemTextField.getText(), Double.parseDouble((amtTextField.getText())), DOIdatepicker.getValue());
        if (addStatus) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Expense added");
            a.showAndWait();
        }*/
    } 

}
