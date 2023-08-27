/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Doctor;


import Model.Treatment;
import Users.Doctor;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class MakePrescriptionSceneController implements Initializable {

    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @FXML
    private ComboBox<String> diagnosisComboBox;
    @FXML
    private ComboBox<String> medicineComboBox;
    @FXML
    private ComboBox<String> treatmentComboBox;
    
    @FXML
    private ComboBox<String> doseComboBox;
    @FXML
    private ComboBox<String> durationComboBox;
    @FXML
    private TextField doctorIDTextField;
    @FXML
    private TextField PatientIDTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       diagnosisComboBox.getItems().addAll("eye cancer", "Poor eyesight", "Just Checkup", "Normal Surgery");
        durationComboBox.getItems().addAll("one week", "one month","six months", "one year");
        medicineComboBox.getItems().addAll("Square painkiller", "Beximco Eye Drop", "BD eye hospital special medicine", "Poison", "Eye Cancer drops");
       
        doseComboBox.getItems().addAll( "10ml", "30ml","50ml","70ml","90ml");
       // List<Treatment> doctorTreatments = Doctor.getTreatmentData();
       // List<String> treatmentNames = new ArrayList<>();
        
       // for (Treatment treatment : doctorTreatments) {
        //    treatmentNames.add(treatment.getTreatmentName()); 
        //}
         ArrayList<String> treatmentNames = Doctor.readTreatmentNames();
        treatmentComboBox.getItems().addAll(treatmentNames);
    
    }    

    @FXML
    private void prescribeButtonOnClick(ActionEvent event) {
        String diagnosis = diagnosisComboBox.getValue();
        String medicine = medicineComboBox.getValue();
        String TreatmentName = treatmentComboBox.getValue();
        String dose = doseComboBox.getValue();
        String duration = durationComboBox.getValue();
        /*Prescription selectedPrescription = new Prescription(selectedTreatmentName, ...); // You'll need to provide the necessary parameters*/
        diagnosisComboBox.getSelectionModel().clearSelection();
        medicineComboBox.getSelectionModel().clearSelection();
        treatmentComboBox.getSelectionModel().clearSelection();
        doseComboBox.getSelectionModel().clearSelection();
        durationComboBox.getSelectionModel().clearSelection();
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
        Parent parent = null;
        FXMLLoader doctorLoader = new FXMLLoader(getClass().getResource("Prescription.fxml"));
        parent = (Parent) doctorLoader.load();
        Scene doctorScene = new Scene(parent);

        PrescriptionController d = doctorLoader.getController();
        d.setDoctor(this.doctor);

        Stage doctorStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        doctorStage.setScene(doctorScene);
        doctorStage.show();
    }
    
}
