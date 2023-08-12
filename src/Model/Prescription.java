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
public class Prescription implements Serializable{
    private static final long serialVersionUID = 345L;
    private String patient;
    private Integer patientid;
    private String diagnosis;
    private String treatment;
    private String medicine;
    private Integer dose;
    private String duration;

    public Prescription(String patient, Integer patientid, String diagnosis, String treatment, String medicine, Integer dose, String duration) {
        this.patient = patient;
        this.patientid = patientid;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.medicine = medicine;
        this.dose = dose;
        this.duration = duration;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPatient() {
        return patient;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public String getMedicine() {
        return medicine;
    }

    public Integer getDose() {
        return dose;
    }

    public String getDuration() {
        return duration;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public void setDose(Integer dose) {
        this.dose = dose;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    
}
