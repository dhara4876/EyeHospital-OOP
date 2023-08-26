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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class makeScheduleController implements Initializable {

    @FXML
    private TextField enterIDTextField;
    @FXML
    private ComboBox<?> selectTaskComboBox;
    @FXML
    private DatePicker dateOfScheduleDatePicker;
    @FXML
    private TextField enterTimeTextField;
    @FXML
    private TableView<?> scheduleTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addScheduleToListBtnOnClk(MouseEvent event) {
    }

    @FXML
    private void clearScheduleRowBtnOnClk(MouseEvent event) {
    }
    
}
