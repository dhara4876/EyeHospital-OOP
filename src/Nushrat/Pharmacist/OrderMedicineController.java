/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Pharmacist;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
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
    private ComboBox<String> selectLocationComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        selectLocationComboBox.getItems().addAll("Main Hospital" , "The clinic", "The 2nd Branch");
        
    }    

    @FXML
    private void popUpOrderConfirmBtnOnClick(MouseEvent event) {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Confirmation Alert");
        a.setHeaderText("Your Order is placed");
        a.setContentText("Details: \n Medicine Name: "+medNameTextField.getText()+"\n Amount: "+Integer.parseInt(medAmountTextField1.getText())+ 
                "\n Location: " + selectLocationComboBox.getValue() );
                
        
    }

 
    
    
}
