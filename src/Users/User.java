/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import CommonScenes.RegisterSceneController;
import Model.LoginInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public abstract class User implements Serializable{
    private static final long serialVersionUID = 345L;
    public String name;
    public final Integer ID;
    protected String password;
    public String email;
    public final String gender;
    
    protected final LocalDate DOB;

    public User(String name, int ID, String password, String email, String gender, LocalDate DOB) {
        this.name = name;
        this.ID = ID;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.DOB = DOB;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", ID=" + ID + ", password=" + password + ", email=" + email + ", gender=" + gender + ", DOB=" + DOB + '}';
    }
    //common 1
    public static int userLogin(int idcheck, String passcheck){
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        int idflag=0;
        int passflag=0;
        int userType=0;
        try {
            f = new File("LoginInfo.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            LoginInfo tempLogin;
            try{
                System.out.println("Printing login objects");
                while(true){
                    if (idflag==1){break;}
                    tempLogin = (LoginInfo) ois.readObject();
                    System.out.println(tempLogin.toString());
                    if (idcheck==tempLogin.getUserId()){
                        idflag=1;
                        if (passcheck.equals(tempLogin.getUserPass())){
                            passflag=1;
                            if (tempLogin.getUserType().equals("Doctor")){userType=3;}
                            else if (tempLogin.getUserType().equals("Patient")){userType=4;}
                            else if (tempLogin.getUserType().equals("Pharmacist")){userType=5;}
                            else if (tempLogin.getUserType().equals("Nurse")){userType=6;}
                            else if (tempLogin.getUserType().equals("Director")){userType=7;}
                            else if (tempLogin.getUserType().equals("Accountant")){userType=8;}
                            else if (tempLogin.getUserType().equals("HROfficer")){userType=9;}
                            else {userType=10;}
                            break;
                        }
                    }
                }
            }
            catch(IOException | ClassNotFoundException e){
                System.out.println(e.toString());
                System.out.println("IOException | ClassNotFoundException in reading bin file");
            }
            System.out.println("End of file\n");
            
            if (idflag==1){
                if(passflag==1){
                    
                    return userType;
                }
                else{return 2;}
                
            }
            else{return 1;}
                
        
        } catch (IOException ex) {
            System.out.println("IOException on entire file handling");
            return 0;
        }
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        }
       public static User getInstance(int id, String type){
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String path = "";
        switch(type){
            case "Doctor":
                path="DoctorObjects.bin";
                break;
            case "Patient":
                path="PatientObjects.bin";
                break;
            case "Pharmacist":
                path="PharmacistObjects.bin";
                break;
            case "Nurse":
                path="NurseObjects.bin";
                break;
            case "Director":
                path="DirectorObjects.bin";
                break;
            case "Accountant":
                path="Accountant.bin";
                break;
            case "HROfficer":
                path="HROfficerObjects.bin";
                break;
            case "Optometrist":
                path="Optometrist.bin";
                break;
        }
        
        try {
            f = new File(path);
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            User tempUser = null;
            try{
                System.out.println("Printing user objects");
                while(true){
                    switch(type){
                        case "Doctor": 
                            tempUser = (Doctor) ois.readObject();
                            System.out.println("Reading doc");
                            System.out.println(tempUser.toString());
                            break;
                        case "Patient": 
                            tempUser = (Patient) ois.readObject();
                            System.out.println("Reading pat");
                            System.out.println(tempUser.toString());
                            break;
                        case "Pharmacist": 
                            tempUser = (Pharmacist) ois.readObject();
                            System.out.println("Reading pharma");
                            System.out.println(tempUser.toString());
                            break;
                        case "Nurse": 
                            tempUser = (Nurse) ois.readObject();
                            System.out.println("Reading nurse");
                            System.out.println(tempUser.toString());
                            break;
                        case "Director": 
                            tempUser = (Director) ois.readObject();                            
                            System.out.println("Reading director");
                            System.out.println(tempUser.toString());
                            break;
                        case "AccountsOfficer": 
                            tempUser = (Accountant) ois.readObject();
                            System.out.println("Reading accounts");
                            System.out.println(tempUser.toString());
                            break;
                        case "HROfficer": 
                            tempUser = (HROfficer) ois.readObject();
                            System.out.println("Reading HR");
                            System.out.println(tempUser.toString());
                            break;
                        case "LabTechnician": 
                            tempUser = (Optometrist) ois.readObject();
                            System.out.println("Reading optometrist");
                            System.out.println(tempUser.toString());
                            break;
                    }
                    if (id==tempUser.getID()){
                        System.out.println("User found");
                        System.out.print("tempUser:");
                        System.out.println(tempUser.toString());
                        return tempUser;
                    }
                }
            }
            catch(IOException | ClassNotFoundException e){
                System.out.println(e.toString());
                System.out.println("IOException | ClassNotFoundException in reading bin file");
            }
            System.out.println("End of file\n");
        } catch (IOException ex) {
            System.out.println("IOException on entire file handling");
        }
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        return null;
    }
        
       public abstract boolean Register();
       
       public static boolean isNumeric(String str) { 
        try {  
          Integer.parseInt(str);  
          return true;
        } catch(NumberFormatException e){return false;}
    }

}

