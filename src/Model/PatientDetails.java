/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class PatientDetails implements Serializable {
    private static final long serialVersionUID = 345L;
    
    private Integer patientID;
    private String patientDetails;
    private Integer nurseId;

    public PatientDetails(Integer patientID, String patientDetails, Integer nurseId) {
        this.patientID = patientID;
        this.patientDetails = patientDetails;
        this.nurseId = nurseId;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
        this.patientID = patientID;
    }

    public String getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(String patientDetails) {
        this.patientDetails = patientDetails;
    }

    public Integer getNurseId() {
        return nurseId;
    }

    public void setNurseId(Integer nurseId) {
        this.nurseId = nurseId;
    }

    @Override
    public String toString() {
        return "PatientDetails{" + "patientID=" + patientID + ", patientDetails=" + patientDetails + ", nurseId=" + nurseId + '}';
    }
    
    
    
}
