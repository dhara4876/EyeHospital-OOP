/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Doctor;

import Model.Appointment;
import Users.Accountant;
import Users.Doctor;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ViewAppointmentsController implements Initializable {
    
    private Doctor doctor;
    

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @FXML
    private TableView<Appointment> appointmentTableView;
    @FXML
    private TableColumn<Appointment, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<Appointment, String> timeTableColumn;
    @FXML
    private TableColumn<Appointment, Boolean> completedStatusTableColumn;
    @FXML
    private TableColumn<Appointment, Integer> doctorIDTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        doctorIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("DoctorID"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("Date"));
        timeTableColumn.setCellValueFactory(new PropertyValueFactory<>("Time"));
        completedStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("CompletedStatus"));

        appointmentTableView.setItems(Doctor.readAppointmentList());
    }    
    
}
