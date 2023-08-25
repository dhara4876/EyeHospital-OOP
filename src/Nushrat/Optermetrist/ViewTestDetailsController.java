/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;

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
public class ViewTestDetailsController implements Initializable {

    @FXML
    private TextField enterPatientIdTextField;
    @FXML
    private TextField enterTestResultsTextField1;
    @FXML
    private TextField enterTestingEquipmentsTextField11;
    @FXML
    private TextField enterDoctorNameTextField;
    @FXML
    private ComboBox<?> selectTestNameComboBox;
    @FXML
    private ComboBox<?> selectRecommendationComboBox1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void popupViewTestDetailsBtnOnClick(MouseEvent event) {
    }
    
}
