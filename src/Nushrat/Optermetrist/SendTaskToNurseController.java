/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class SendTaskToNurseController implements Initializable {

    @FXML
    private TextField enterAssignerIdTextField;
    @FXML
    private TextField enterReceiverIdTextField;
    @FXML
    private TextArea writeTaskDetailsTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void alertCompleteBtnOnClick(MouseEvent event) {
    }

    @FXML
    private void alertIncompleteBtnOnClick(MouseEvent event) {
    }

    @FXML
    private void dashboardBtnOnClick(MouseEvent event) {
    }
    
}
