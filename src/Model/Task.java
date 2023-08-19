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
    private Boolean completedStatus;

    public Task(Integer reciverId, Integer senderId, String details) {
        this.reciverId = reciverId;
        this.senderId = senderId;
        this.details = details;
        this.completedStatus = false;
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

    public Boolean getCompletedStatus() {
        return completedStatus;
    }

    public void setCompletedStatus(Boolean completedStatus) {
        this.completedStatus = completedStatus;
    }

    @Override
    public String toString() {
        return "Task{" + "reciverId=" + reciverId + ", senderId=" + senderId + ", details=" + details + ", completedStatus=" + completedStatus + '}';
    }
    
    
    
}
