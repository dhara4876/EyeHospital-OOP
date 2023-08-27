/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Pharmacist;



import Model.UpdateMedicineList;
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
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.util.converter.IntegerStringConverter;

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
    private TableView<UpdateMedicineList> updateMedListTableView;
    @FXML
    private TableColumn<UpdateMedicineList, String> medNameTableColumn;
    @FXML
    private TableColumn<UpdateMedicineList, String> medPriceTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //set up the columns in the table
         medNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("Medicine Name"));
        medPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("Medicine Price"));
    
        //Allow price to be edittable
        /*updateMedListTableView.setEditable(true);
        medNameTableColumn.setCellFactory(TextFieldTableCell.forTableColumn());
       medPriceTableColumn.setCellFactory(TextFieldTableCell.forTableColumn());*/
        
        //load dummy data
        updateMedListTableView.setItems(getPeople());
      
        
        
        
        
    
    }    

    @FXML
    private void addValuesToTableBtnOnClk(MouseEvent event) {
        UpdateMedicineList newReview = new UpdateMedicineList(medNameTextField.getText(),
                                       medPriceTextField.getText()
                                       
                                    );
        updateMedListTableView.getItems().add(0,newReview);
        
        
    }
    
    
    
    public ObservableList<UpdateMedicineList> getPeople(){
        ObservableList<UpdateMedicineList> people = FXCollections.observableArrayList();
        people.add(new UpdateMedicineList("napa", "20"));
         people.add(new UpdateMedicineList("napa", "20"));
          people.add(new UpdateMedicineList("napa", "20"));
        
        
        
        return people;
    } 


    @FXML
    private void deleteRowFromTableTableBtnOnClk(MouseEvent event) {
        ObservableList<UpdateMedicineList> selectedRows, allPeople;
        allPeople = updateMedListTableView.getItems();
        selectedRows = updateMedListTableView.getSelectionModel().getSelectedItems();
        
        for(UpdateMedicineList a: selectedRows){
            allPeople.remove(a);
        }
    }

    
}
