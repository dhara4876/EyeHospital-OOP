/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import CommonScenes.RegisterSceneController;
import Model.LoginInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public abstract  class Employee extends User implements Serializable {

    private static final long serialVersionUID = 345L;

    public String designation;
    protected double salary;
    protected final LocalDate DOJ;

    public Employee(String name, Integer ID, String password, String email, String gender, LocalDate DOB, String designation, Double salary,
                    LocalDate doj) {
        super(name, ID, password, email, gender, DOB);
        this.designation = designation;
        this.salary = salary;
        this.DOJ = doj;
    }

 


    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" + "designation=" + designation + ", salary=" + salary + ", DOJ=" + DOJ + '}';
    }
    

       
       
       
                  
    
}
