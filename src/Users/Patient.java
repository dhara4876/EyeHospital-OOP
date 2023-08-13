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
public class Patient extends User implements Serializable {
    private static final long serialVersionUID = 345L;
    private Boolean addmitted;
    private String patientNotes;

    public Patient(String name, int ID, String password, String email, String gender, LocalDate DOB) {
        super(name, ID, password, email, gender, DOB);
        this.addmitted = false;
        this.patientNotes = "";
    }
    
        public static boolean addPatient(Patient toAdd) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        File f2 = null;
        FileOutputStream fos2 = null;      
        ObjectOutputStream oos2 = null;
        try {
            f = new File("PatientObjects.bin");
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
            LoginInfo toAddLogin = new LoginInfo(toAdd.getID(), toAdd.getPassword(), "Patient");
            oos.writeObject(toAdd);
            oos2.writeObject(toAddLogin);
            oos.close();
            oos2.close();
            System.out.println("Sign up success");
            return true;
        } catch (IOException ex) {
            Logger.getLogger(RegisterSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) {oos.close();oos2.close();}
            } catch (IOException ex) {
                Logger.getLogger(RegisterSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
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
        return "Patient{" + '}';
    }
    
    
    
}
