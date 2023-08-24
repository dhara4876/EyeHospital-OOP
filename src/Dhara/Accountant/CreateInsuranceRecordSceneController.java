/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Accountant;

import CommonScenes.StartSceneController;
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
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class CreateInsuranceRecordSceneController implements Initializable {
    
    private Accountant accountant; 
    @FXML
    private TextArea detailsTextArea;

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    @FXML
    private TextField ItemTextField;
    @FXML
    private TextField amtTextField;
    @FXML
    private DatePicker DOIdatepicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addButtonOnClick(ActionEvent event) {
         Boolean addStatus = accountant.CreateInsuranceRecord(ItemTextField.getText(), Double.parseDouble((amtTextField.getText())),  DOIdatepicker.getValue(), detailsTextArea.getText());
        if (addStatus) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Expense added");
            a.showAndWait();
    }
    }
    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = null;
        FXMLLoader accountantLoader = new FXMLLoader(getClass().getResource("InsuranceMenuItemScene.fxml"));
        parent = (Parent) accountantLoader.load();
        Scene accountantScene = new Scene(parent);

        InsuranceMenuItemSceneController d = accountantLoader.getController();
        d.setAccountant(this.accountant);

        Stage accountantStage = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        accountantStage.setScene(accountantScene);
        accountantStage.show();
    }
    
}
