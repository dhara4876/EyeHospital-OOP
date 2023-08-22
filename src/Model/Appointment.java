/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.time.LocalDate;

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
    
        
}
