package Nazifa.Patient;

import Model.Appointment;
import Users.Patient;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class BookAppointmentSceneController implements Initializable {
    
    private Patient patient;
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @FXML
    private TableView<Appointment> appointmentBookingTableView;
    @FXML
    private TableColumn<Appointment, Integer> doctorIDTableColumn;
    @FXML
    private TableColumn<Appointment, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<Appointment, String> timeTableColumn;

    private ObservableList<Appointment> appointmentArrayList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            appointmentArrayList = Appointment.readAndReturnArrayList();
            System.out.println("appointment arrayList" + appointmentArrayList);

            doctorIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("DoctorID"));
            dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("Date"));
            timeTableColumn.setCellValueFactory(new PropertyValueFactory<>("Time"));

            appointmentBookingTableView.setItems(appointmentArrayList);
        } catch (IOException ex) {
            Logger.getLogger(BookAppointmentSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookAppointmentSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        // Code for handling the back button click
    }

    @FXML
    private void bookButtonOnClick(ActionEvent event) {
        // Code for handling the book button click
    }
}
