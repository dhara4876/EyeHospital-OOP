/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import Model.Appointment;
import Model.Bill;
import Model.LoginInfo;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Doctor extends Employee implements Serializable {

    private static final long serialVersionUID = 345L;

    public Doctor(String name, Integer ID, String password, String email, String gender, LocalDate DOB, String designation, Double salary, LocalDate doj) {
        super(name, ID, password, email, gender, DOB, designation, salary, doj);
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

    public static boolean addNewAppointment(Integer DoctorID, LocalDate Date, String Time) {

        Appointment newAppointment = new Appointment(
                DoctorID,
                Date,
                Time);

        System.out.println("Appointment made:" + newAppointment.toString());

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
            fos.close();
            oos.close();
            return true;

        } catch (IOException e) {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Error writing Object to binary file");
            return false;

        }
    }

    public static ObservableList<Appointment> readAppointmentList(){
        ObservableList<Appointment> appointmentList = FXCollections.observableArrayList();
        Appointment i;
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream (new FileInputStream("Appoinment.bin"));
            while(true){
                i = (Appointment) ois.readObject();
                System.out.println("The Insurance u read: "+i.toString());
                appointmentList.add(i);
            }
        }
        catch(IOException | ClassNotFoundException e){System.out.println("File reading done");}
        System.out.println(appointmentList);
        return appointmentList;
        
    }

}
