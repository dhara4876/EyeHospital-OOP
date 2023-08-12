/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;

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
public class OptermetristDashboardController implements Initializable {

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
            parent = FXMLLoader.load(getClass().getResource("OptermetristDashboard.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void contactLensBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("ContactLensService.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void eyeHealthBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("EyeHealthAssessment.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void eyewearSelectBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("EyewearSelection.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void lowVisionRehabBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("LowVisionRehabilitation.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void operativeCareBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("Pre-and Post-operative Care.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void restockGlassesBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("Restock Glasses.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void visionTestingBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("VisionTesting.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void generatePieBtnOnClick(MouseEvent event) {
        Parent parent;
        try {
            parent = FXMLLoader.load(getClass().getResource("GeneratePieChart.fxml"));
            commonBorderPane.setCenter(parent);
            
        } catch (IOException ex) {
            Logger.getLogger(OptermetristDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
