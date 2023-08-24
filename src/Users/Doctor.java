/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import Model.Appointment;
import Model.Appointment;
import Model.LoginInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Doctor extends Employee implements Serializable {
    private static final long serialVersionUID = 345L;

    public Doctor(String name, Integer ID, String password, String email, String gender, LocalDate DOB, String designation, Double salary, LocalDate doj) {
        super(name, ID, password, email, gender, DOB, designation, salary, doj);
    }
    private static List<Doctor> DocList = new ArrayList<>();
    public static Doctor getDoctorById(int DoctorId) {
        for (Doctor doc : DocList) {
            if (doc.getID() == DoctorId) {
                return doc;
            }
        }
        return null; // Patient not found
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
    
    
        public static ArrayList<Integer> loadDocIDs() {
        ArrayList<Integer> idList = new ArrayList<>();
        Patient i;
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream (new FileInputStream("Doctor.bin"));
            while(true){
                i = (Patient) ois.readObject();
                System.out.println("The patient u read: "+ i.toString());
                idList.add(i.getID());
            }
        }
        catch(IOException | ClassNotFoundException e){System.out.println("File reading done");}
        System.out.println(idList);
        return idList;
    }

    public static boolean addNewAppointment(Integer DoctorID, LocalDate Date, String Time){
        
        Appointment newAppointment = new Appointment(
                DoctorID,
                Date,
                Time);
                       
        System.out.println("Appointment made:"+newAppointment.toString());

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("Appointment.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newAppointment);
            oos.close();
            return true;
        
        } catch (IOException e) {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Error writing Object to binary file");
            return false;
       
        }
    }
}
    
   
    


    
