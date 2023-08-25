/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Pharmacist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class UpdatePrescriptionController implements Initializable {

    @FXML
    private TableView<?> updatePrescriptionTableView;
    @FXML
    private TextField patientIDTextField;
    @FXML
    private TextField medicineNameTextField;
    @FXML
    private TextField doseTextField1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void deleteRowFromTableBtnOnClick(MouseEvent event) {
    }

    @FXML
    private void addToTableBtnOnClick(MouseEvent event) {
    }
    
}
