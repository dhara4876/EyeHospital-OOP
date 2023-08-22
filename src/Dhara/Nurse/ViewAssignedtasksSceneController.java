/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Nurse;

import Model.Task;
import Users.Nurse;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Asus
 */


  
public class ViewAssignedtasksSceneController implements Initializable {
    
    private Nurse nurse; 
    @FXML
    private TableColumn<Task, Integer> senderIDTableColoumn;
    @FXML
    private TableColumn<Task, Boolean> completedStatusTableColoumn;

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
         taskTableView.setItems(nurse.getTasksForNurse());
    }
    


    @FXML
    private TableView<Task> taskTableView;
    @FXML
    private TableColumn<Task, String> taskTableColoumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        senderIDTableColoumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        taskTableColoumn.setCellValueFactory(new PropertyValueFactory<>("details"));
        completedStatusTableColoumn.setCellValueFactory(new PropertyValueFactory<>("completedStatus"));
    }    

    @FXML
    private void markAsDoneOnClick(ActionEvent event) {
        Task selectedTask = taskTableView.getSelectionModel().getSelectedItem(); // Get selected task from the TableView
    if (selectedTask != null) {
        // Show a confirmation alert before marking the task as completed
        Alert confirmationAlert = new Alert(AlertType.CONFIRMATION);
        confirmationAlert.setTitle("Confirm Completion");
        confirmationAlert.setHeaderText("Confirm Task Completion");
        confirmationAlert.setContentText("Are you sure you want to mark this task as completed?");
        confirmationAlert.showAndWait().ifPresent(result -> {
            if (result == ButtonType.OK) {
                
                nurse.markTaskCompleted(selectedTask);

            
                taskTableView.getItems().remove(selectedTask);

               
                Alert successAlert = new Alert(AlertType.INFORMATION);
                successAlert.setTitle("Task Completed");
                successAlert.setHeaderText(null);
                successAlert.setContentText("Task marked as completed successfully!");
                successAlert.showAndWait();
            }
        });
    } else {
        
        Alert errorAlert = new Alert(AlertType.ERROR);
        errorAlert.setTitle("Error");
        errorAlert.setHeaderText(null);
        errorAlert.setContentText("Please select a task to mark as completed.");
        errorAlert.showAndWait();
    }
    
    }
    } 
 