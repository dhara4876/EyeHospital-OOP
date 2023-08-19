/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Nurse;

import Users.Nurse;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Asus
 */


  
public class ViewAssignedtasksSceneController implements Initializable {
    
    private Nurse nurse; 

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
    


    @FXML
    private TableView<?> taskTableView;
    @FXML
    private TableColumn<?, ?> nameTableColoumn;
    @FXML
    private TableColumn<?, ?> designationTableColoumn;
    @FXML
    private TableColumn<?, ?> taskTableColoumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void markAsDoneOnClick(ActionEvent event) {
    }
    
}
