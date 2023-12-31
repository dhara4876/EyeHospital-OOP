/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import CommonScenes.RegisterSceneController;
import Model.FeedBack;
import Model.LoginInfo;
import Model.Resignation;
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

    public User(String name, Integer ID, String password, String email, String gender, LocalDate DOB) {
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

    public Integer getID() {
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
        return "Name=" + name + ", ID=" + ID + ", password=" + password + ", email=" + email + ", gender=" + gender + ", DOB=" + DOB + '}';
    }
    //common 1
    public static int tryToLogin(int idcheck, String passcheck){
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        boolean idFound = false;
        boolean passMatched = false;
        int userType=0;
        try {
            f = new File("LoginInfo.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            LoginInfo tempLogin;
            try{
                System.out.println("Printing login objects");
                while(true){
                    if (idFound){break;}
                    tempLogin = (LoginInfo) ois.readObject();
                    System.out.println(tempLogin.toString());
                    if (idcheck==tempLogin.getUserId()){
                        idFound = true;
                        if (passcheck.equals(tempLogin.getUserPass())){
                            passMatched = true;
                            switch (tempLogin.getUserType()) {
                                case "Doctor":
                                    userType=3;
                                    break;
                                case "Patient":
                                    userType=4;
                                    break;
                                case "Pharmacist":
                                    userType=5;
                                    break;
                                case "Nurse":
                                    userType=6;
                                    break;
                                case "Director":
                                    userType=7;
                                    break;
                                case "Accountant":
                                    userType=8;
                                    break;
                                case "HROfficer":
                                    userType=9;
                                    break;
                                default:
                                    userType=10;
                                    break;
                            }
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
            
            if (idFound){
                if(passMatched){
                    return userType;
                }
                else{
                    return 2;
                }
            }
            else{
                return 1;
            }
            
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

    public static User findUser(int id, String type){
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        String path = "";
        switch(type){
            case "Doctor":
                path="Doctor.bin";
                break;
            case "Patient":
                path="Patient.bin";
                break;
            case "Pharmacist":
                path="Pharmacist.bin";
                break;
            case "Nurse":
                path="Nurse.bin";
                break;
            case "Director":
                path="Director.bin";
                break;
            case "Accountant":
                path="Accountant.bin";
                break;
            case "HROfficer":
                path="HROfficer.bin";
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
                            break;
                        case "Patient": 
                            tempUser = (Patient) ois.readObject();
                            break;
                        case "Pharmacist": 
                            tempUser = (Pharmacist) ois.readObject();
                            break;
                        case "Nurse": 
                            tempUser = (Nurse) ois.readObject();
                            break;
                        case "Director": 
                            tempUser = (Director) ois.readObject();                            
                            break;
                        case "Accountant": 
                            tempUser = (Accountant) ois.readObject();
                            break;
                        case "HROfficer": 
                            tempUser = (HROfficer) ois.readObject();
                            break;
                        case "Optometrist": 
                            tempUser = (Optometrist) ois.readObject();
                            break;
                    }
                    if (id==tempUser.getID()){
                        System.out.print("User found: ");
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
    
    public static boolean isNumeric(String str) { 
        try {  
          Integer.valueOf(str);  
          return true;
        } catch(NumberFormatException e){return false;}
    }

    public static boolean addNewResignation(Integer employeeID, String resignationReason){
        
        Resignation newResignation = new Resignation(
                employeeID,
                resignationReason
                );
               
                
                
        System.out.println("Resignation made:"+newResignation.toString());

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("Resignation.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newResignation);
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
    
    public static boolean addFeedBack(String FeedBack){
        
        FeedBack newFeedBack = new FeedBack(
               FeedBack
                );
               
                
                
        System.out.println("FeedBack made:"+newFeedBack.toString());

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("FeedBack.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newFeedBack);
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

