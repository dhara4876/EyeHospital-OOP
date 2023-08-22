/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Nurse;

import Users.Nurse;
import Users.Patient;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class AddDetailsToPatientController implements Initializable {
    private Nurse nurse;
    @FXML
    private ComboBox<Integer> patientIDCB;
    @FXML
    private TextArea patientDetailsTextArea;
    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
        System.out.println("nurse set in patientdeats"+ this.nurse.getName());
        
    }
    Alert unfill = new Alert(Alert.AlertType.WARNING, "FILL UP EVERYTHING");


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         patientIDCB.getItems().addAll(Patient.loadPatientIDs());
    }    

    @FXML
    private void addButtonOnClick(ActionEvent event) {
       Integer patientIdRead = patientIDCB.getValue();
        if (patientIdRead==null) {unfill.show(); return;}
        String details = patientDetailsTextArea.getText();
        if (details.isEmpty()){unfill.show(); return;}
       
        
        Boolean addStatus = this.nurse.addPatientDetails(patientIdRead, details, this.nurse.getID());
        if (addStatus) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("patient Details added");
            a.showAndWait();
        }
    }
  
    }
    

