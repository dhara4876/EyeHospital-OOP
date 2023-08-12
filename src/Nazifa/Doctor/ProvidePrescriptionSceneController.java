/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Doctor;

import Model.Cart;
import Model.Medicine;
import Model.Treatment;
import Users.Patient;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ProvidePrescriptionSceneController implements Initializable {

    @FXML
    private ComboBox<String> diagnosisComboBox;
    @FXML
    private ComboBox<String> durationComboBox;
    @FXML
    private ComboBox<String> medicineComboBox;
    @FXML
    private ComboBox<String> treatmentComboBox;
    @FXML
    private ComboBox<String> doseComboBox;
    @FXML
    private TableColumn<Patient, Integer> patientIDTableViewColumn;
    @FXML
    private TableView<Patient> prescribePatientTableView;
    @FXML
    private TableColumn<Patient, String> patientNameTableViewColumn;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        diagnosisComboBox.getItems().addAll("eye cancer", "Poor eyesight", "Just Checkup", "Normal Surgery");
        durationComboBox.getItems().addAll("one week", "one month","six months", "one year");
        medicineComboBox.getItems().addAll("Square painkiller", "Beximco Eye Drop", "BD eye hospital special medicine", "Poison", "Eye Cancer drops");
        treatmentComboBox.getItems().addAll("eye cancer chemo","Lasik Surgery","Just Checkup","Normal Surgery");
        doseComboBox.getItems().addAll( "10ml", "30ml","50ml","70ml","90ml");
        
        patientNameTableViewColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
        patientIDTableViewColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getID()));

        prescribePatientTableView.getItems().addAll(new Patient("John", 30, "Engineer", "abc", "g", LocalDate.now()));
    }    
    
        
    @FXML
    private void prescribeOnClick(ActionEvent event) {
    }
    
}
