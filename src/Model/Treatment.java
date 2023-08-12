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
public class Treatment implements Serializable{
    private static final long serialVersionUID = 345L;
    
    private String treatmentName;
    private Integer treatmentCost;

    public Treatment(String treatmentName, Integer treatmentCost) {
        this.treatmentName = treatmentName;
        this.treatmentCost = treatmentCost;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public Integer getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(Integer treatmentCost) {
        this.treatmentCost = treatmentCost;
    }

    @Override
    public String toString() {
        return "Treatment{" + "treatmentName=" + treatmentName + ", treatmentCost=" + treatmentCost + '}';
    }

   
    
    
}
