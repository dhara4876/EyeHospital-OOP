/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDate;

/**
 *
 * @author user
 */
public class Schedule implements Serializable{
    private static final long serialVersionUID = 345L;
    private String Id;
    private String Task;
    private LocalDate Date;
    private String Time;

    public Schedule(String Id, String Task, LocalDate Date, String Time) {
        this.Id = Id;
        this.Task = Task;
        this.Date = Date;
        this.Time = Time;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    

    public String getTask() {
        return Task;
    }

    public void setTask(String Task) {
        this.Task = Task;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    @Override
    public String toString() {
        return "Schedule{" + "Id=" + Id + ", Task=" + Task + ", Date=" + Date + ", Time=" + Time + '}';
    }
    
    
}
