/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author user
 */
public class UpdatePrescription {
     private SimpleStringProperty medicineName;
    private Integer patientId;
    
    private Integer dose;

    public UpdatePrescription(Integer patientId, String medicineName, Integer dose) {
        this.patientId = patientId;
        this.medicineName = new SimpleStringProperty(medicineName);
       
        this.dose = dose;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getMedicineName() {
        return medicineName.get();
        
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = new SimpleStringProperty(medicineName);
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    @Override
    public String toString() {
        return "UpdateMedicine{" + "patientId=" + patientId + ", medicineName=" + medicineName + ", dose=" + dose + '}';
    }
    
    
    
}
