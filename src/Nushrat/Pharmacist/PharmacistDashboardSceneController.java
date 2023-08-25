/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Pharmacist;

import Users.Pharmacist;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class PharmacistDashboardSceneController implements Initializable {
    
    private Pharmacist pharmacist; 

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
    }

    @FXML
    private void calculateMedPriceBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void orderMedDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void updateMedicineListDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void updatePrescriptionDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void updateTaskDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void viewBillListDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void viewPrescritionDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void viewChartDashboardBtnOnClk(ActionEvent event) {
    }
    
}
