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
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Asus
 */


public class DocDashboardController implements Initializable {

    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @FXML
    private BorderPane doctorDashBoardBorderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void prescriptionOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Prescription.fxml"));
            doctorDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

    @FXML
    private void tasksOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Task.fxml"));
            doctorDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void addTreatmentOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddTreatment.fxml"));
            doctorDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void testsOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Tests.fxml"));
            doctorDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void appointmentsOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Appointments.fxml"));
            doctorDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void signOutOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Signout.fxml"));
            doctorDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void addFeedbackOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddFeedBackDoctor.fxml"));
            doctorDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }

    @FXML
    private void resignOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ResignationOnClick.fxml"));
            doctorDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DocDashboardController.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
}
