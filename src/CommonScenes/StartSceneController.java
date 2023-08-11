/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package CommonScenes;

import Model.LoginInfo;
import Users.Accountant;
import Users.AppendableObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
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
    private void loginOnClick(ActionEvent event) {
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            //stg.setScene(scene2);
            //Stage s2 = new Stage(); s2.setScene(scene2);  s2.show();
            
            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
            //Stage stg2 = (Stage)((Node)b1).getScene().getWindow();
            //if b1 is the fxid of thee button
            
            //Stage stg2 = (Stage)((Node)myAnchorPane).getScene().getWindow();
            
            
            stg2.setScene(scene2);
            stg2.show();
        } catch (IOException ex) {
            Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

    @FXML
    private void tempbuttonOnClick(ActionEvent event) throws IOException{
        try {
            LocalDate date = LocalDate.of(2023, 7, 5);
            Accountant accountant = new Accountant("akif",3,"3","akif@gmail.com","m",date,"Accountant",3.23,date);
            
            File f = null;
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;
            try {
                
                f = new File("Accountant.bin");
                
                if (f.exists()) {
                    fos = new FileOutputStream(f, true);
                    oos = new AppendableObjectOutputStream(fos);
                    
                } else {
                    fos = new FileOutputStream(f);
                    oos = new ObjectOutputStream(fos);
                }
                
                oos.writeObject(accountant);
                oos.close();
                
            } catch (IOException e) {
                if(oos!=null){
                    try {
                        oos.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println("Error writing Object to binary file");
                
            }
            
            ObjectInputStream ois = null;
            try {
                ois = new ObjectInputStream (new FileInputStream("Accountant.bin"));
            } catch (IOException ex) {
                Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
            while(true){
                try {
                    accountant = (Accountant) ois.readObject();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
            
        }
}
    
}
    
