/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import Model.Bill;
import Model.LoginInfo;
import Model.PatientDetails;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.XYChart;

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
       return super.toString();
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
    
public boolean editPatientDetails(int patientId, String updatedDetails) {
  
    Patient patientToUpdate = null;
    
    List<Patient> updatedPatients = new ArrayList<>();

    
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("patient.bin"))) {
        List<Patient> patients = (List<Patient>) ois.readObject();

        for (Patient patient : patients) {
            if (patient.getID() == patientId) {
               
                patientToUpdate = patient;
            }
            updatedPatients.add(patient);
        }
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        System.err.println("Error loading patient data.");
        return false; 
    }
    
   
    if (patientToUpdate != null) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("patient.bin"))) {
            oos.writeObject(updatedPatients);
            System.out.println("Patient details updated and saved successfully.");
            return true; 
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error saving patient data.");
        }
    } else {
        System.out.println("Patient not found.");
    }
    
    return false; 
}
 
  public boolean addPatientDetails(Integer patientID, String patientDetails, Integer nurseId){
        
        PatientDetails newDetails = new PatientDetails(
                patientID,
                patientDetails,
                this.ID
                );
               
                
                
        System.out.println("PatientDetails made:"+newDetails.toString());

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("PatientDetails.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newDetails);
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
     
          public static ObservableList<Patient> readPatientList(){
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
          
    public ObservableList<Task> getTasksForNurse() {
        ObservableList<Task> nurseTasks = FXCollections.observableArrayList();
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Task.bin"))) {
            while (true) {
                Task task = (Task) ois.readObject();
                if (task.getReciverId().equals(this.getID())) { 
                    nurseTasks.add(task);
                }
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading Task.bin: " + e.getMessage());
        }
        
        return nurseTasks;
    }

    private void updateTaskFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Task.bin"))) {
            ObservableList<Task> nurseTasks = getTasksForNurse(); // Get the tasks associated with the nurse
            for (Task task : nurseTasks) {
                oos.writeObject(task);
            }
            System.out.println("Task list updated and written to Task.bin");
        } catch (IOException e) {
            System.out.println("Error writing updated task list to file");
        }
    }
    
    public void markTaskCompleted(Task task) {
        ObservableList<Task> nurseTasks = getTasksForNurse();
        nurseTasks.remove(task);
        updateTaskFile();
    }
 
  public static List<XYChart.Data<String, Integer>> getAdmittedPatientsChartData() {
    List<XYChart.Data<String, Integer>> chartData = new ArrayList<>();

    ObservableList<Patient> admittedPatientList = Nurse.getAdmittedPatientsFromPatientFile();

    
    Map<String, Integer> dateCountMap = new HashMap<>();

    for (Patient patient : admittedPatientList) {
        if (patient.getAdmittedStatus() && patient.getAdmittedDate() != null) {
            String admissionDate = patient.getAdmittedDate().toString(); // Convert LocalDate to String

            
            dateCountMap.put(admissionDate, dateCountMap.getOrDefault(admissionDate, 0) + 1);
        }
    }

   
    for (Map.Entry<String, Integer> entry : dateCountMap.entrySet()) {
        XYChart.Data<String, Integer> dataPoint = new XYChart.Data<>(entry.getKey(), entry.getValue());
        chartData.add(dataPoint);
    }

    return chartData;
}

 
    
    public static ObservableList<Patient> getAdmittedPatientsFromPatientFile() {
        List<Patient> admittedPatients = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Patient.bin"))) {
            while (true) {
                Patient patient = (Patient) ois.readObject();
                if (patient.getAdmittedStatus()) {
                    admittedPatients.add(patient);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading Patient.bin: " + e.getMessage());
        }

       
        ObservableList<Patient> admittedPatientsObservableList = FXCollections.observableArrayList(admittedPatients);
        return admittedPatientsObservableList;
    }
    
    
     public static ObservableList<Patient> readAllPatientsList(){
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
       public static ObservableList<PatientDetails> readPatientDetailsList(){
        ObservableList<PatientDetails> patientDetailsList = FXCollections.observableArrayList();
        PatientDetails i;
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream (new FileInputStream("PatientDetails.bin"));
            while(true){
                i = (PatientDetails) ois.readObject();
                System.out.println("The patient u read: "+i.toString());
                patientDetailsList.add(i);
            }
        }
        catch(IOException | ClassNotFoundException e){System.out.println("File reading done");}
        System.out.println(patientDetailsList);
        return patientDetailsList;
        
    }
     
   public String getPatientDetailsByID(int patientId) {
        ObservableList<PatientDetails> patientDetailsList = readPatientDetailsList();
        
        for (PatientDetails details : patientDetailsList) {
            if (details.getPatientID() == patientId) {
                return details.getPatientDetails();
            }
        }
        
        return "No details found for the patient.";
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

    






    
    
    
    
    

