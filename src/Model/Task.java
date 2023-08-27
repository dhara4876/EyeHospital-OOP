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
public class Task implements Serializable{
      private static final long serialVersionUID = 345L;
    private Integer reciverId;
    private Integer senderId;
    private String details;
    private String medicineName;
    private int dose;
    private String instructions;
    private String time;
    
 
    public Task(Integer reciverId, Integer senderId, String details) {
        this.reciverId = reciverId;
        this.senderId = senderId;
        this.details = details;
        
    }

    public Task(String medicineName, int dose, String instructions, String time) {
        this.medicineName = medicineName;
        this.dose = dose;
        this.instructions = instructions;
        this.time = time;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    

    

    

    
    

    public Integer getReciverId() {
        return reciverId;
    }

    public void setReciverId(Integer reciverId) {
        this.reciverId = reciverId;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Task{" + "reciverId=" + reciverId + ", senderId=" + senderId + ", details=" + details + ", medicineName=" + medicineName + ", dose=" + dose + ", instructions=" + instructions + ", time=" + time + '}';
    }

    
    

   

    
    
}
