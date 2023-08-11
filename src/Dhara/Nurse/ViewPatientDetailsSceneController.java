/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Nurse;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ViewPatientDetailsSceneController implements Initializable {

    @FXML
    private TextField enterPatientIdTextField;
    @FXML
    private TableColumn<?, ?> patientIdTableColoumn;
    @FXML
    private TableColumn<?, ?> patientNameTableColoumn;
    @FXML
    private TableColumn<?, ?> gendertableColoumn;
    @FXML
    private TableColumn<?, ?> DOBtablecoloumn;
    @FXML
    private TableColumn<?, ?> admittedStatusTableColoumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void searchButtonOnClick(ActionEvent event) {
    }
    
}
