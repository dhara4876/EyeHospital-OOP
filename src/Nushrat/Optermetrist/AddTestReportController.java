/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;

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
public class AddTestReportController implements Initializable {

    @FXML
    private TextField enterPatientIDTextField;
    
    @FXML
    private TextArea outputTextArea;
    
    @FXML
    private TextField enterResultTextField;
    
    private ArrayList<TestReport> testReportArr;
    
    @FXML
    private ComboBox<String> statusComboBox;
    @FXML
    private ComboBox<String> testNameComboBox;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        testReportArr = new ArrayList<TestReport>();
        
        
        testNameComboBox.getItems().addAll("Visual Acuity Test","Glaucoma Test","Color Blind Test",
                "Retinoscopy", "Ophthalmoscopy ", "Corneal Topography");
        
        
        statusComboBox.getItems().addAll("Recommended","Not Recommended");
        
    }    
    

    @FXML
    private void addToArrayListBtnOnClick(MouseEvent event) {
        testReportArr.add(
            new TestReport(  
                    Integer.parseInt(enterPatientIDTextField.getText()),
                    testNameComboBox.getValue(),
                    enterResultTextField.getText(),
                    statusComboBox.getValue()  
                )
        );
    }

    @FXML
    private void createFileBtnOnClick(MouseEvent event) {
        
            FileWriter fw=null;
            try {
               
                
                File f = new File("TestReport.txt");
                
                
                if(f.exists())
                    fw = new FileWriter(f,true);
                else 
                    fw = new FileWriter(f);
                    
                String str="";
                for(TestReport tr: testReportArr){
                    str += tr.getPatientId()+","+tr.getTestName()+","+tr.getResult()+","+ tr.getReportStatus()+"\n";
                    
                }
                fw.write(str);  
                fw.close();
            } catch (IOException ex) {
                //fw.close();
                
            }
    }

    @FXML
    private void readFromTextFileBtnOnClick(MouseEvent event) {
        File file = new File("TestReport.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            outputTextArea.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
                String[] tokens;
                tokens = str.split(",");
                str = "PatientId="+tokens[0]+", Test Name="+tokens[1]
                        +", Results="+tokens[2]+ ", Report Status" + tokens[3];
                outputTextArea.appendText(str+"\n");
                //outputTxtArea.appendText("\n");               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddTestReportController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
