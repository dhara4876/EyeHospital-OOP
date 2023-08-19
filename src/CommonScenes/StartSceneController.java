/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CommonScenes;

import Model.LoginInfo;
import Users.Accountant;
import Users.AppendableObjectOutputStream;
import Users.HROfficer;
import Users.Patient;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class StartSceneController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void registerOnClick(ActionEvent event) {
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("RegisterScene.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            
            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            
            
            stg2.setScene(scene2);
            stg2.show();
        } catch (IOException ex) {
            Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
   
         
    }

    @FXML
    private void loginOnClick(ActionEvent event) throws IOException {
        System.out.println(LocalDate.now());
         try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            
            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            
            
            stg2.setScene(scene2);
            stg2.show();
        } catch (IOException ex) {
            Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        

                

    }
    

    @FXML
    private void tempbuttonOnClick(ActionEvent event) throws IOException, ClassNotFoundException {
        
    
        LocalDate date = LocalDate.of(2023, 7, 5);
        ArrayList<LoginInfo> infoList = new ArrayList<>();
        LoginInfo login = new LoginInfo(12,"pass","Accountant");
        LoginInfo login2 = new LoginInfo(32,"pass","Pharmacist");
        LoginInfo login3 = new LoginInfo(42,"pass","Optometrist");
        LoginInfo login4 = new LoginInfo(52,"pass","Doctor");
        LoginInfo login5 = new LoginInfo(62,"pass","Nurse");
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            
            f = new File("LoginInfo.bin");
            
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
                
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            
            oos.writeObject(login);
            oos.writeObject(login2);
            oos.writeObject(login3);
            oos.writeObject(login4);
            oos.writeObject(login5);
            oos.close();
            
        } catch (IOException e) {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException x) {
                    Logger.getLogger(LoginInfo.class.getName()).log(Level.SEVERE, null, x);
                }
            }
            System.out.println("Error writing Object to binary file");
            
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream (new FileInputStream("LoginInfo.bin"));
        } catch (IOException x) {
            Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, x);
        }
        
        try {
            while (true) {
                Object obj = ois.readObject();
                if  (obj instanceof LoginInfo){
                      LoginInfo deserializedInfo = (LoginInfo) obj;
                        infoList.add(deserializedInfo);
                    }
                }
            
        } catch (EOFException e) {

        }finally{System.out.println(infoList);}
            
        
        
                
        
        
    }  
private Patient toAdd;
    private void tempTwo(ActionEvent event) throws IOException, ClassNotFoundException {
        
  // Create an HROfficer object
        HROfficer hrOfficer = new HROfficer("John Doe", 123, "password", "john@example.com", "Male",
                LocalDate.of(1990, 1, 15), "HR Manager", 60000.0, LocalDate.of(2020, 5, 1));

        // Create a LoginInfo object for the HR Officer
        LoginInfo loginInfo = new LoginInfo(hrOfficer.getID(), hrOfficer.getPassword(), "HROfficer");

        // Write the HROfficer object to HROfficer.bin
        try (ObjectOutputStream hrofficerOutputStream = new ObjectOutputStream(new FileOutputStream("HROfficer.bin"))) {
            hrofficerOutputStream.writeObject(hrOfficer);
            System.out.println("HROfficer object written to HROfficer.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the LoginInfo object to LoginInfo.bin
        try (ObjectOutputStream loginInfoOutputStream = new ObjectOutputStream(new FileOutputStream("LoginInfo.bin"))) {
            loginInfoOutputStream.writeObject(loginInfo);
            System.out.println("LoginInfo object written to LoginInfo.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }
            
    }
    
    }
    


    

    
