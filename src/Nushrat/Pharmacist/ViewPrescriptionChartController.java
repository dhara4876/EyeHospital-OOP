/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Pharmacist;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ViewPrescriptionChartController implements Initializable {

    @FXML
    private PieChart pieChart;
    
    @FXML
    private TextField statusTextField;
    @FXML
    private TextField percentageTextField1;
    
    //collect slices for the piechart
    private ObservableList<PieChart.Data> ChartData= null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //inititalize empty data for chart
        ChartData= FXCollections.observableArrayList();
    }    

    @FXML
    private void loadChartBtnOnClk(MouseEvent event) {
        //get data
        String Status = statusTextField.getText();
        String value = percentageTextField1.getText();
        
        double percentage = Double.parseDouble(value);
        
        //add to pie chart data
        PieChart.Data data = new PieChart.Data(Status, percentage);
        ChartData.add(data);
        pieChart.setData(ChartData);
    }
    
}
