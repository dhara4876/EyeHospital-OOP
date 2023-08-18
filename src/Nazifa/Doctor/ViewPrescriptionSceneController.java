/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Doctor;

import Model.Prescription;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ViewPrescriptionSceneController implements Initializable {

    @FXML
    private TableColumn<Prescription, Integer> doctorIDTableView;
    @FXML
    private TableColumn<Prescription, Integer> patientIDTableView;
    @FXML
    private TableColumn<Prescription, String> DiagnosisTableView;
    @FXML
    private TableColumn<Prescription, String> TreatmentTableView;
    @FXML
    private TableColumn<Prescription, String> medicineTableView;
    @FXML
    private TableColumn<Prescription, String> doseTableView;
    @FXML
    private TableColumn<Prescription, String> durationTableView;
    @FXML
    private TableView<Prescription> prescriptionTableView;
    @FXML
    private TextField searchTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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

    @FXML
    private void searchButtonOnClick(ActionEvent event) {
    }
    
}
