/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat;

import Users.Optometrist;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class OptometristDashboardSceneController implements Initializable {
private Optometrist optometrist;

    public Optometrist getOptometrist() {
        return optometrist;
    }

    public void setOptometrist(Optometrist optometrist) {
        this.optometrist = optometrist;
    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}