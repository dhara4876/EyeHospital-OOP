/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class addFeedbackOptometrist {
    private int id;
    private String Feedback;

    public addFeedbackOptometrist(int id, String Feedback) {
        this.id = id;
        this.Feedback = Feedback;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }

    @Override
    public String toString() {
        return "addFeedback{" + "id=" + id + ", Feedback=" + Feedback + '}';
    }
    
    
    
}
