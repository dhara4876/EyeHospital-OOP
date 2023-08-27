/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daiyan;

import CommonScenes.StartSceneController;
import Users.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Tonmoy
 */
public class AddFeedBackController implements Initializable {

    @FXML
    private TextArea feedbackTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addFeedBackButtonOnClick(ActionEvent event) {
        Alert unfill = new Alert(Alert.AlertType.WARNING, "FILL UP EVERYTHING");
        
        String feedback = feedbackTextArea.getText();
        if (feedback==null) {unfill.show(); return;}
        
        Boolean addStatus = User.addFeedBack(feedback);
        
        if (addStatus) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Feedback added");
            a.showAndWait();
        }
    }
    
    public void backToAddEmployeeSceneOnClick(ActionEvent event) {
        try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("AddEmployee.fxml"));
            Scene scene2 = new Scene(scene2Parent);

            Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg2.setScene(scene2);
            stg2.show();
        } catch (IOException ex) {
            Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
