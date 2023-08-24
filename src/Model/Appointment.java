/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

/**
 *
 * @author Asus
 */
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

    public static ArrayList<Appointment> readAndReturnArrayList() throws IOException, ClassNotFoundException {

        FileInputStream fis = null;
        try {

            fis = new FileInputStream("Appointment.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Appointment> appointmentArrayList = new ArrayList<>();

            try {
                // The File reading starts
                while (true) {
                    Object obj = ois.readObject();
                    if (obj instanceof Appointment) {
                        Appointment deserializedAppointment = (Appointment) obj;
                        System.out.println(deserializedAppointment.toString());
                        appointmentArrayList.add(deserializedAppointment);
                    }
                }
            } catch (EOFException e) {
                // End of file reached (EOFException thrown)
                // No more objects to read, so we stop the loop
                System.out.println("FIle has been read to the end.");
            }
            ois.close();
            fis.close();
            return appointmentArrayList; // return the read objects as deserialized objects ArrayList

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
            // File not found Exception (EOFException thrown)
            System.out.println("File was not found.");
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Appointment.class.getName()).log(Level.SEVERE, null, ex);
                // File opening exception
            }
        }
        return null; // Return Null if file couldn't be read
    }
}
