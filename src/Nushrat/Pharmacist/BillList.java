/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nushrat.Pharmacist;

/**
 *
 * @author user
 */
public class BillList {
    private int PatiendId;
    private int TotalDue;
    private String PaidStatus;

    public BillList(int PatiendId, int TotalDue, String PaidStatus) {
        this.PatiendId = PatiendId;
        this.TotalDue = TotalDue;
        this.PaidStatus = PaidStatus;
    }

    public int getPatiendId() {
        return PatiendId;
    }

    public void setPatiendId(int PatiendId) {
        this.PatiendId = PatiendId;
    }

    public int getTotalDue() {
        return TotalDue;
    }

    public void setTotalDue(int TotalDue) {
        this.TotalDue = TotalDue;
    }

    public String getPaidStatus() {
        return PaidStatus;
    }

    public void setPaidStatus(String PaidStatus) {
        this.PaidStatus = PaidStatus;
    }

    @Override
    public String toString() {
        return "BillList{" + "PatiendId=" + PatiendId + ", TotalDue=" + TotalDue + ", PaidStatus=" + PaidStatus + '}';
    }
    
    
    
    
}
