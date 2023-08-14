/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Accountant;

import CommonScenes.StartSceneController;
import Model.InsuranceRecord;
import Users.Accountant;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ViewInsuranceRecordSceneController implements Initializable {

    @FXML
    private TableColumn<InsuranceRecord, String> itemTableColoumn;
    @FXML
    private TableColumn<InsuranceRecord, Double> InsuranceAmountTableColoumn;
    @FXML
    private TableColumn<InsuranceRecord, LocalDate> dateOfIssueTableColoumn;
    @FXML
    private TableView<InsuranceRecord> InsuranceTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           itemTableColoumn.setCellValueFactory(new PropertyValueFactory<>("item"));
    InsuranceAmountTableColoumn.setCellValueFactory(new PropertyValueFactory<>("insuranceAmount"));
    dateOfIssueTableColoumn.setCellValueFactory(new PropertyValueFactory<>("dateOfIssue"));
      
    InsuranceTableView.setItems(Accountant.readInsuranceRecordList());
        // TODO
    }    

    @FXML
    private void addInsuranceInstanceonClick(ActionEvent event) {
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("CreateInsuranceRecordScene.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            
            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            
            
            stg2.setScene(scene2);
            stg2.show();
        } catch (IOException ex) {
            Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void viewDetailsOnButton(ActionEvent event) {
        
    }

    @FXML
    private void BackOnClick(ActionEvent event) {
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("InsuranceMenuItemScene.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            
            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            
            
            stg2.setScene(scene2);
            stg2.show();
        } catch (IOException ex) {
            Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
