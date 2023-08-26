/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;

import Users.Optometrist;
import Users.User;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class SendTaskToNurseController implements Initializable {

    @FXML
    private TextField enterAssignerIdTextField;
    @FXML
    private TextField enterReceiverIdTextField;
    @FXML
    private TextArea writeTaskDetailsTextArea;
    @FXML
    private ComboBox<String> taskStatusComboBox;
    
     private Optometrist optometrist;

    public Optometrist getOptometrist() {
        return optometrist;
    }

    public void setOptometrist(Optometrist optometrist) {
        this.optometrist = optometrist;
    }
    
    Alert unfill = new Alert(Alert.AlertType.WARNING, "FILL UP EVERYTHING");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
           
        taskStatusComboBox.getItems().addAll("Complete", "Incomplete");
    }    

    @FXML
    private void addTaskBtnOnClick(MouseEvent event) {
        int Assigner_id = Integer.parseInt(enterAssignerIdTextField.getText());
        int Receiver_id = Integer.parseInt(enterReceiverIdTextField.getText());
        String Task_Status= taskStatusComboBox.getValue();

        String feedback = writeTaskDetailsTextArea.getText();
        if (feedback==null) {unfill.show(); return;}
        
         Boolean addStatus = User.addFeedBack(feedback );
        if (addStatus) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Task added by user id: " + Assigner_id + "to Nurse id: "+ Receiver_id 
            +"Task Status: "+ Task_Status );
            a.showAndWait();
        }
        
    }
    }
    
    

