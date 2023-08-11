/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Accountant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ViewBillRecordsSceneController implements Initializable {

    @FXML
    private TableView<?> billRecodsTableView;
    @FXML
    private TableColumn<?, ?> patientIdTableColoumn;
    @FXML
    private TableColumn<?, ?> totalTableColoumn;
    @FXML
    private TableColumn<?, ?> billedOntableColoumn;
    @FXML
    private TableColumn<?, ?> billedByTableColoumn;
    @FXML
    private TextField searchPatientidTextfield;
    @FXML
    private TextField showTotalTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClickPatientsButton(ActionEvent event) {
    }

    @FXML
    private void searchButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }
    
}
