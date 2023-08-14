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

  
  
    
    public static ArrayList<Employee> getEmpList() {
        ArrayList<Employee> empList = new ArrayList<Employee>();
        ObjectInputStream ois = null;
        try {
            Employee emp;
            ois = new ObjectInputStream(new FileInputStream("EmployeeData.bin"));

            while (true) {
                emp = (Employee) ois.readObject();
                empList.add(emp);
            }

        } catch (Exception ex) {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {

            }
            return empList;
        }
    }

    @Override
    public boolean Register() {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("HROfficer.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            LoginInfo toAddLogin = new LoginInfo(getID(), getPassword(), "HROfficer");
            oos.writeObject(this);
            oos.writeObject(toAddLogin);

            oos.close();
            System.out.println("HROfficer added successfully");
            return true;
        } catch (IOException ex) {
            Logger.getLogger(HROfficer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(HROfficer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }}
    

    
