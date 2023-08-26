/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;


import Model.TestDetails;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

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
public class ViewTestDetailsController implements Initializable {

    @FXML
    private TextField enterPatientIdTextField;
    @FXML
    private TextField enterTestResultsTextField1;
    @FXML
    private TextField enterTestingEquipmentsTextField11;
    @FXML
    private TextField enterDoctorNameTextField;
    @FXML
    private ComboBox<String> selectTestNameComboBox;
    @FXML
    private ComboBox<String> selectRecommendationComboBox1;
    
    
    @FXML
    private TextArea viewDetailsTextArea;
    
    private ArrayList<TestDetails>testDetailsList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        selectTestNameComboBox.getItems().addAll("Visual Acuity Test","Glaucoma Test","Color Blind Test",
                "Retinoscopy", "Ophthalmoscopy ", "Corneal Topography");
        selectRecommendationComboBox1.getItems().addAll("Recommended", "Not Recommended");
        
        testDetailsList = new ArrayList();
        
    }    

    
    

    @FXML
    private void viewTestDetailsBtnOnClick(MouseEvent event) {
        TestDetails test = new TestDetails(
                Integer.parseInt(enterPatientIdTextField.getText()),
                enterTestResultsTextField1.getText(),
                enterTestingEquipmentsTextField11.getText(),
                enterDoctorNameTextField.getText(),  
                selectTestNameComboBox.getValue(), 
                selectRecommendationComboBox1.getValue()
        );
        
        testDetailsList.add(test);
        
        viewDetailsTextArea.appendText(test.toString());
    }

    

   
}
        
    
        
    

      
 

    


    
    

