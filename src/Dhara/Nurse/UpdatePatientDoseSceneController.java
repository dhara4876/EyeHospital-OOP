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
public class UpdatePatientDoseSceneController implements Initializable {

    @FXML
    private TableColumn<?, ?> PatientIdTableColoumn;
    @FXML
    private TableColumn<?, ?> medicineTableColoumn;
    @FXML
    private TableColumn<?, ?> doseTableColoumn;
    @FXML
    private TableColumn<?, ?> durationTableColoumn;
    @FXML
    private TextField enterIdPatientTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClickEditDoseButton(ActionEvent event) {
    }

    @FXML
    private void onActionsearchButton(ActionEvent event) {
    }

    @FXML
    private void onClickMarkAsCompletedButton(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }
    
}
