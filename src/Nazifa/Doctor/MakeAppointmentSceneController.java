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
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = null;
        FXMLLoader doctorLoader = new FXMLLoader(getClass().getResource("Appointments.fxml"));
        parent = (Parent) doctorLoader.load();
        Scene doctorScene = new Scene(parent);

        AppointmentsController d = doctorLoader.getController();
        d.setDoctor(this.doctor);

        Stage doctorStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        doctorStage.setScene(doctorScene);
        doctorStage.show();
    }

    @FXML
    private void postAppointmentButtonOnClick(ActionEvent event) { 
        Boolean addNewAppointment = Doctor.addNewAppointment(Integer.parseInt(doctorIDTextField.getText()), appointmentDateDatePicker.getValue(),appointmentTimingCombobox.getValue());
        if (addNewAppointment) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Appointment Posted");
            a.showAndWait();
        }
    } 

}
