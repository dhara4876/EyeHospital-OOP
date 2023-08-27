/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Doctor;

import Model.Treatment;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class AddTreatmentController implements Initializable {

    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @FXML
    private TextField treatmentNameTextField;
    @FXML
    private TextField treatmentPriceTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void backButtonOnclick(ActionEvent event) throws IOException {
        Parent parent = null;
        FXMLLoader doctorLoader = new FXMLLoader(getClass().getResource("DocDashboard.fxml"));
        parent = (Parent) doctorLoader.load();
        Scene doctorScene = new Scene(parent);

        DocDashboardController d = doctorLoader.getController();
        d.setDoctor(this.doctor);

        Stage doctorStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        doctorStage.setScene(doctorScene);
        doctorStage.show();

    }

    @FXML
    private void addTreatmentButtonOnClick(ActionEvent event) {

        String treatmentName = treatmentNameTextField.getText();
        String priceText = treatmentPriceTextField.getText();

        if (treatmentName.isEmpty() || priceText.isEmpty()) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("Error: Please fill in all information.");
            errorAlert.showAndWait();
            return;
        }

        try {
            int price = Integer.parseInt(priceText);
            if (price <= 0) {
                throw new NumberFormatException();
            }

            Treatment treatment = new Treatment(treatmentName, price);
            Doctor.addTreatmentData(treatment);

            treatmentNameTextField.clear();
            treatmentPriceTextField.clear();

            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setHeaderText(null);
            successAlert.setContentText("Treatment item added successfully.");
            successAlert.showAndWait();

        } catch (NumberFormatException e) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("Error: Please enter a valid treatment price (positive integer).");
            errorAlert.showAndWait();
        }

        /*String treatmentName = treatmentNameTextField.getText();
        String priceText = treatmentPriceTextField.getText();

        if (!treatmentName.isEmpty() && !priceText.isEmpty()) {
            try {
                int price = Integer.parseInt(priceText);
                Treatment treatment = new Treatment(treatmentName, price); // Create a Treatment object
                Doctor.addTreatmentData(treatment); // Add the treatment to the Doctor's treatment list

                treatmentNameTextField.clear();
                treatmentPriceTextField.clear();

                // Optionally notify user of successful addition
            } catch (NumberFormatException e) {
                // Handle invalid price format
            }
        }

    }*/
    }
}
