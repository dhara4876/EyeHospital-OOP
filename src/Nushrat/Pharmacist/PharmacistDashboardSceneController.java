/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Pharmacist;

import Users.Pharmacist;
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
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class PharmacistDashboardSceneController implements Initializable {
    
    private Pharmacist pharmacist; 
    @FXML
    private BorderPane dashboardBorderPane;

    public Pharmacist getPharmacist() {
        return pharmacist;
    }

    public void setPharmacist(Pharmacist pharmacist) {
        this.pharmacist = pharmacist;
    }
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void homeBtnOnClk(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("PharmacistDashboardScene.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(PharmacistDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void calculateMedPriceDashboardBtnOnClk(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("CalculateMedicinePrice.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(PharmacistDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void orderMedDashboardBtnOnClk(ActionEvent event) {
       try {
            Parent parent = FXMLLoader.load(getClass().getResource("OrderMedicine.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(PharmacistDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void updateMedicineListDashboardBtnOnClk(ActionEvent event)  {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("UpdateMedicineList.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(PharmacistDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void updatePrescriptionDashboardBtnOnClk(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("UpdatePrescription.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(PharmacistDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void updateTaskDashboardBtnOnClk(ActionEvent event)  {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("UpdateTask.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(PharmacistDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML
    private void viewBillListDashboardBtnOnClk(ActionEvent event)   {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("ViewBillList.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(PharmacistDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void viewPrescritionDashboardBtnOnClk(ActionEvent event)  {
       try {
            Parent parent = FXMLLoader.load(getClass().getResource("ViewPrescription.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(PharmacistDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void viewChartDashboardBtnOnClk(ActionEvent event)  {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("ViewPrescriptionChart.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(PharmacistDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
