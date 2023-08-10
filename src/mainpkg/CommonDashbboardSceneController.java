/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

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
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class CommonDashbboardSceneController implements Initializable {

    @FXML
    private MenuBar accountantMenuBar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void menuDashboardOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddFacultyScene.fxml"));
           accountantMenuBar.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(CommonDashBoardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void billMenuItemOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddFacultyScene.fxml"));
            accountantMenuBar.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(CommonDashbboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void insuranceMenuItemOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddFacultyScene.fxml"));
            accountantMenuBar.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(CommonDashBoardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void expensesMenuItemOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddFacultyScene.fxml"));
            accountantMenuBar.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(CommonDashBoardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void chartMenuItemOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddFacultyScene.fxml"));
            accountantMenuBar.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(CommonDashBoardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void myDeskMenuOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddFacultyScene.fxml"));
            accountantMenuBar.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(CommonDashBoardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void notificationsMenuOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddFacultyScene.fxml"));
            accountantMenuBar.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(CommonDashBoardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void signOutMenuOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AddFacultyScene.fxml"));
            accountantMenuBar.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(CommonDashBoardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
