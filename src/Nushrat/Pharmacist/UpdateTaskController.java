/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Pharmacist;


import Model.Task;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.util.converter.IntegerStringConverter;

/**
 * FXML Controller class
 *
 * @author user
 */
public class UpdateTaskController implements Initializable {

    @FXML
    private TextField medNameTextField;
    @FXML
    private TextField doseTextField1;
    @FXML
    private TextField instructionTextField11;
    @FXML
    private TextField timeTextField111;
    @FXML
    private TableView<Task> updateTaskTableView;
    @FXML
    private TableColumn<Task ,String> medNameTableColumn;
    @FXML
    private TableColumn<Task,Integer > doseTableColumn;
    @FXML
    private TableColumn<Task, String> timeTableColumn;
    @FXML
    private TableColumn<Task, String> instructionTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //set up the columns in the table
        medNameTableColumn.setCellValueFactory(new PropertyValueFactory<Task,String>("Medicine Name"));
        doseTableColumn.setCellValueFactory(new PropertyValueFactory<Task,Integer>("Dose"));
        timeTableColumn.setCellValueFactory(new PropertyValueFactory<Task,String>("Time"));
        instructionTableColumn.setCellValueFactory(new PropertyValueFactory<Task,String>("Instruction"));
        
        //Allow task, date, time to be edittable
        updateTaskTableView.setEditable(true);
        medNameTableColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        doseTableColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        timeTableColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        instructionTableColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        
        
        
        //allow the table to select multiple rows at once
        updateTaskTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    
    

    @FXML
    private void addTaskBtnOnClk(MouseEvent event) {
        Task upTask = new Task(medNameTextField.getText(),
                                       Integer.parseInt(doseTextField1.getText()),
                                       instructionTextField11.getText(),
                                       timeTextField111.getText()
                                    );
        //tableView.getItems().add(0,newPerson);
        updateTaskTableView.getItems().add(upTask);
        
    }
    //updating medName by clicking a corresponding table cell
    public void changeMedNameCellEvent(TableColumn.CellEditEvent edittedCell){
        Task idSelected = updateTaskTableView.getSelectionModel().getSelectedItem();
        idSelected.setMedicineName(edittedCell.getNewValue().toString());
    }
    
    //updating dose by clicking a corresponding table cell
   
    public void changeDoseCellEvent(TableColumn.CellEditEvent<Task, Integer> edittedCell){
        Task idSelected = updateTaskTableView.getSelectionModel().getSelectedItem();
        idSelected.setDose(edittedCell.getNewValue());

    }
    //updating Instructions by clicking a corresponding table cell
    public void changeInstructionsCellEvent(TableColumn.CellEditEvent edittedCell){
        Task idSelected = updateTaskTableView.getSelectionModel().getSelectedItem();
        idSelected.setInstructions(edittedCell.getNewValue().toString());
    }
    
    //updating Time by clicking a corresponding table cell
    public void changeTimeCellEvent(TableColumn.CellEditEvent edittedCell){
        Task idSelected = updateTaskTableView.getSelectionModel().getSelectedItem();
        idSelected.setTime(edittedCell.getNewValue().toString());
    }
    
    
    
    public ObservableList<Task> getTask(){
        ObservableList<Task> values = FXCollections.observableArrayList();
        
        
        
        return values;
    } 


    @FXML
    private void clearTaskBtnOnClk(MouseEvent event) {
        ObservableList<Task> selectedRows, allPeople;
        allPeople = updateTaskTableView.getItems();
        selectedRows = updateTaskTableView.getSelectionModel().getSelectedItems();
        
        for(Task t: selectedRows){
            allPeople.remove(t);
        }
    }
    
    }
    
