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
public class ExpenseRecord implements Serializable {
    private static final long serialVersionUID = 345L; 
    private Double Amount;
    private String SpentOn;
    private LocalDate DateSpent;
    private String Details;
 
    public ExpenseRecord(Double Amount, String SpentOn, LocalDate DateSpent, String Details) {
        this.Amount = Amount;
        this.SpentOn = SpentOn;
        this.DateSpent = DateSpent;
        this.Details = Details;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    public String getSpentOn() {
        return SpentOn;
    }

    public void setSpentOn(String SpentOn) {
        this.SpentOn = SpentOn;
    }

    public LocalDate getDateSpent() {
        return DateSpent;
    }

    public void setDateSpent(LocalDate DateSpent) {
        this.DateSpent = DateSpent;
    }

    @Override
    public String toString() {
        return "ExpenseRecord{" + "Amount=" + Amount + ", SpentOn=" + SpentOn + ", DateSpent=" + DateSpent + '}';
    }
    
    
    
     
}
