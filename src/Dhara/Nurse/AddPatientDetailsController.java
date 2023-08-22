/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Nurse;

import Model.Cart;
import Users.Nurse;
import Users.Patient;
import java.net.URL;
import java.time.LocalDate;
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
public class AddPatientDetailsController implements Initializable {
private Nurse nurse; 
    @FXML
    private ComboBox<Integer> patientIDComboBox;
    @FXML
    private TextArea detailsTextField;
    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
    /**
     * Initializes the controller class.
     */
    Alert unfill = new Alert(Alert.AlertType.WARNING, "FILL UP EVERYTHING");
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         patientIDComboBox.getItems().addAll(Patient.loadPatientIDs());

        // TODO
    }    

    @FXML
    private void addButtonOnClick(ActionEvent event) {
       
        

        Integer patientIdRead = patientIDComboBox.getValue();
        if (patientIdRead==null) {unfill.show(); return;}
        String details = detailsTextField.getText();
        if (details.isEmpty()){unfill.show(); return;}
       
        
        Boolean addStatus = this.nurse.addPatientDetails(patientIdRead, details, this.nurse.getID());
        if (addStatus) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("patient Details added");
            a.showAndWait();
        }
    }
    
}
