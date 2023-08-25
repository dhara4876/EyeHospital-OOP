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
public class UpdateMedicineListController implements Initializable {

    @FXML
    private TextField medNameTextField;
    @FXML
    private TextField medPriceTextField;
    @FXML
    private TableView<?> updateMedListTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addValuesToTableBtnOnClk(MouseEvent event) {
    }

    @FXML
    private void deleteRowFromTableTableBtnOnClk(MouseEvent event) {
    }

    @FXML
    private void goToCalculateMrdicinePriceBtnOnClk(MouseEvent event) {
    }
    
}
