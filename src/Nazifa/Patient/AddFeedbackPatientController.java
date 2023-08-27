/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Patient;

import Users.Patient;
import Users.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class AddFeedbackPatientController implements Initializable {
    
    private Patient patient;
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @FXML
    private TextArea feedbackTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    Alert unfill = new Alert(Alert.AlertType.WARNING, "FILL UP EVERYTHING");
    @FXML
    private void addButtonOnClick(ActionEvent event) {
        String feedback = feedbackTextArea.getText();
        if (feedback==null) {unfill.show(); return;}
        
         Boolean addStatus = User.addFeedBack(feedback);
        if (addStatus) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Feedback added");
            a.showAndWait();
        }
    }
    
}
