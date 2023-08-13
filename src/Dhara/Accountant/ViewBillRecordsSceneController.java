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
import javafx.scene.control.Button;
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
public class ViewBillRecordsSceneController implements Initializable {

    @FXML
    private TableView<Bill> billRecodsTableView;
    @FXML
    private TableColumn<Bill, Integer> patientIdTableColoumn;
    @FXML
    private TableColumn<Bill, Integer> totalTableColoumn;
    @FXML
    private TableColumn<Bill, LocalDate> billedOntableColoumn;
    @FXML
    private TableColumn<Bill, LocalDate> billedByTableColoumn;
    @FXML
    private TextField searchPatientidTextfield;
    @FXML
    private TableColumn<Bill, Boolean> paidStatusTableColoumn;
    @FXML
    private TableColumn< Bill, Integer> accountantIdTableColoumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        patientIdTableColoumn.setCellValueFactory(new PropertyValueFactory<>("patientId"));
        totalTableColoumn.setCellValueFactory(new PropertyValueFactory<>("totalDue"));
        billedOntableColoumn.setCellValueFactory(new PropertyValueFactory<>("billedOn"));
        billedByTableColoumn.setCellValueFactory(new PropertyValueFactory<>("dueBy"));
        paidStatusTableColoumn.setCellValueFactory(new PropertyValueFactory<>("paidStatus"));
        accountantIdTableColoumn.setCellValueFactory(new PropertyValueFactory<>("accountantId"));
        
        billRecodsTableView.setItems(Accountant.readBillList());
    }
        // TODO

    @FXML
    private void searchButtonOnClick(ActionEvent event) {

    String searchText = searchPatientidTextfield.getText().toLowerCase();
    ObservableList<Bill> billList = Accountant.readBillList();

    FilteredList<Bill> filteredBillList = new FilteredList<>(billList, p -> true);

        if (!searchText.isEmpty()) {
            filteredBillList.setPredicate(bill -> {
                if (bill.getPatientId().toString().contains(searchText)) {
                    return true;
                } else if (bill.getTotalDue().toString().contains(searchText)) {
                    return true;
                } else if (bill.getBilledOn().toString().contains(searchText)) {
                    return true;
                } else if (bill.getDueBy().toString().contains(searchText)) {
                    return true;
                } else if (bill.getPaidStatus().toString().contains(searchText)) {
                    return true;
                } else if (bill.getAccountantId().toString().contains(searchText)) {
                    return true;
                }
                return false;
            });
        }

    billRecodsTableView.setItems(filteredBillList);
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
    private void loadAllOnClick(ActionEvent event) {
        billRecodsTableView.setItems(Accountant.readBillList());
    }
    
}
