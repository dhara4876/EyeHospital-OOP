/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;

import Users.Optometrist;
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
public class OptometristDashboardSceneController implements Initializable {
    private Optometrist optometrist; 

    public Optometrist getOptometrist() {
        return optometrist;
    }

    public void setOptometrist(Optometrist optometrist) {
        this.optometrist = optometrist;
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
    private void feedbackDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void testReportDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void glassChartReportDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void restockGlassesDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void assignTaskDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void submitReportDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void viewTestDetailsDashboardBtnOnClk(ActionEvent event) {
    }

    @FXML
    private void makeScheduleDashboardBtnOnClk(ActionEvent event) {
    }
    
}
