/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;

import Model.Glasses;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class RestockGlassesController implements Initializable {

    @FXML
    private TextField enterProductIDTextField;
    @FXML
    private ComboBox<String> frameTypeComboBox;
    @FXML
    private ComboBox<String> lensTypeComboBox1;
    @FXML
    private TextField enterQuantityTextField;
    @FXML
    private TextArea outputTextArea;
    
    private ArrayList<Glasses> glassesArr;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         glassesArr = new ArrayList<Glasses>();
        
        
        frameTypeComboBox.getItems().addAll("Full-rimmed","Semi-rimless","Rimless",
                "Low-bridge", "Wire ");
        
        
        lensTypeComboBox1.getItems().addAll("Single Visions","Bifocals", 
                "Trifocals", "Progressive", "Prism");
    }    

    @FXML
    private void restockingGlassesAddToArrayListBtnOnClick(MouseEvent event) {
        glassesArr.add(
            new Glasses(  
                    Integer.parseInt(enterProductIDTextField.getText()),
                     frameTypeComboBox.getValue(),
                     lensTypeComboBox1.getValue(),
                    enterQuantityTextField.getText()  
                )
        );
    }

    @FXML
    private void createFileBtnOnClick(MouseEvent event) {
        FileWriter fw=null;
            try {
               
                
                File f = new File("Glasses.txt");
                
                
                if(f.exists())
                    fw = new FileWriter(f,true);
                else 
                    fw = new FileWriter(f);
                    
                String str="";
                for(Glasses tr: glassesArr){
                    str += tr.getProductId()+","+tr.getFrametype()+","+tr.getLenstype()+","+ tr.getQuantity()+"\n";
                    
                }
                fw.write(str);  
                fw.close();
            } catch (IOException ex) {
                //fw.close();
                
            }
        
    }

    @FXML
    private void readFromTextFileBtnOnClick(MouseEvent event) {
        File file = new File("Glasses.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            outputTextArea.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
                String[] tokens;
                tokens = str.split(",");
                str = "ProductId="+tokens[0]+", Frame Type="+tokens[1]
                        +", Lens Type="+tokens[2]+ ", Quantity" + tokens[3];
                outputTextArea.appendText(str+"\n");
                //outputTxtArea.appendText("\n");               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddTestReportController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    

