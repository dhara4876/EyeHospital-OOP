/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CommonScenes;

import Users.Accountant;
import Users.Director;
import Users.Doctor;
import Users.Employee;
import Users.HROfficer;
import Users.Nurse;
import Users.Optometrist;
import Users.Patient;
import Users.Pharmacist;
import Users.User;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class EmployeeRegisterSceneController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField passwordtextField;
    @FXML
    private DatePicker DOBDatePicker;
    @FXML
    private TextField designationtextField;
    @FXML
    private TextField salaryTextField;

    /**
     * Initializes the controller class.
     * 
     */
    Alert idNumError = new Alert(Alert.AlertType.WARNING, "Error, ID must be a number only less than or equal to 2 digits");
    Alert idExistsError = new Alert(Alert.AlertType.WARNING, "Error, ID exists, choose another!");
    Alert passError = new Alert(Alert.AlertType.WARNING, "Error, password must be at least 6 characters long!");
    Alert emailError = new Alert(Alert.AlertType.WARNING, "Error, valid email address!");
    Alert failure = new Alert(Alert.AlertType.WARNING, "Error, sign up failed!");
    Alert failureNull = new Alert(Alert.AlertType.WARNING, "Error, fill up all fields!");
    Alert success = new Alert(Alert.AlertType.INFORMATION, "Sign up successful!");
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField genderTextField;
    @FXML
    private DatePicker dojDatePicker;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
           DOBDatePicker.setDayCellFactory(dp -> new DateCell(){
            @Override
            public void updateItem(LocalDate date, boolean empty) {
                super.updateItem(date, empty);
                if (date.isAfter(LocalDate.now())) {
                    setDisable(true);
                }
            }
        });
    }   


    

    @FXML
    private void addButtonOnClick(ActionEvent event) {
            String name = nameTextField.getText();
        if (name.isEmpty()) {failureNull.show();return;}
        
        String id = idTextField.getText();
        if (id.isEmpty()) {failureNull.show();return;}
        if (!(User.isNumeric(id) ||id.length()<=2)) {idNumError.show();return;}
        if(User.userLogin(Integer.parseInt(id), "")==2) {idExistsError.show();return;}
        int ID = Integer.parseInt(id);
        
        String password = passwordtextField.getText();
        if (password.isEmpty()) {failureNull.show();return;}
        if (password.length()<6){passError.show();return;}
        
        String email = emailTextField.getText();
        if (email.isEmpty()) {failureNull.show();return;}
        if (!email.contains("@")){emailError.show();return;}
        
        String gender = genderTextField.getText();
        if (gender.isEmpty()) {failureNull.show();return;}
        
        
        LocalDate DOB = DOBDatePicker.getValue();
        if (DOB==null) {failureNull.show();return;}
        
        String designation = designationtextField.getText();
        if (designation.isEmpty()) {failureNull.show();return;}
        
        Double salary = Double.parseDouble(salaryTextField.getText());
        if (designation.isEmpty()) {failureNull.show();return;}
        
        LocalDate doj = dojDatePicker.getValue();
        if (doj==null) {failureNull.show();return;}
        
        
       String employeeType = designationtextField.getText();
    employeeType = employeeType.toLowerCase();
    
    Employee toAdd;
    
    if (employeeType.equals("accountant")) {
        toAdd = new Accountant(name, ID, password, email, gender, DOB, designation, salary, doj);
    } else if (employeeType.equals("director")) {
        toAdd = new Director(name, ID, password, email, gender, DOB, designation, salary, doj);
    } else if (employeeType.equals("doctor")) {
        toAdd = new Doctor(name, ID, password, email, gender, DOB, designation, salary, doj);
    } else if (employeeType.equals("optometrist")) {
        toAdd = new Optometrist(name, ID, password, email, gender, DOB, designation, salary, doj);
    } else if (employeeType.equals("nurse")) {
        toAdd = new Nurse(name, ID, password, email, gender, DOB, designation, salary, doj);
    } else if (employeeType.equals("pharmacist")) {
        toAdd = new Pharmacist(name, ID, password, email, gender, DOB, designation, salary, doj);
    } else if (employeeType.equals("hrofficer")) {
        toAdd = new HROfficer(name, ID, password, email, gender, DOB, designation, salary, doj);
    } else {
        
        return;
    }
    
if (toAdd.Register()) {
        success.show();
    } else {
        failure.show();
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
            Logger.getLogger(RegisterSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    }
    

