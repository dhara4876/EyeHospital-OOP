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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ExpenditureMenuItemController implements Initializable {
    private Accountant accountant;

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClickMakeRecordButton(ActionEvent event) {
         Parent parent = null;
        FXMLLoader accLoader = new FXMLLoader(getClass().getResource("CreateExpenseRecordScene.fxml"));
        try {
            parent = (Parent) accLoader.load();
        } catch (IOException ex) {
            Logger.getLogger(ExpenditureMenuItemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene HRScene = new Scene(parent);
        
        CreateExpenseRecordSceneController m = accLoader.getController();
        m.setAccountant(this.accountant);

        Stage HRStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        HRStage.setScene(HRScene);
        HRStage.show();
    }

    @FXML
    private void onClickViewRecordButton(ActionEvent event) {
        Parent parent = null;
        FXMLLoader accLoader = new FXMLLoader(getClass().getResource("ViewExpenseRecordScene.fxml"));
        try {
            parent = (Parent) accLoader.load();
        } catch (IOException ex) {
            Logger.getLogger(ExpenditureMenuItemController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene HRScene = new Scene(parent);
        
        ViewExpenseRecordSceneController m = accLoader.getController();
        m.setAccountant(this.accountant);

        Stage HRStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        HRStage.setScene(HRScene);
        HRStage.show();
    }
    
}
