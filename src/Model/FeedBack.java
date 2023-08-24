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
public class FeedBack implements Serializable{
     private static final long serialVersionUID = 345L;
    private String FeedBack;
     private LocalDate dateOfFeedback;

    public FeedBack(String FeedBack) {
        this.FeedBack = FeedBack;
        this.dateOfFeedback = LocalDate.now();
    }

    public String getFeedBack() {
        return FeedBack;
    }

    public void setFeedBack(String FeedBack) {
        this.FeedBack = FeedBack;
    }

    public LocalDate getDateOfFeedback() {
        return dateOfFeedback;
    }

    public void setDateOfFeedback(LocalDate dateOfFeedback) {
        this.dateOfFeedback = dateOfFeedback;
    }

    @Override
    public String toString() {
        return "FeedBack{" + "FeedBack=" + FeedBack + ", dateOfFeedback=" + dateOfFeedback + '}';
    }
     
     
     
     
     
     
}
