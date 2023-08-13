/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Doctor;

<<<<<<< Updated upstream
import Users.Doctor;
=======
import Dhara.Accountant.AccountantDashboardController;
import Users.Doctor;
import java.io.IOException;
>>>>>>> Stashed changes
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class DoctorDashboardSceneController implements Initializable {
<<<<<<< Updated upstream
    
    private Doctor doctor;
=======
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    
>>>>>>> Stashed changes

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
<<<<<<< Updated upstream
=======

    @FXML
    private void bookingsOnClick(ActionEvent event) {
    }

    @FXML
    private void providePrescriptionOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ProvidePrescriptionScene.fxml"));
            doctorDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DoctorDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void viewPrescriptionOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ViewPrescriptionScene.fxml"));
            doctorDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DoctorDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void diagnosisChartOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("DiagnosisChart.fxml"));
            doctorDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DoctorDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @FXML
    private void signOutOnClick(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("StartScene.fxml"));
            doctorDashBoardBorderPane.setCenter(root);
        } catch (IOException ex) {
            Logger.getLogger(DoctorDashboardSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void myDashboardOnClick(MouseEvent event) {
    }

    @FXML
    private void myDeskOnClick(ActionEvent event) {
    }
>>>>>>> Stashed changes
    
}
