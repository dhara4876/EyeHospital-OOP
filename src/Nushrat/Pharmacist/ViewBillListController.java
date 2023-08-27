/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Pharmacist;




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
public class ViewBillListController implements Initializable {

    @FXML
    private TextField enterPatientIDTextField;
    
    @FXML
    private TextField enterDueTextField;
    @FXML
    private TextArea outputTextArea;
    
    private ArrayList<BillList> billArr;
    @FXML
    private ComboBox<String> statusComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        billArr = new ArrayList<BillList>();
        statusComboBox.getItems().addAll("Full paid", "Partially Paid", "Unpaid");
    }    

    @FXML
    private void addToArrayListBtnOnClick(MouseEvent event) {
       billArr.add(
            new BillList(  
                    Integer.parseInt(enterPatientIDTextField.getText()),
                    Integer.parseInt(enterDueTextField.getText()),
                    statusComboBox.getValue()    
                )
        );
    }

    @FXML
    private void createFileBtnOnClick(MouseEvent event) {
        FileWriter fw=null;
            try {
               
                
                File f = new File("BillList.txt");
                
                
                if(f.exists())
                    fw = new FileWriter(f,true);
                else 
                    fw = new FileWriter(f);
                    
                String str="";
                for(BillList tr: billArr){
                    str += tr.getPatiendId()+","+tr.getTotalDue()+","+tr.getPaidStatus()+","+ "\n";
                    
                }
                fw.write(str);  
                fw.close();
            } catch (IOException ex) {
                //fw.close();
                
            }
    }

    @FXML
    private void readFromTextFileBtnOnClick(MouseEvent event) {
        File file = new File("BillList.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            outputTextArea.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
                String[] tokens;
                tokens = str.split(",");
                str = "PatientId="+tokens[0]+", Total Due ="+tokens[1]
                        + ", Piad Status" + tokens[2];
                outputTextArea.appendText(str+"\n");
                //outputTxtArea.appendText("\n");               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewBillListController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    

