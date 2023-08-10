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
public class Diagnosis implements Serializable{
    private static final long serialVersionUID = 345L;
    
    private String diagnosisName;
    private Double treatmentCost;

    public Diagnosis(String diagnosisName, Double treatmentCost) {
        this.diagnosisName = diagnosisName;
        this.treatmentCost = treatmentCost;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public Double getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(Double treatmentCost) {
        this.treatmentCost = treatmentCost;
    }

    @Override
    public String toString() {
        return "Diagnosis{" + "diagnosisName=" + diagnosisName + ", treatmentCost=" + treatmentCost + '}';
    }
    
    
    
    
    
}
