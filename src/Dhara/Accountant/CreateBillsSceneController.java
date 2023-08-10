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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class CreateBillsSceneController implements Initializable {

    @FXML
    private ComboBox<?> treatmentComboBox;
    @FXML
    private ComboBox<?> medicineComboBox;
    @FXML
    private ComboBox<?> treatmentQuantityComboBox;
    @FXML
    private ComboBox<?> medicineQuantityComboBox;
    @FXML
    private Label treatmentPriceLabel;
    @FXML
    private ComboBox<?> patientComboBox;
    @FXML
    private Label patientNameLabel;
    @FXML
    private TextArea totalOutputTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClickTreatmentComboBox(ActionEvent event) {
    }

    @FXML
    private void onClickMedsComboBox(ActionEvent event) {
    }

    @FXML
    private void treatmentQuantityComboBox(ActionEvent event) {
    }

    @FXML
    private void onClickMedQuantityCombobox(ActionEvent event) {
    }

    @FXML
    private void onClickPatientComboBox(ActionEvent event) {
    }

    @FXML
    private void onClickBilledOnDatePicker(ActionEvent event) {
    }

    @FXML
    private void onClickDueByDatePicker(ActionEvent event) {
    }

    @FXML
    private void addBillOnClick(ActionEvent event) {
    }

    @FXML
    private void onClickAddTreatmentButton(ActionEvent event) {
    }

    @FXML
    private void onClickAddMedicineButton(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }
    
}
