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
public class UpdateMedicineList {
    
    private SimpleStringProperty medicineName, medicinePrice;

    public UpdateMedicineList(String medicineName, String medicinePrice) {
        this.medicineName = new SimpleStringProperty(medicineName);
        this.medicineName = new SimpleStringProperty(medicinePrice);
        
    }
    
    
    
    

    

    public String getMedicineName() {
        return medicineName.get();
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = new SimpleStringProperty(medicineName);
    }

    public String getMedicinePrice() {
        return medicinePrice.get();
    }

    public void setMedicinePrice(String medicinePrice) {
        this.medicineName = new SimpleStringProperty(medicinePrice);
    }

    @Override
    public String toString() {
        return "UpdateMedicineList{" + "medicineName=" + medicineName + ", medicinePrice=" + medicinePrice + '}';
    }

    
    
    
    
}
