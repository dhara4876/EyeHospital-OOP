/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HROfficer;

import Users.Employee;
import Users.HROfficer;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Tonmoy
 */
public class AddNewEmployeeSceneController implements Initializable {

    @FXML
    private TextField empDesignationField;
    @FXML
    private TextField empSalaryField;
    @FXML
    private DatePicker empDojDatePicker;
    @FXML
    private TextField empNameField;
    @FXML
    private TextField empEmailField;
    @FXML
    private TextField empPasswordField;
    @FXML
    private DatePicker empDOBDatePicker;
    @FXML
    private RadioButton empMaleRadioButton;
    @FXML
    private RadioButton empFemaleRadioButton;
    @FXML
    private TextField empIdField;
    @FXML
    private TableView<Employee> empTableView;
    @FXML
    private TableColumn<Employee, String> empNameColumn;
    @FXML
    private TableColumn<Employee, String> empDesignationColumn;
    @FXML
    private TableColumn<Employee, Double> empSalaryColumn;
    @FXML
    private TableColumn<Employee, LocalDate> empDojColumn;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //set Radio Buttons
        ToggleGroup tg = new ToggleGroup();
        empMaleRadioButton.setToggleGroup(tg);
        empFemaleRadioButton.setToggleGroup(tg);
        empMaleRadioButton.setSelected(true);

        empNameColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("name"));
        empDesignationColumn.setCellValueFactory(new PropertyValueFactory<Employee, String>("designation"));
        empSalaryColumn.setCellValueFactory(new PropertyValueFactory<Employee, Double>("salary"));
        empDojColumn.setCellValueFactory(new PropertyValueFactory<Employee, LocalDate >("DOJ"));

        setEmployeeList();

    }

    private void setEmployeeList() {
        ObservableList<Employee> empList = FXCollections.observableArrayList(HROfficer.getEmpList());
        empTableView.setItems(empList);
    }

    @FXML
    private void addNewEmployeeOnClick(ActionEvent event) {

        String name = empNameField.getText();
        String password = empPasswordField.getText();
        String email = empEmailField.getText();
        String gender = (empMaleRadioButton.isSelected()) ? "Male" : "Female";
        String designation = empDesignationField.getText();

        int ID = Integer.parseInt(empIdField.getText());
        Double salary = Double.parseDouble(empSalaryField.getText());
        LocalDate dob = empDOBDatePicker.getValue();
        LocalDate doj = empDojDatePicker.getValue();

        HROfficer hr = new HROfficer("Daiyan", 1000, "password", "hr@operation.com", "Male", LocalDate.of(1999, Month.MAY, 11),
                "HROfficer", 50000.0, LocalDate.of(2019, Month.NOVEMBER, 20));

        if (hr.addNewEmployee(name, ID, password, email, gender, dob, designation, salary, doj)) {

            Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setTitle("Confirmation Alert");
            a.setHeaderText(name +"is added to Employee List successfully!\n");
            a.showAndWait();
            
            setEmployeeList();
        }
    }

}
