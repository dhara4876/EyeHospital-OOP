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
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ViewAdmittedPatientsSceneController implements Initializable {

    @FXML
    private TableView<?> admittedPatientsTableColoumn;
    @FXML
    private TableColumn<?, ?> patientIdTableColoumn;
    @FXML
    private TableColumn<?, ?> patientNameTableColoumn;
    @FXML
    private TableColumn<?, ?> genderTableColoumn;
    @FXML
    private TableColumn<?, ?> DOBTableColoumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewPrescriptionOnClick(ActionEvent event) {
    }

    @FXML
    private void viewDosageOnClick(ActionEvent event) {
    }
    
}