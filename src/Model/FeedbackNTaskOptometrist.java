/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class FeedbackNTaskOptometrist {
    private int Id;
    private String Feedback;

    public FeedbackNTaskOptometrist(int Id, String Feedback) {
        this.Id = Id;
        this.Feedback = Feedback;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }

    @Override
    public String toString() {
        return "FeedbackOptometrist{" + "Id=" + Id + ", Feedback=" + Feedback + '}';
    }
    
    
}
