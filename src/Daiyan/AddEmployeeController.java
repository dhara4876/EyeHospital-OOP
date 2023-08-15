/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Daiyan;

import Users.HROfficer;
import Users.User;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */

 


public class AddEmployeeController implements Initializable {
       private HROfficer hrOfficer;

    public HROfficer getHrOfficer() {
        return hrOfficer;
    }

    public void setHrOfficer(HROfficer hrOfficer) {
        this.hrOfficer = hrOfficer;
    }

   
       
       
       

    @FXML
    private TextField DesignationTextField;
    @FXML
    private TextField genderTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField IDTextField;
    @FXML
    private TextField SalaryTextField;
    @FXML
    private ComboBox<String> UserTypeTextField;
    @FXML
    private DatePicker DOJdatepicker;
    @FXML
    private DatePicker DOBDatePicker;

    /**
     * Initializes the controller class.
     */
    
        Alert idNumError = new Alert(Alert.AlertType.WARNING, "Error, ID must be a number only, less than 5 digits!");
    Alert salaryNumError = new Alert(Alert.AlertType.WARNING, "Error, enter valid salary!");
    Alert idExistsError = new Alert(Alert.AlertType.WARNING, "Error, ID exists, choose another!");
    Alert passError = new Alert(Alert.AlertType.WARNING, "Error, password must be at least 6 characters long!");
    Alert emailError = new Alert(Alert.AlertType.WARNING, "Error, valid email address!");
    Alert failure = new Alert(Alert.AlertType.WARNING, "Error, add new employee failed!");
    Alert failureNull = new Alert(Alert.AlertType.WARNING, "Error, fill up all fields!");
    Alert success = new Alert(Alert.AlertType.INFORMATION, "Add employee successful!");
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
 String[] deptList = {"AccountsOfficer", "Director", "Doctor", "HROfficer", "LabTechnician", "Nurse", "Pharmacist"};
        UserTypeTextField.getItems().addAll(deptList);
        
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
    private void BackButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void addButtonOnClick(ActionEvent event) {
                String usertype = UserTypeTextField.getSelectionModel().getSelectedItem();
        
        String designation = DesignationTextField.getText();
        if (designation.isEmpty()) {failureNull.show();return;}
        
        String salaryValue = SalaryTextField.getText();
        if (salaryValue.isEmpty()) {failureNull.show();return;}
        Double salary = 0.0;
        try {
            salary = Double.parseDouble(salaryValue);
        } catch (NumberFormatException e) {salaryNumError.show();return;}
        
       
        
        String name = NameTextField.getText();
        if (name.isEmpty()) {failureNull.show();return;}
        
        String id = IDTextField.getText();
        if (id.isEmpty()) {failureNull.show();return;}
        if (!User.isNumeric(id) || id.length()>=5) {idNumError.show();return;}
        if(User.userLogin(Integer.parseInt(id), "")==2) {idExistsError.show();return;}
        int ID = Integer.parseInt(id);
        
        String password = passwordTextField.getText();
        if (password.isEmpty()) {failureNull.show();return;}
        if (password.length()<6){passError.show();return;}
        
        String email = emailTextField.getText();
        if (email.isEmpty()) {failureNull.show();return;}
        if (!email.contains("@")){emailError.show();return;}
        
        String gender = genderTextField.getText();
        if (gender.isEmpty()) {failureNull.show();return;}
       
        LocalDate DOB = DOBDatePicker.getValue();
        LocalDate DOJ = DOJdatepicker.getValue();
        
        
        if (hrOfficer.addNewEmployee(usertype, name, Integer.parseInt(id), password, email, gender, DOB, designation, salary, DOJ)) {
    success.show();
} else {
    failure.show();
}
    }
    
}
