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
public class UpdateBillStatusSceneController implements Initializable {

    @FXML
    private TableView<?> pendingBillTableColoumn;
    @FXML
    private TableColumn<?, ?> patientIdTableColoumn;
    @FXML
    private TableColumn<?, ?> amountTableColoumn;
    @FXML
    private TableColumn<?, ?> billedOntableColoumn;
    @FXML
    private TableColumn<?, ?> billedBytableColoumn;
    @FXML
    private TextField enterIdTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void updateStatusButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void searchButtonOnClick(ActionEvent event) {
    }
    
}
