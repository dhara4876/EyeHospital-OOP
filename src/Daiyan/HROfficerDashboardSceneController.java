/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Daiyan;

import Dhara.Accountant.AccountantDashboardController;
import Dhara.Accountant.InsuranceMenuItemSceneController;
import Users.HROfficer;
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
public class HROfficerDashboardSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private HROfficer hrOfficer;
    @FXML
    private BorderPane HROfficerDashboard;

    public HROfficer getHrOfficer() {
        return hrOfficer;
    }

    public void setHrOfficer(HROfficer hrOfficer) {
        this.hrOfficer = hrOfficer;
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        // TODO
    }    

    @FXML
    private void addEmployeeOnClick(ActionEvent event) {
                  try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AddEmployee.fxml"));
        Parent root = loader.load();

       
        AddEmployeeController b = loader.getController();

        
        b.setHrOfficer(hrOfficer);

        HROfficerDashboard.setCenter(root);
    } catch (IOException ex) {
        Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    }
    

