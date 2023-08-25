/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class UpdateMedicineList {
    
    private String medicineName;
    private int medicinePrice;

    public UpdateMedicineList(String medicineName, int medicinePrice) {
        this.medicineName = medicineName;
        this.medicinePrice = medicinePrice;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(int medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    @Override
    public String toString() {
        return "UpdateMedicineList{" + "medicineName=" + medicineName + ", medicinePrice=" + medicinePrice + '}';
    }
    
    
    
    
    
}
