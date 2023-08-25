/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Pharmacist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class OrderMedicineController implements Initializable {

    @FXML
    private TextField medNameTextField;
    @FXML
    private TextField medAmountTextField1;
    @FXML
    private ComboBox<?> selectLocationComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void popUpOrderConfirmBtnOnClick(MouseEvent event) {
    }

    @FXML
    private void dashboardBtnOnClick(MouseEvent event) {
    }
    
}
