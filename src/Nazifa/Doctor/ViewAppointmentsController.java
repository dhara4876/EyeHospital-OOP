/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Doctor;

import Model.Appointment;
import Users.Doctor;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ViewAppointmentsController implements Initializable {
    
    private Doctor doctor;
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


    @FXML
    private TableView<Appointment> viewAppointmentsTableView;
    @FXML
    private TableColumn<Appointment, Integer> patientIDTableView;
    @FXML
    private TableColumn<Appointment, String> patientNameTableView;
    @FXML
    private TableColumn<Appointment, String> slotTableView;
    @FXML
    private TableColumn<Appointment, Integer> doctorIDTableView;
    @FXML
    private TableColumn<Appointment, LocalDate> dateTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = null;
        FXMLLoader doctorLoader = new FXMLLoader(getClass().getResource("Appointments.fxml"));
        parent = (Parent) doctorLoader.load();
        Scene doctorScene = new Scene(parent);

        PrescriptionController d = doctorLoader.getController();
        d.setDoctor(this.doctor);

        Stage doctorStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        doctorStage.setScene(doctorScene);
        doctorStage.show();
    }
    
}
