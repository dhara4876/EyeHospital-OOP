/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Users.AppendableObjectOutputStream;
import Users.User;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */

    

public class Complaint implements Serializable{
    private static final long serialVersionUID = 345L;
    
    private Integer patientID;
    private String complaintreason; //resignationreason
    private LocalDate dateOfComplaint; //dateOfResignation

    public Complaint(Integer patientID, String complaint) {
        this.patientID = patientID;
        this.complaintreason = complaintreason;
        this.dateOfComplaint = LocalDate.now();
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public String getComplaint() {
        return complaintreason;
    }

    public void setComplaint(String complaint) {
        this.complaintreason = complaint;
    }

    public LocalDate getDateOfComplaint() {
        return dateOfComplaint;
    }

    public void setDateOfComplaint(LocalDate dateOfComplaint) {
        this.dateOfComplaint = dateOfComplaint;
    }

    @Override
    public String toString() {
        return "Complaint{" + "patientID=" + patientID + ", complaintreason=" + complaintreason + ", dateOfComplaint=" + dateOfComplaint + '}';
    }

    

}