/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;


import Model.LoginInfo;
import java.io.Serializable;
import java.time.LocalDate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class HROfficer extends Employee implements Serializable {
    private static final long serialVersionUID = 345L;
    
    public HROfficer(String name, Integer ID, String password, String email, String gender, LocalDate DOB, String Designation, Double Salary, LocalDate DoJ) {
        super(name, ID, password, email, gender, DOB, Designation, Salary, DoJ);
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
        return "HROfficer{" + '}';
    }

  
  
    

public boolean addNewEmployee(String usertype, String name, int ID, String password, String email, String gender, LocalDate DOB, String Designation, Double Salary, LocalDate DoJ) {
        String path = "";
        Employee employeeToAdd = null;
        if (usertype != null) switch (usertype) {
            case "Accountant":
                path = "Accountant.bin";
                employeeToAdd = new Accountant(name, ID, password, email, gender, DOB, Designation, Salary,  DoJ);
                break;
            case "Director":
                path = "Director.bin";
                employeeToAdd = new Director(name, ID, password, email, gender, DOB, Designation, Salary,  DoJ);
                break;
            case "Doctor":
                path = "Doctor.bin";
                employeeToAdd = new Doctor(name, ID, password, email, gender, DOB, Designation, Salary,  DoJ);
                break;
            case "HROfficer":
                path = "HROfficer.bin";
                employeeToAdd = new HROfficer(name, ID, password, email, gender, DOB, Designation, Salary,  DoJ);
                break;
            case "Optometrist":
                path = "Optometrist.bin";
                employeeToAdd = new Optometrist(name, ID, password, email, gender, DOB, Designation, Salary,  DoJ);
                break;
            case "Nurse":
                path = "Nurse.bin";
                employeeToAdd = new Nurse(name, ID, password, email, gender, DOB, Designation, Salary,  DoJ);
                break;
            case "Pharmacist":
                path = "Pharmacist.bin";
                employeeToAdd = new Pharmacist(name, ID, password, email, gender, DOB, Designation, Salary,  DoJ);
                break;
            default:
                break;
        }
        
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        File f2 = null;
        FileOutputStream fos2 = null;      
        ObjectOutputStream oos2 = null;
        try {
            f = new File(path);
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            f2 = new File("LoginInfo.bin");
            if(f2.exists()){
                fos2 = new FileOutputStream(f2,true);
                oos2 = new AppendableObjectOutputStream(fos2);                
            }
            else{
                fos2 = new FileOutputStream(f2);
                oos2 = new ObjectOutputStream(fos2);               
            }
            LoginInfo employeeToAddLogin = new LoginInfo(employeeToAdd.getID(), employeeToAdd.getPassword(), usertype);
            oos.writeObject(employeeToAdd);
            oos2.writeObject(employeeToAddLogin);
            oos.close();
            oos2.close();
            System.out.println("Employee add success");
            return true;
        } catch (IOException ex) {
            Logger.getLogger(HROfficer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) {oos.close();oos2.close();}
            } catch (IOException ex) {
                Logger.getLogger(HROfficer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
}