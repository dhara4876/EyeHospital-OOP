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
public class NurseRequest implements Serializable {
    private static final long serialVersionUID = 13L;
    
    private Integer nurseId;
    private Integer doctorId;
    private String requestDetails;

    public NurseRequest(Integer nurseId, Integer doctorId, String requestDetails) {
        this.nurseId = nurseId;
        this.doctorId = doctorId;
        this.requestDetails = requestDetails;
    }

    public Integer getNurseId() {
        return nurseId;
    }

    public void setNurseId(Integer nurseId) {
        this.nurseId = nurseId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    @Override
    public String toString() {
        return "NurseRequest{" + "nurseId=" + nurseId + ", doctorId=" + doctorId + ", requestDetails=" + requestDetails + '}';
    }
    
    
    
    
    
    
}
