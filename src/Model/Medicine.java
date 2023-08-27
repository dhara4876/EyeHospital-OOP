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
public class Medicine implements Serializable{
    private static final long serialVersionUID = 345L;
    
    private String medicineName;
    private Integer medicinePrice;
    private Integer dose;

    public Medicine(String medicineName, Integer medicinePrice, Integer dose) {
        this.medicineName = medicineName;
        this.medicinePrice = medicinePrice;
        this.dose = dose;
    }

    

    public Integer getDose() {
        return dose;
    }

    public void setDose(Integer dose) {
        this.dose = dose;
    }
    

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public Integer getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(Integer medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    @Override
    public String toString() {
        return "Medicine{" + "medicineName=" + medicineName + ", medicinePrice=" + medicinePrice + ", dose=" + dose + '}';
    }

    
    
    
    
    
}
