/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;

import Users.Optometrist;
import Users.User;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AddFeedbackOptometristController implements Initializable {
    private Optometrist optometrist;

    public Optometrist getOptometrist() {
        return optometrist;
    }

    public void setOptometrist(Optometrist optometrist) {
        this.optometrist = optometrist;
    }
    
    Alert unfill = new Alert(Alert.AlertType.WARNING, "FILL UP EVERYTHING");

    @FXML
    private TextField enterIdForFeedbackTextField;
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
    private void addFeddbackBtnOnClick(MouseEvent event) {
        int id = Integer.parseInt(enterIdForFeedbackTextField.getText());

        String feedback = feedbackTextArea.getText();
        if (feedback==null) {unfill.show(); return;}
        
         Boolean addStatus = User.addFeedBack(feedback );
        if (addStatus) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Feedback added by user id: " + id);
            a.showAndWait();
        }
        
    }
    
}
