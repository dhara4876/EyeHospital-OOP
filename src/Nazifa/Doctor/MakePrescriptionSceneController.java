/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Doctor;

import Users.Doctor;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        treatmentComboBox.getItems().addAll("eye cancer chemo","Lasik Surgery","Just Checkup","Normal Surgery");
        doseComboBox.getItems().addAll( "10ml", "30ml","50ml","70ml","90ml");
    }    

    @FXML
    private void prescribeButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        Parent login = null;
        try {
            login = FXMLLoader.load(getClass().getResource("Prescription.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(ViewPrescriptionSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scene scene1 = new Scene(login);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }
    
}
