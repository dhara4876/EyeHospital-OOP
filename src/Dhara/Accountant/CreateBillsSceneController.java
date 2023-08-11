/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara;

import Model.Bill;
import Model.Cart;
import Model.Medicine;
import Model.Treatment;
import Users.Accountant;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
    
    private Label medicinePriceLabel;
    
    @FXML
    private ComboBox<Integer> patientComboBox;
    @FXML
    private Label patientNameLabel;
    @FXML
    private TextArea totalOutputTextField;
    
    private ArrayList<Medicine> medList = new ArrayList<>();
    private ArrayList <Treatment> treatmentList = new ArrayList<>();
    private ArrayList <Cart> cartList = new ArrayList<>();
    @FXML
    private DatePicker BilledOnDatePicker;
    @FXML
    private DatePicker DueByDatePicker;
    private TextField addPaidStatusTextField;
   
    
    

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
    private void addBillOnClick(ActionEvent event) {
        try{
            Boolean addStatus = Accountant.addNewBill(Integer.valueOf(patientComboBox.getValue()), Integer.valueOf(totalOutputTextField.getText()), BilledOnDatePicker.getValue(), DueByDatePicker.getValue(),addPaidStatusTextField.getText());

            if (addStatus) {
                Alert a = new Alert(AlertType.INFORMATION);
                a.setContentText("New Bill added");
                a.showAndWait();
            }
        } catch (IOException ex) {
            Logger.getLogger(CreateBillsSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
    @FXML
    private void onClickAddTreatmentButton(ActionEvent event) {
                       for (Cart c: cartList)
        {
            if (c.getProductName().equals(treatmentComboBox.getValue()))
            {
                int curval = Integer.parseInt(treatmentQuantityComboBox.getValue());
                
                if (curval + c.getQuantity() > 10)
                {
                    Alert a = new Alert(AlertType.ERROR);
                    
                    a.setContentText("Quantity exceeds the maximum allowed(10)");
                    
                    a.showAndWait();
                    return;
                }
                
                c.setQuantity(c.getQuantity() + curval);
                
                return;
            }
            cartList.add(new Cart(treatmentComboBox.getValue(), 
                Float.parseFloat(treatmentPriceLabel.getText()), 
                Integer.parseInt(treatmentQuantityComboBox.getValue())
        )); 
    }
    }

 
    @FXML
    private void backButtonOnClick(ActionEvent event) {
    }

    private void addMedicineOnClick(ActionEvent event) {
         for (Cart c: cartList)
        {
            if (c.getProductName().equals(medicineComboBox.getValue()))
            {
                int curval = Integer.parseInt(medicineQuantityComboBox.getValue());
                
                if (curval + c.getQuantity() > 10)
                {
                    Alert a = new Alert(AlertType.ERROR);
                    
                    a.setContentText("Quantity exceeds the maximum allowed(10)");
                    
                    a.showAndWait();
                    return;
                }
                
                c.setQuantity(c.getQuantity() + curval);
                
                return;
            }
    }
        cartList.add(new Cart(medicineComboBox.getValue(), 
                Float.parseFloat(medicinePriceLabel.getText()), 
                Integer.parseInt(medicineQuantityComboBox.getValue())
        )); 
    }

    private void onClickShowTotalButton(ActionEvent event) {
        
        int totalpayable = 0;
        for (Cart c: cartList)
        {
            totalpayable += c.getTotalAmount();
        }
            
        
        totalOutputTextField.setText(Integer.toString(totalpayable));
    }

    @FXML
    private void onClickMedQuantityCombobox(ActionEvent event) {
    }

    @FXML
    private void treatmentQuantityComboBox(ActionEvent event) {
    }

    @FXML
    private void onClickPatientComboBox(ActionEvent event) {
    }

    @FXML
    private void onClickAddMedicineButton(ActionEvent event) {
    }
        
    }
    

