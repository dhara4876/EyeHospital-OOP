/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Pharmacist;

import Model.Medicine;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class CalculateMedicinePriceController implements Initializable {

    @FXML
    private TableView<Medicine> medListTableView;
    @FXML
    private TextField medNameTextField;
    @FXML
    private TextField unitPriceTextField1;
    @FXML
    private TextField doseOrQuantityTextField11;
    @FXML
    private TableColumn<Medicine, String> medNameTableColumn;
    @FXML
    private TableColumn<Medicine, Integer> unitPriceTableColumn;
    @FXML
    private TableColumn<Medicine, Integer> doseTableColumn;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        medNameTableColumn.setCellValueFactory(new PropertyValueFactory<Medicine,String>("Medicine Name"));
        unitPriceTableColumn.setCellValueFactory(new PropertyValueFactory<Medicine,Integer>("Unit Price"));
         doseTableColumn.setCellValueFactory(new PropertyValueFactory<Medicine,Integer>("Dose/Quantity"));
        
          medListTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    

    @FXML
    private void addToListBtnOnClick(MouseEvent event) {
        Medicine newSchedule = new Medicine(
                medNameTableColumn.getText(),
                                       Integer.parseInt(unitPriceTableColumn.getText()),
                                       Integer.parseInt(doseTableColumn.getText())
                                       
                                    );
        //tableView.getItems().add(0,newPerson);
        medListTableView.getItems().add(newSchedule);
        
    }
    public ObservableList<Medicine> getSchedule(){
        ObservableList<Medicine> values = FXCollections.observableArrayList();
        
        
        
        return values;
    } 

    
    
    
}
