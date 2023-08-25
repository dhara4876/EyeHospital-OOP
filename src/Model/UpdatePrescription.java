/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class UpdatePrescription {
    private int patientId;
    private String medicineName;
    private int dose;

    public UpdatePrescription(int patientId, String medicineName, int dose) {
        this.patientId = patientId;
        this.medicineName = medicineName;
        this.dose = dose;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
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
