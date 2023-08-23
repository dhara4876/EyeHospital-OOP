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
public class Resignation implements Serializable{
     private static final long serialVersionUID = 345L;
    private Integer employeeID;
    private String resignationReason;
    private LocalDate dateOfResignation;

    public Resignation(Integer employeeID, String resignationReason) {
        this.employeeID = employeeID;
        this.resignationReason = resignationReason;
        this.dateOfResignation = LocalDate.now();
        
        
        
        
        
    }

    @Override
    public String toString() {
        return "Resignation{" + "employeeID=" + employeeID + ", resignationReason=" + resignationReason + ", dateOfResignation=" + dateOfResignation + '}';
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getResignationReason() {
        return resignationReason;
    }

    public void setResignationReason(String resignationReason) {
        this.resignationReason = resignationReason;
    }

    public LocalDate getDateOfResignation() {
        return dateOfResignation;
    }

    public void setDateOfResignation(LocalDate dateOfResignation) {
        this.dateOfResignation = dateOfResignation;
    }
    
    
    
    
}
