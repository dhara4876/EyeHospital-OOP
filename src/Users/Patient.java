/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import CommonScenes.RegisterSceneController;
import Model.Bill;
import Model.Complaint;
import Model.LoginInfo;
import Model.Complaint;
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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;

/**
 *
 * @author Asus
 */
public class Patient extends User implements Serializable {

    private static final long serialVersionUID = 345L;

    private Boolean admittedStatus;
    private LocalDate admittedDate;

    public LocalDate getAdmittedDate() {
        return admittedDate;
    }

    public void setAdmittedDate(LocalDate admittedDate) {
        this.admittedDate = admittedDate;
    }

    public void markAsadmitted() {
        this.admittedStatus = true;
        this.admittedDate = LocalDate.now();
    }

    public void markAsaDischarged() {
        this.admittedStatus = false;
    }

    public Patient(String name, int ID, String password, String email, String gender, LocalDate DOB) {
        super(name, ID, password, email, gender, DOB);
        this.admittedStatus = false;
        this.admittedDate = null;
    }

    public Boolean getAdmittedStatus() {
        return admittedStatus;
    }

    public void setAdmittedStatus(Boolean admittedStatus) {
        this.admittedStatus = admittedStatus;
    }

    public LocalDate getAdmmittedDate() {
        return admittedDate;
    }

    public void setAdmmittedDate(LocalDate admmittedDate) {
        this.admittedDate = admmittedDate;
    }

    public static List<Patient> getPatientList() {
        return patientList;
    }

    public static void setPatientList(List<Patient> patientList) {
        Patient.patientList = patientList;
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
        return "Patient: " + super.toString() + "admittedStatus =" + admittedStatus + ", admittedDate = " + admittedDate + '}';
    }

    public boolean Register(Patient toAdd) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        File f2 = null;
        FileOutputStream fos2 = null;
        ObjectOutputStream oos2 = null;
        try {
            f = new File("Patient.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            f2 = new File("LoginInfo.bin");
            if (f2.exists()) {
                fos2 = new FileOutputStream(f2, true);
                oos2 = new AppendableObjectOutputStream(fos2);
            } else {
                fos2 = new FileOutputStream(f2);
                oos2 = new ObjectOutputStream(fos2);
            }
            LoginInfo toAddLogin = new LoginInfo(toAdd.getID(), toAdd.getPassword(), "Patient");
            oos.writeObject(toAdd);
            oos2.writeObject(toAddLogin);
            System.out.println("Sign up success");
            return true;
        } catch (IOException ex) {
            Logger.getLogger(RegisterSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (oos2 != null) {
                    oos2.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(RegisterSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    public static ArrayList<Integer> loadPatientIDs() {
        ArrayList<Integer> idList = new ArrayList<>();
        Patient i;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Patient.bin"));
            while (true) {
                i = (Patient) ois.readObject();
                System.out.println("The patient u read: " + i.toString());
                idList.add(i.getID());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(idList);
        return idList;
    }

    private static List<Patient> patientList = new ArrayList<>();

    public static Patient getPatientById(int patientId) {
        for (Patient patient : patientList) {
            if (patient.getID() == patientId) {
                return patient;
            }
        }
        return null; // Patient not found
    }

    /*private ObservableList<MyData> readDataFromBinaryFile() {
        ObservableList<MyData> dataList = FXCollections.observableArrayList();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"))) {
            while (true) {
                MyData data = (MyData) ois.readObject();
                dataList.add(data);
            }
        } catch (IOException | ClassNotFoundException e) {
            // Handle exceptions
        }

        return dataList;
    }*/
    
        public static boolean addNewComplaint(Integer patientID, String complaintReason) {

    Complaint newComplaint = new Complaint(
            patientID, 
            complaintReason);
               
    System.out.println("Complaint made: " + newComplaint.toString());

    File f = null;
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;
    try {

        f = new File("Complaint.bin");

        if (f.exists()) {
            fos = new FileOutputStream(f, true);
            oos = new AppendableObjectOutputStream(fos);

        } else {
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(newComplaint);
        oos.close();
        return true;

    } catch (IOException e) {
        if(oos!=null){
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Error writing Object to binary file");
        return false;

    }
}

}
