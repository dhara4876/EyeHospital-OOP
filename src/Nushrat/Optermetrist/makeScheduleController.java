/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;

import Model.Schedule;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class makeScheduleController implements Initializable {
    //add new schedule stuff
    @FXML
    private TextField enterIDTextField;
    @FXML
    private ComboBox<String> selectTaskComboBox;
    @FXML
    private DatePicker dateOfScheduleDatePicker;
    @FXML
    private TextField enterTimeTextField;
    @FXML
    //table stuffs
    private TableView<Schedule> scheduleTableView;
    @FXML
    private TableColumn<Schedule,Integer> idTableColumn;
    @FXML
    private TableColumn<Schedule, String> taskTableColumn;
    @FXML
    private TableColumn<Schedule, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<Schedule, String> timeTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //comboBox For Task
        selectTaskComboBox.getItems().addAll("Eye Examination","Contact Lens Fitting"
                ,"Color Vision Testing");
        //set up the columns in the table
        idTableColumn.setCellValueFactory(new PropertyValueFactory<Schedule,Integer>("ID"));
        taskTableColumn.setCellValueFactory(new PropertyValueFactory<Schedule,String>("Task"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<Schedule,LocalDate>("Date"));
        timeTableColumn.setCellValueFactory(new PropertyValueFactory<Schedule,String>("Time"));
        
           
        
        //Allow task, time to be edittable
        scheduleTableView.setEditable(true);
        taskTableColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        timeTableColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        
        
        
        //allow the table to select multiple rows at once
        scheduleTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    

    @FXML
    private void addScheduleToListBtnOnClk(MouseEvent event) {
        Schedule newSchedule = new Schedule(Integer.parseInt(enterIDTextField.getText()),
                                       selectTaskComboBox.getValue(),
                                       dateOfScheduleDatePicker.getValue(),
                                       enterTimeTextField.getText()
                                    );
        //tableView.getItems().add(0,newPerson);
        scheduleTableView.getItems().add(newSchedule);
    }
    ////updating task by clicking a corresponding table cell
    public void changeTaskCellEvent(TableColumn.CellEditEvent edittedCell){
        Schedule idSelected = scheduleTableView.getSelectionModel().getSelectedItem();
        idSelected.setTask(edittedCell.getNewValue().toString());
    }
    
    //updating time by clicking a corresponding table cell
    @FXML
    public void changeTimeCellEvent(TableColumn.CellEditEvent edittedCell){
        Schedule idSelected = scheduleTableView.getSelectionModel().getSelectedItem();
        idSelected.setTime(edittedCell.getNewValue().toString());
    }
    
    public ObservableList<Schedule> getSchedule(){
        ObservableList<Schedule> values = FXCollections.observableArrayList();
        
        
        
        return values;
    } 

    @FXML
    private void clearScheduleRowBtnOnClk(MouseEvent event) {
        ObservableList<Schedule> selectedRows, allpatient;
        allpatient = scheduleTableView.getItems();
        selectedRows = scheduleTableView.getSelectionModel().getSelectedItems();
        
        for(Schedule s: selectedRows){
            allpatient.remove(s);
        }
    }
    
}
