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
public class Bill implements Serializable {
    private static final long serialVersionUID = 13L;
    private Integer patientId;
    private Double totalDue;
    private LocalDate billedOn;
    private LocalDate dueBy;
    private Boolean paidStatus;
    private Integer accountantId;

    public Bill(Integer patientId, Double totalDue, LocalDate billedOn, LocalDate dueBy, Boolean paidStatus, Integer accountantId) {
        this.patientId = patientId;
        this.totalDue = totalDue;
        this.billedOn = billedOn;
        this.dueBy = dueBy;
        this.paidStatus = paidStatus;
        this.accountantId = accountantId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Double getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(Double totalDue) {
        this.totalDue = totalDue;
    }

    public LocalDate getBilledOn() {
        return billedOn;
    }

    public void setBilledOn(LocalDate billedOn) {
        this.billedOn = billedOn;
    }

    public LocalDate getDueBy() {
        return dueBy;
    }

    public void setDueBy(LocalDate dueBy) {
        this.dueBy = dueBy;
    }

    public Boolean getPaidStatus() {
        return paidStatus;
    }

    public void setPaidStatus(Boolean paidStatus) {
        this.paidStatus = paidStatus;
    }

    public Integer getAccountantId() {
        return accountantId;
    }

    public void setAccountantId(Integer accountantId) {
        this.accountantId = accountantId;
    }

    @Override
    public String toString() {
        return "Bill{" + "patientId=" + patientId + ", totalDue=" + totalDue + ", billedOn=" + billedOn + ", dueBy=" + dueBy + ", paidStatus=" + paidStatus + ", accountantId=" + accountantId + '}';
    }
    
    
    
    
    
}
