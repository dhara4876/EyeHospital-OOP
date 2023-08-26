/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;

import Dhara.Accountant.AccountantDashboardController;
import Dhara.Accountant.BillMenuItemSceneController;
import Users.Optometrist;
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
public class OptometristDashboardSceneController implements Initializable {
    private Optometrist optometrist; 
    @FXML
    private BorderPane dashboardBorderPane;

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
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("OptometristDashboardScene.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(OptometristDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void feedbackDashboardBtnOnClk(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("AddFeedbackOptometrist.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(OptometristDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void testReportDashboardBtnOnClk(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("AddTestReport.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(OptometristDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void glassChartReportDashboardBtnOnClk(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("GeneratePieChart.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(OptometristDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void restockGlassesDashboardBtnOnClk(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Restock Glasses.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(OptometristDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void assignTaskDashboardBtnOnClk(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("SendTaskToNurse.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(OptometristDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void submitReportDashboardBtnOnClk(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("SubmitReportPdf.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(OptometristDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void viewTestDetailsDashboardBtnOnClk(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("ViewTestDetails.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(OptometristDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void makeScheduleDashboardBtnOnClk(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("makeSchedule.fxml"));
            dashboardBorderPane.setCenter(parent);
        } catch (IOException ex) {
            Logger.getLogger(OptometristDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
