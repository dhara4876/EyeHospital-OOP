/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Pharmacist;



import Model.UpdatePrescription;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.util.converter.IntegerStringConverter;

/**
 * FXML Controller class
 *
 * @author user
 */
public class UpdatePrescriptionController implements Initializable {

    @FXML
    private TableView<UpdatePrescription> updatePrescriptionTableView;
    @FXML
    private TextField patientIDTextField;
    @FXML
    private TextField medicineNameTextField;
    @FXML
    private TextField doseTextField1;
    @FXML
    private TableColumn<UpdatePrescription, Integer> patientIdTableColumn;
    @FXML
    private TableColumn<UpdatePrescription, String> medicineNameTableColumn;
    @FXML
    private TableColumn<UpdatePrescription, Integer> doseTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //set up the columns in the table
        patientIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("Patient ID"));
        medicineNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("Medicine Name"));
         doseTableColumn.setCellValueFactory(new PropertyValueFactory<>("Dose"));
        
          //load dummy data
        updatePrescriptionTableView.setItems(getPeople()); 
        
        //Allow medname, dose to be edittable
        //updatePrescriptionTableView.setEditable(true);
        //medicineNameTableColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        //doseTableColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        
        
        //allow the table to select multiple rows at once
        //updatePrescriptionTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }   
    
    

    @FXML
    private void deleteRowFromTableBtnOnClick(MouseEvent event) {
        ObservableList<UpdatePrescription > selectedRows, allUpdates;
        allUpdates = updatePrescriptionTableView.getItems();
        selectedRows = updatePrescriptionTableView.getSelectionModel().getSelectedItems();
        
        for(UpdatePrescription  up: selectedRows){
            allUpdates.remove(up);
        }
    }

    @FXML
    private void addToTableBtnOnClick(MouseEvent event) {
        UpdatePrescription upPres = new UpdatePrescription( Integer.parseInt(patientIDTextField.getText()),
                                                        medicineNameTextField.getText(),
                                                        Integer.parseInt(doseTextField1.getText())
                                                        
                                       
                                      
                                    );
        updatePrescriptionTableView.getItems().add(0,upPres);
         
    }
    
    //updating medName by clicking a corresponding table cell
    //public void changeMedNameCellEvent(TableColumn.CellEditEvent<UpdatePrescription, String> edittedCell){
        //UpdatePrescription idSelected = updatePrescriptionTableView.getSelectionModel().getSelectedItem();
        //idSelected.setMedicineName(edittedCell.getNewValue());
    //}
    //updating dose by clicking a corresponding table cell
   
    //public void changeDoseCellEvent(TableColumn.CellEditEvent<UpdatePrescription, Integer> edittedCell){
        //UpdatePrescription idSelected = updatePrescriptionTableView.getSelectionModel().getSelectedItem();
        //idSelected.setDose(edittedCell.getNewValue());

    //}
     public ObservableList<UpdatePrescription> getPeople(){
        ObservableList<UpdatePrescription> people = FXCollections.observableArrayList();
        people.add(new UpdatePrescription(20, "name", 1));
        people.add(new UpdatePrescription(20, "name", 1));
        people.add(new UpdatePrescription(20, "name", 1));
        return people;
    }
    
}
