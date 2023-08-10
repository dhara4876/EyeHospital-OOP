/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author User
 */
public class Hr implements Serializable {
    private String empName;
    private String empDesignation;
    private Float empSalary;

    public Hr(String empName, String empDesignation, Float empSalary) {
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public Float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Float empSalary) {
        this.empSalary = empSalary;
    }
    
    public void addEmployee(Hr newEmp){
        
        try {
            // File f = new File("Receptionist.bin");
            File f = new File("Employee.bin");

            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Employee emp;
            try {

                while (true) {

                    emp = (PharmacyManager) ois.readObject();
                    temp = emp.getId();

                }
            }//end of nested try
            catch (Exception e) {
                //
            }//nested catch     

        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex) {
            }
        }
        try {

            //  File f = new File("Receptionist.bin");
            File f = new File("Employee.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
                pm = new PharmacyManager(phone, name, gender, branch, "PharmacyManager", doB, 30000, "123", temp + 1);
                oos.writeObject(pm);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
                pm = new PharmacyManager(phone, name, gender, branch, "PharmacyManager", doB, 30000, "123", (branch.equals("Uttara") ? 1300 : 2300));

                oos.writeObject(pm);
            }

        } catch (IOException ex) {

        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
            }
        }
        
        
    }
    
    
}









