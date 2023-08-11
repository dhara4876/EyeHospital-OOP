/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara;

import Model.Medicine;
import Model.Treatment;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class CreateBillsSceneController implements Initializable {

 

    @FXML
    private ComboBox<String> treatmentComboBox;
    @FXML
    private ComboBox<String> medicineComboBox;
    @FXML
    private ComboBox<String> treatmentQuantityComboBox;
    @FXML
    private ComboBox<String> medicineQuantityComboBox;
    @FXML
    private Label treatmentPriceLabel;
    
    @FXML
    private Label medicinePriceLabel;
    
    @FXML
    private ComboBox<Integer> patientComboBox;
    @FXML
    private Label patientNameLabel;
    @FXML
    private TextArea totalOutputTextField;
    
    private ArrayList<Medicine> medList = new ArrayList<>();
    private ArrayList <Treatment> treatmentList = new ArrayList<>();
    @FXML
    private DatePicker BilledOnDatePicker;
    @FXML
    private DatePicker DueByDatePicker;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        medList.add(new Medicine("Square painkiller",100));
        medList.add(new Medicine("Beximco Eye Drop",200));
        medList.add(new Medicine("BD eye hospital special medicine",300));
        medList.add(new Medicine("Poison",400));
        medList.add(new Medicine("Eye Cancer drops",500));
        
        for(Medicine m: medList){
            medicineComboBox.getItems().add(m.getMedicineName());
        }
        
        treatmentList.add(new Treatment("eye cancer chemo",40000));
        treatmentList.add(new Treatment("Lasik surgery",50000));
        treatmentList.add(new Treatment("Just Checkup",900));
        treatmentList.add(new Treatment("Normal Surgery",10000));
        
        for(Treatment t: treatmentList){
            medicineComboBox.getItems().add(t.getTreatmentName());
        }
        
        
        
        
        for (int i = 0; i <= 10; i++) {
            medicineQuantityComboBox.getItems().add(Integer.toString(i));
            treatmentQuantityComboBox.getItems().add(Integer.toString(i));
        }
        // TODO
    }    

    @FXML
    private void onClickTreatmentComboBox(ActionEvent event) {
        for (Treatment t: treatmentList)
            if (treatmentComboBox.getValue().equals(t.getTreatmentName()))
            {
                treatmentPriceLabel.setText(Float.toString(t.getTreatmentCost()));
                
            }
        
        
       
    }

    @FXML
    private void onClickMedsComboBox(ActionEvent event) {
         for (Medicine m: medList)
            if (medicineComboBox.getValue().equals(m.getMedicineName()))
            {
                medicinePriceLabel.setText(Float.toString(m.getMedicinePrice()));
                
            }
    }


    @FXML
    private void onClickMedQuantityCombobox(ActionEvent event) {
    }


    @FXML
    private void addBillOnClick(ActionEvent event) {
    }

    @FXML
    private void onClickAddTreatmentButton(ActionEvent event) {
    }


    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }
    
}
