/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Accountant;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ViewExpenseRecordSceneController implements Initializable {

    @FXML
    private TableColumn<?, ?> amountTableColoumn;
    @FXML
    private TableColumn<?, ?> spentOnTableColoumn;
    @FXML
    private TableColumn<?, ?> dateSpenttableColoumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
