/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Asus
 */
public class InsuranceRecord implements Serializable{
    private static final long serialVersionUID = 345L;
    
    private String item;
    private Double insuranceAmount;
    private LocalDate dateOfIssue;

    public InsuranceRecord(String item, Double insuranceAmount, LocalDate dateOfIssue) {
        this.item = item;
        this.insuranceAmount = insuranceAmount;
        this.dateOfIssue = dateOfIssue;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(Double insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @Override
    public String toString() {
        return "InsuranceRecord{" + "item=" + item + ", insuranceAmount=" + insuranceAmount + ", dateOfIssue=" + dateOfIssue + '}';
    }
    
    
    
}
