/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Doctor;

import Users.Patient;
import java.net.URL;
import java.util.ResourceBundle;
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
    private ComboBox<String> durationConboBox;
    @FXML
    private ComboBox<String> medicineComboBox;
    @FXML
    private ComboBox<String> treatmentComboBox;
    @FXML
    private ComboBox<Integer> doseComboBox;
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
        ObservableList<Patient> namedata = FXCollections.observableArrayList(new Patient("Asif", 111),new Patient("Alif", 222),new Patient("Afif", 333));
        prescribePatientTableView.setItems(namedata);
    }    

    @FXML
    private void prescribeOnClick(ActionEvent event) {
    }
    
}
