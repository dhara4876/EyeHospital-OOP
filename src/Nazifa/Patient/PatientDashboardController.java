/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Patient;

import Nazifa.Doctor.DocDashboardController;
import Users.Patient;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class PatientDashboardController implements Initializable {

    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    @FXML
    private BorderPane patientDashBoardBorderPane;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void bookAppointmentsOnclick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("BookAppointmentScene.fxml"));
            patientDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void medicalBillsOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MedicalBillsScene.fxml"));
            patientDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void prescriptionOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PrescriptionScene.fxml"));
            patientDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void viewTestsOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ViewTestsScene.fxml"));
            patientDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void signOutOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("signOutScene.fxml"));
            patientDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
