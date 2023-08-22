/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Nurse;

import Users.Nurse;
import Users.Patient;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;




/**
 * FXML Controller class
 *
 * @author Asus
 */
public class PatientInfoPdfController implements Initializable {

   
 private Nurse nurse;
    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @FXML
    private TableView<Patient> patientTableView;
    @FXML
    private TableColumn<Patient, Integer> IdTableColoumn;
    @FXML
    private TableColumn<Patient, String> NameTableColoumn;
    @FXML
    private TableColumn<Patient, String> genderTableColoumn;
    @FXML
    private TableColumn<Patient, LocalDate> DOBTableColoumn;
    @FXML
    private TableColumn<Patient, String> emailTableColoumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         IdTableColoumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        NameTableColoumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        genderTableColoumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
        DOBTableColoumn.setCellValueFactory(new PropertyValueFactory<>("DOB"));
        emailTableColoumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        
        patientTableView.setItems(Nurse.readAllPatientsList());
        // TODO
    }    

    @FXML
    private void onClickMakePdf(ActionEvent event) {
        
    }
    
}
