package Model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Appointment implements Serializable {
    private static final long serialVersionUID = 345L;

    private Integer DoctorID;
    private Integer PatientID;
    private LocalDate Date;
    private String Time;
    private Boolean CompletedStatus;

    public void markAsBooked() {
        this.CompletedStatus = true;
    }

    public Appointment(Integer DoctorID, LocalDate Date, String Time) {
        this.DoctorID = DoctorID;
        this.Date = Date;
        this.Time = Time;
        this.PatientID = null;
        this.CompletedStatus = false;
    }

    public static ObservableList<Appointment> readAndReturnArrayList() throws IOException, ClassNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream ois = null; // Added this line

        try {
            fis = new FileInputStream("Appointment.bin");
            ObservableList<Appointment> appointmentArrayList = FXCollections.observableArrayList(); // Fixed typo

            ois = new ObjectInputStream(fis); // Added this line

            try {
                while (true) {
                    Object obj = ois.readObject();
                    if (obj instanceof Appointment) {
                        Appointment deserializedAppointment = (Appointment) obj;
                        System.out.println(deserializedAppointment.toString());
                        appointmentArrayList.add(deserializedAppointment);
                    }
                }
            } catch (EOFException e) {
                System.out.println("File has been read to the end.");
            }
            // Moved ois.close() and fis.close() outside the catch block
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File was not found.");
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
