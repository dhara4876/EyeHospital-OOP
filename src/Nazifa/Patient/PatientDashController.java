/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Patient;

import Dhara.Nurse.NurseDashBoardSceneController;
import Dhara.Nurse.ViewAssignedtasksSceneController;
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
public class PatientDashController implements Initializable {
    
    @FXML
    private BorderPane patientDashBoardBorderPane;
    private Patient patient;
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    

    @FXML
    private void bookAppointmentOnClick(ActionEvent event) {
         try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BookAppointmentScene.fxml"));
        Parent root = loader.load();

       
        BookAppointmentSceneController b = loader.getController();

        
        b.setPatient(patient);

        patientDashBoardBorderPane.setCenter(root);
    } catch (IOException ex) {
        Logger.getLogger(PatientDashController.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    @FXML
    private void medicalBillsOnClick(ActionEvent event) {
         try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MedicalBillsScene.fxml"));
        Parent root = loader.load();

       
        MedicalBillsSceneController b = loader.getController();

        
        b.setPatient(patient);

        patientDashBoardBorderPane.setCenter(root);
    } catch (IOException ex) {
        Logger.getLogger(PatientDashController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void prescriptionOnClick(ActionEvent event) {
         try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("PrescriptionScene.fxml"));
        Parent root = loader.load();

       
        PrescriptionSceneController b = loader.getController();

        
        b.setPatient(patient);

        patientDashBoardBorderPane.setCenter(root);
    } catch (IOException ex) {
        Logger.getLogger(PatientDashController.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }

    @FXML
    private void viewTestsOnClick(ActionEvent event) {
         try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewTestsScene.fxml"));
        Parent root = loader.load();

       
        ViewTestsSceneController b = loader.getController();

        
        b.setPatient(patient);

        patientDashBoardBorderPane.setCenter(root);
    } catch (IOException ex) {
        Logger.getLogger(PatientDashController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void addFeedbackOnClick(ActionEvent event) {
         try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddFeedbackPatient.fxml"));
        Parent root = loader.load();

       
        AddFeedbackPatientController b = loader.getController();

        
        b.setPatient(patient);

        patientDashBoardBorderPane.setCenter(root);
    } catch (IOException ex) {
        Logger.getLogger(PatientDashController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void complaintOnClick(ActionEvent event) {
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ComplaintPatient.fxml"));
        Parent root = loader.load();

       
        ComplaintPatientController b = loader.getController();

        
        b.setPatient(patient);

        patientDashBoardBorderPane.setCenter(root);
    } catch (IOException ex) {
        Logger.getLogger(PatientDashController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void signOutOnClick(ActionEvent event) {
         try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signOutScene.fxml"));
        Parent root = loader.load();

       
        SignOutSceneController b = loader.getController();

        
        b.setPatient(patient);

        patientDashBoardBorderPane.setCenter(root);
    } catch (IOException ex) {
        Logger.getLogger(PatientDashController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
    
}
