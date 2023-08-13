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
public class ChartData implements Serializable{
    private static final long serialVersionUID = 345L;
    
    private Integer patientId;
    private Integer totalDue;

    public ChartData(Integer patientId, Integer totalDue) {
        this.patientId = patientId;
        this.totalDue = totalDue;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public Integer getTotalDue() {
        return totalDue;
    }
}

    

