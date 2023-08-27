/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Daiyan;

import CommonScenes.StartSceneController;
import Users.Accountant;
import Users.User;
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
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ResignationSceneController implements Initializable {
 private Accountant accountant;

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
       
    }
    @FXML
    private TextArea resignationTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
Alert unfill = new Alert(Alert.AlertType.WARNING, "FILL UP EVERYTHING");
    @FXML
    private void addButtonOnClick(ActionEvent event) {
           String resignation = resignationTextArea.getText();
        if (resignation==null) {unfill.show(); return;}
        
         Boolean addStatus = User.addNewResignation(this.accountant.getID(),resignation);
        if (addStatus) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Resignation added");
            a.showAndWait();
        }
    }

    @FXML
    private void switchToAddEmployeeScene(ActionEvent event) {
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("AddEmployee.fxml"));
            Scene scene2 = new Scene(scene2Parent);

            Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg2.setScene(scene2);
            stg2.show();
        } catch (IOException ex) {
            Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
