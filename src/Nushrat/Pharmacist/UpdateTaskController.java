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
public class UpdateTaskController implements Initializable {

    @FXML
    private TextField medNameTextField;
    @FXML
    private TextField doseTextField1;
    @FXML
    private TextField instructionTextField11;
    @FXML
    private TextField timeTextField111;
    @FXML
    private TableView<?> updateTaskTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addTaskBtnOnClk(MouseEvent event) {
    }

    @FXML
    private void clearTaskBtnOnClk(MouseEvent event) {
    }
    
}
