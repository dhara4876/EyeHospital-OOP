/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Nurse;

import Users.Nurse;
import Users.Patient;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class DischargePatientController implements Initializable {
 private Nurse nurse; 
    @FXML
    private TableColumn<Patient, Integer> patientIDTableColoumn;
    @FXML
    private TableColumn<Patient, Boolean> admittedPatientTableColoumn;
    
 ObservableList<Patient> admittedPatientList = FXCollections.observableArrayList();
    ObservableList<Patient> nonAdmittedPatientList = FXCollections.observableArrayList();
    @FXML
    private TableView<Patient> patientTableView;

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         patientIDTableColoumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        admittedPatientTableColoumn.setCellValueFactory(new PropertyValueFactory<>("admittedStatus"));

        Nurse.readPatientLists(admittedPatientList, nonAdmittedPatientList);
        System.out.println("printing" + admittedPatientList + "list 2" + nonAdmittedPatientList);

        patientTableView.setItems(admittedPatientList);

    }    

    @FXML
    private void dischargePatientOnAction(ActionEvent event) {
        Patient selectedPatient = patientTableView.getSelectionModel().getSelectedItem();
        if (selectedPatient != null) {

            selectedPatient.markAsadmitted();

            nonAdmittedPatientList.remove(selectedPatient);
            admittedPatientList.add(selectedPatient);

            Nurse.updatePatientAdmittedStatus(admittedPatientList, nonAdmittedPatientList);

            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setTitle("Success");
            successAlert.setHeaderText(null);
            successAlert.setContentText("Patient discharged successfully!");
            successAlert.showAndWait();
        } else {

        }
    }
    
}
