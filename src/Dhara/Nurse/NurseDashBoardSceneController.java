/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Nurse;

import Dhara.Accountant.AccountantDashboardController;
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
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class NurseDashBoardSceneController implements Initializable {
    private Nurse nurse;
    @FXML
    private BorderPane nurseDashboardBorderpane;

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void complaintOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ComplaintScene.fxml"));
            nurseDashboardBorderpane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void viewAssignmentOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ViewAssignedtasksScene.fxml"));
            nurseDashboardBorderpane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @FXML
    private void requestForDocOnClick(ActionEvent event) {
try {
            Parent root = FXMLLoader.load(getClass().getResource("ContactDoctorScene.fxml"));
            nurseDashboardBorderpane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @FXML
    private void addPatientDetailsOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddPatientDetails.fxml"));
            nurseDashboardBorderpane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

 
    

    @FXML
    private void admitPatientOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AdmitPatientScene.fxml"));
            nurseDashboardBorderpane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @FXML
    private void viewAdmittedPatientOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ViewAdmittedPatientsScene.fxml"));
            nurseDashboardBorderpane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @FXML
    private void patientDetailsOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ViewPatientDetailsScene.fxml"));
            nurseDashboardBorderpane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @FXML
    private void ViewMedicineChartOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ViewPatientMedsInChart.fxml"));
            nurseDashboardBorderpane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @FXML
    private void prescriptionPieChartOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PieChart.fxml"));
            nurseDashboardBorderpane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
