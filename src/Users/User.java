/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import Model.LoginInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;

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
    
    public static int userLogin(int idcheck, String passcheck){
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        int idflag=0;
        int passflag=0;
        int userType=0;
        try {
            f = new File("LoginInfoObjects.bin");
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
                    //errorLabel.setText("Login Successful");
                    return userType;
                }
                else{return 2;}
                //code 2 - errorLabel.setText("Error, wrong password");
            }
            else{return 1;}
                //code 1 - errorLabel.setText("Error, user not found");
        
        } catch (IOException ex) {
            System.out.println("IOException on entire file handling");
            return 0;
        }
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        //code 0 - unhandled exception
    }
       public static boolean isNumeric(String str) { 
        try {  
          Integer.parseInt(str);  
          return true;
        } catch(NumberFormatException e){return false;}
    }
}

