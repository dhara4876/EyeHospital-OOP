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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AddTestReportController implements Initializable {

    @FXML
    private TextField enterPatientIDTextField;
    @FXML
    private ComboBox<?> selectTestNameComboBox;
    @FXML
    private ComboBox<?> SelectStatusComboBox;
    @FXML
    private TextField enterResultTextField;
    @FXML
    private TextArea outputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addToArrayListBtnOnClick(MouseEvent event) {
    }

    @FXML
    private void createFileBtnOnClick(MouseEvent event) {
    }

    @FXML
    private void readFromTextFileBtnOnClick(MouseEvent event) {
    }
    
}
