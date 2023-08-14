/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Accountant;

import CommonScenes.StartSceneController;
import Model.Bill;
import Users.Accountant;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class UpdateBillStatusSceneController implements Initializable {


    @FXML
    private TableColumn<Bill, Integer> patientIdTableColoumn;
    @FXML
    private TableColumn<Bill, Integer> amountTableColoumn;

    
    @FXML
    private TextField enterIdTextField;
 
    @FXML
    private Label billStatusUpdateTextField;

    /**
     * Initializes the controller class.
     */
    
     ObservableList<Bill> paidBillList = FXCollections.observableArrayList();
    ObservableList<Bill> pendingBillList = FXCollections.observableArrayList();
    @FXML
    private TableView<Bill> pendingBillTable;
    @FXML
    private TableColumn<Bill, LocalDate> dueBytableColoumn;
    @FXML
    private TableColumn<Bill, Integer> accountantIdTableColoumn;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
   
    
     amountTableColoumn.setCellValueFactory(new PropertyValueFactory<>("totalDue"));
    dueBytableColoumn.setCellValueFactory(new PropertyValueFactory<>("dueBy"));
     patientIdTableColoumn.setCellValueFactory(new PropertyValueFactory<>("patientId"));
      accountantIdTableColoumn.setCellValueFactory(new PropertyValueFactory<>("paidStatus"));
    

    Accountant.readBillLists(paidBillList, pendingBillList);

    
    pendingBillTable.setItems(pendingBillList);

        // TODO
    }    

    @FXML
    private void updateStatusButtonOnClick(ActionEvent event) {
          
  Bill selectedBill = pendingBillTable.getSelectionModel().getSelectedItem();
    if (selectedBill != null) {
        
        selectedBill.markAsPaid();
        
      
        pendingBillList.remove(selectedBill);
        paidBillList.add(selectedBill);
        
       
        Accountant.editBillListAndRewrite(paidBillList, pendingBillList);
        
       
        Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setTitle("Success");
        successAlert.setHeaderText(null);
        successAlert.setContentText("Bill paid status changed successfully!");
        successAlert.showAndWait();
    } else {
        
    }
}     
        
    

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("BillMenuItemScene.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            
            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            
            
            stg2.setScene(scene2);
            stg2.show();
        } catch (IOException ex) {
            Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void searchButtonOnClick(ActionEvent event) {
          String searchText = enterIdTextField.getText();
    FilteredList<Bill> filteredPendingBills = new FilteredList<>(pendingBillList);
    filteredPendingBills.setPredicate(bill -> {
        String lowerCaseSearchText = searchText.toLowerCase();
        return String.valueOf(bill.getPatientId()).contains(lowerCaseSearchText) ||
               String.valueOf(bill.getTotalDue()).contains(lowerCaseSearchText) ||
               String.valueOf(bill.getDueBy()).contains(lowerCaseSearchText) ||
               String.valueOf(bill.getAccountantId()).contains(lowerCaseSearchText) ||
               String.valueOf(bill.getPaidStatus()).toLowerCase().contains(lowerCaseSearchText);
    });
    pendingBillTable.setItems(filteredPendingBills);

    }

    @FXML
    private void loadAllOnClick(ActionEvent event) {
        ObservableList<Bill> paidBillList = FXCollections.observableArrayList();
    ObservableList<Bill> pendingBillList = FXCollections.observableArrayList();

    Accountant.readBillLists(paidBillList, pendingBillList);
    pendingBillTable.setItems(pendingBillList);

    
    enterIdTextField.clear();
    }
}
 
    

