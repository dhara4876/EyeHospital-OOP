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

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ViewInsuranceRecordSceneController implements Initializable {

    @FXML
    private TableColumn<?, ?> itemTableColoumn;
    @FXML
    private TableColumn<?, ?> InsuranceAmountTableColoumn;
    @FXML
    private TableColumn<?, ?> dateOfIssueTableColoumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addInsuranceInstanceonClick(ActionEvent event) {
    }

    @FXML
    private void viewDetailsOnButton(ActionEvent event) {
    }
    
}
