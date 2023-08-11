/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Accountant;

import Users.Accountant;
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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;



/**
 * 
 * FXML Controller class
 *
 * @author Asus
 */
public class AccountantDashboardController implements Initializable {
    private Accountant accountant;

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }

    @FXML
    private BorderPane accountantDashBoardBorderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void InsuranceOnClick(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("InsuranceMenuItemScene.fxml"));
            accountantDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void BIllOnClick(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("BillMenuItemScene.fxml"));
            accountantDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void expinditureOnClick(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource("ExpenditureMenuItemScene.fxml"));
            accountantDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void signOutOnClick(ActionEvent event) {
         try {
            Parent root = FXMLLoader.load(getClass().getResource(".fxml"));
            accountantDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void myDashboardOnClick(MouseEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AccountantWelcomeScene.fxml"));
            accountantDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
