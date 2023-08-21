/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import Model.Bill;
import Model.LoginInfo;
import Model.Task;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Asus
 */
public class Nurse extends Employee implements Serializable{
    private static final long serialVersionUID = 345L; 
    
    
    //public static boolean admitPatient(Integer patientId,Integer accountantId, Integer totalDue, LocalDate dueBy){
    
     


    public Nurse(String name, Integer ID, String password, String email, String gender, LocalDate DOB, String Designation, Double Salary, LocalDate DoJ) {
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
        return "Nurse{" + '}';
    }
//common goal
   
       public static void readPatientLists(ObservableList<Patient> admittedPatientList, ObservableList<Patient> nonAdmittedPatientList) {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Patient.bin"))) {
        while (true) {
            Patient patient = (Patient) ois.readObject();
            System.out.println("Patient read: " + patient.toString());
            if (patient.getAdmittedStatus()) {
                admittedPatientList.add(patient);
            } else {
                nonAdmittedPatientList.add(patient);
            }
        }
    } catch (EOFException e) {
        
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error reading BillObjects.bin: " + e.getMessage());
    } finally{
        
        System.out.println("printing"+ admittedPatientList + "list 2"+ nonAdmittedPatientList+ "printing list");
    }
    
   }
   
  public static void updatePatientAdmittedStatus(List<Patient> admittedPatientList, List<Patient> nonAdmittedPatientList) {
     try {
        
        File patientFile = new File("Patient.bin");
        if (patientFile.exists()) {
            patientFile.delete();
        }
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Patient.bin"))) {
            
            for (Patient patient : admittedPatientList) {
                oos.writeObject(patient);
            }
            
            
            for (Patient patient : nonAdmittedPatientList) {
                oos.writeObject(patient);
            }
            
            System.out.println("PatientList updated and written to Patient.bin");
        } catch (IOException e) {
            System.out.println("Error writing updated PatientList to file");
        }
    } catch (Exception e) {
        System.out.println("Error deleting existing Patient.bin file");
    }
}     
       
       public static ObservableList<Patient> viewPatientDetails(){
        ObservableList<Patient> patientList = FXCollections.observableArrayList();
        Patient i;
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream (new FileInputStream("Patient.bin"));
            while(true){
                i = (Patient) ois.readObject();
                System.out.println("The patient u read: "+i.toString());
                patientList.add(i);
            }
        }
        catch(IOException | ClassNotFoundException e){System.out.println("File reading done");}
        System.out.println(patientList);
        return patientList;
        
    }  
    
      public static boolean addNewTask(Integer reciverId, Integer senderId, String details){
        
        Task newTask = new Task(
                reciverId,
                senderId,
                details
                );
               
                
                
        System.out.println("Task made:"+newTask.toString());

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("Task.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newTask);
            oos.close();
            return true;
            
        } catch (IOException e) {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Nurse.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Error writing Object to binary file");
            return false;
       
        }
    }
    
      
      
       
       
}

//public static boolean addPatientDetails
//public static boolean viewPatientDetails
//public static boolean viewAdmittedPatients
//public static boolean admitPatient
//public static boolean giveTaskToDoctor
//public static boolean viewTasksFromDoctor
    
//chart
//barchart??
    
//postfeedback commongoal

    






    
    
    
    
    

