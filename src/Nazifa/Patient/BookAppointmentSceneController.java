/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nazifa.Patient;

import Model.Appointment;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
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
public class BookAppointmentSceneController implements Initializable {

    @FXML
    private TableView<Appointment> appointmentBookingTableView;
    @FXML
    private TableColumn<Appointment, Integer> doctorIDTableColumn;
    @FXML
    private TableColumn<Appointment, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<Appointment, String> timeTableColumn;

     private ArrayList<Appointment> appointmentArrayList = new ArrayList<>();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            appointmentArrayList = Appointment.readAndReturnArrayList();
            System.out.println("appointment arrayList"+ appointmentArrayList);
            doctorIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("DoctorID"));
            dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("Date"));
            timeTableColumn.setCellValueFactory(new PropertyValueFactory<>("Time"));
            appointmentBookingTableView.setItems(FXCollections.observableArrayList(appointmentArrayList));
        } catch (IOException ex) {
            Logger.getLogger(BookAppointmentSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookAppointmentSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    

    
    
    @FXML
    private void backButtonOnClick(ActionEvent event) {
        
    }

    @FXML
    private void bookButtonOnClick(ActionEvent event) {
    }
    
}
