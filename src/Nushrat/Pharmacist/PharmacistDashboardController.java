/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Pharmacist;

import Nushrat.Optermetrist.OptermetristDashboardController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class PharmacistDashboardController implements Initializable {

    @FXML
    private BorderPane commonBorderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void homeBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("PharmacistDashboardScene.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void patientPrescriptionBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("AccessPatientPrescriptions.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void medicineInventoryBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("UpdateMedicineInventory.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void taskAssignedBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("AccessTasksAssignedbyNurses.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    

    @FXML
    private void medOrdersBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("OrderList.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    

    @FXML
    private void docMedReccomBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("Access Doctor’s Medication Recommendations.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void medExpiryTrackingBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("MedicineExpiryTracking.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void medRecomApproveBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("ApproveMedicineRecommendations.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
