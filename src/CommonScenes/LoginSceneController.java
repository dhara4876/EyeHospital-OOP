/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CommonScenes;

import Daiyan.DirectorDashboardSceneController;
import Daiyan.HROfficerDashboardSceneController;
import Dhara.Accountant.AccountantDashboardController;
import Dhara.Nurse.NurseDashBoardSceneController;
import Nazifa.Doctor.DoctorDashboardSceneController;
import Nazifa.Patient.PatientDashboardSceneController;
import Nushrat.OptometristDashboardSceneController;
import Nushrat.PharmacistDashboardSceneController;
import Users.Accountant;
import Users.Director;
import Users.Doctor;
import Users.HROfficer;
import Users.Nurse;
import Users.Optometrist;
import Users.Patient;
import Users.Pharmacist;
import Users.User;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class LoginSceneController implements Initializable {

    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField enterIdTextField;
     Alert idError = new Alert(Alert.AlertType.WARNING, "Error, enter a valid ID!");
    Alert noPass = new Alert(Alert.AlertType.WARNING, "Error, enter password!");
    Alert someError = new Alert(Alert.AlertType.WARNING, "Error, enter proper login info!");
    Alert noUser = new Alert(Alert.AlertType.WARNING, "Error, user not found");
    Alert wrongPW = new Alert(Alert.AlertType.WARNING, "Error, wrong password");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClickLoginButton(ActionEvent event) {
        if (enterIdTextField.getText() == null || enterIdTextField.getText().trim().isEmpty() || !User.isNumeric(enterIdTextField.getText())){
            idError.show();
            //return;
        }
        else if (passwordTextField.getText() == null || passwordTextField.getText().trim().isEmpty()) {noPass.show();}
        else {
            try {
                int id = Integer.parseInt(enterIdTextField.getText());
                String pass = passwordTextField.getText();
                int login = User.userLogin(id, pass);
                
                switch(login){
                    case 0: someError.show(); break;        //Some exception
                    case 1: noUser.show(); break;                  //User not found in database
                    case 2: wrongPW.show(); break;                  //Authorisation failed
                    case 3:
                        System.out.println("Login Successful - Doctor");                         //Doctor authenticated
                        Parent doctorDashboard = null;
                        FXMLLoader doctorLoader = new FXMLLoader(getClass().getResource("/Nazifa/Doctor/DoctorDashboardScene.fxml"));
                        doctorDashboard = (Parent) doctorLoader.load(); // /nazifa/Doctor/DoctorWelcomeScene.fxml
                        Scene doctorScene = new Scene(doctorDashboard);
                        
                        DoctorDashboardSceneController d = doctorLoader.getController();
                        d.setDoctor((Doctor) User.getInstance(id, "Doctor"));
                        
                        Stage doctorStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        doctorStage.setScene(doctorScene);
                        doctorStage.show();
                        break;
                    case 4:
                        System.out.println("Login Successful - Patient");                          //Patient authenticated
                        Parent patientDashboard = null;
                        FXMLLoader patientLoader = new FXMLLoader(getClass().getResource("/Nazifa/Patient/PatientDashboardScene.fxml"));
                        patientDashboard = (Parent) patientLoader.load();
                        Scene patientScene = new Scene(patientDashboard);
                        
                        PatientDashboardSceneController p = patientLoader.getController();
                        p.setPatient((Patient) User.getInstance(id, "Patient"));
                        
                        Stage patientStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        patientStage.setScene(patientScene);
                        patientStage.show();
                        break;
                    case 5:
                        System.out.println("Login Successful - Pharmacist");                       //Pharmacist authenticated
                        Parent pharmacistDashboard = null;
                        FXMLLoader pharmaLoader = new FXMLLoader(getClass().getResource("/Nushrat/PharmacistDashboardScene.fxml"));
                        pharmacistDashboard = (Parent) pharmaLoader.load();
                        Scene pharmaScene = new Scene(pharmacistDashboard);
                        
                        PharmacistDashboardSceneController ph = pharmaLoader.getController();
                        ph.setPharmacist((Pharmacist) User.getInstance(id, "Pharmacist"));
                        
                        Stage pharmaStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        pharmaStage.setScene(pharmaScene);
                        pharmaStage.show();
                        break;
                    case 6:
                        System.out.println("Login Successful - Nurse");                            //Nurse authenticated
                        Parent nurseDashboard = null;
                        FXMLLoader nurseLoader = new FXMLLoader(getClass().getResource("/Dhara/Nurse/NurseDashBoardScene.fxml"));
                        nurseDashboard = (Parent) nurseLoader.load();
                        Scene nurseScene = new Scene(nurseDashboard);
                        
                        NurseDashBoardSceneController nu = nurseLoader.getController();
                        nu.setNurse((Nurse) User.getInstance(id, "Nurse"));
                        
                        Stage nurseStage  = (Stage)((Node)event.getSource()).getScene().getWindow();
                        nurseStage.setScene(nurseScene);
                        nurseStage.show();
                        break;
                    case 7:
                        System.out.println("Login Successful - Director");                //Managing Director authenticated
                        Parent directorDashboard = null;
                        FXMLLoader directorLoader = new FXMLLoader(getClass().getResource("/Daiyan/DirectorDashboardScene.fxml"));
                        directorDashboard = (Parent) directorLoader.load();
                        Scene directorScene = new Scene(directorDashboard);
                        
                        DirectorDashboardSceneController di = directorLoader.getController();
                        di.setDirector((Director) User.getInstance(id, "Director"));
                        
                        Stage directorStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        directorStage.setScene(directorScene);
                        directorStage.show();
                        break;
                    case 8:
                        System.out.println("Login Successful - Accountant");                  //Accounts Officer authenticated
                        Parent accountsOfficerDashboard = null;
                        FXMLLoader accountsLoader = new FXMLLoader(getClass().getResource("/Dhara/Accountant/AccountantDashboard.fxml"));
                        accountsOfficerDashboard = (Parent) accountsLoader.load();
                        Scene accountsScene = new Scene(accountsOfficerDashboard);
                        
                        AccountantDashboardController a = accountsLoader.getController();
                        a.setAccountant((Accountant) User.getInstance(id, "AccountsOfficer"));
                        
                        Stage accountsStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        accountsStage.setScene(accountsScene);
                        accountsStage.show();
                        break;
                    case 9:
                        System.out.println("Login Successful - HR Officer");                       //HR Officer authenticated
                        Parent HRDashboard = null;
                        FXMLLoader HRLoader = new FXMLLoader(getClass().getResource("/Daiyan/HROfficerDashboardScene.fxml"));
                        HRDashboard = (Parent) HRLoader.load();
                        Scene HRScene = new Scene(HRDashboard);
                        
                        HROfficerDashboardSceneController hr = HRLoader.getController();
                        hr.setHrOfficer((HROfficer) User.getInstance(id, "HROfficer"));
                        
                        Stage hrStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        hrStage.setScene(HRScene);
                        hrStage.show();
                        break;
                    case 10:
                        System.out.println("Login Successful - Optometrist");                   //Lab Technician authenticated
                        Parent OptometristDashboard = null;
                        FXMLLoader labLoader = new FXMLLoader(getClass().getResource("/Nushrat/OptometristDashboardScene.fxml"));
                        OptometristDashboard = (Parent) labLoader.load();
                        Scene labScene = new Scene(OptometristDashboard);
                        
                        OptometristDashboardSceneController o = labLoader.getController();
                        o.setOptometrist((Optometrist) User.getInstance(id, "Optometrist"));
                        
                        Stage labStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        labStage.setScene(labScene);
                        labStage.show();
                        break;
                }   } catch (IOException ex) {
                Logger.getLogger(LoginSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
  
        
        
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("StartScene.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            
            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            
            
            stg2.setScene(scene2);
            stg2.show();
        } catch (IOException ex) {
            Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
