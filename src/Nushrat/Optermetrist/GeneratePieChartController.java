/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;

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
public class GeneratePieChartController implements Initializable {

    @FXML
    private PieChart pieChart;
    @FXML
    private Label statusLabel;
    @FXML
    private TextField percentageOfColorTextField1;
    @FXML
    private TextField eyeColorTextField;
    
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
    

    
    private void labelMouseEnterOnClick(MouseEvent event) {
        statusLabel.setText("You are hoovering on the label");
    }

    @FXML
    private void loadChartButtonOnClick(MouseEvent event) {
        //get data
        String Eyecolor = eyeColorTextField.getText();
        String value = percentageOfColorTextField1.getText();
        
        double percentage = Double.parseDouble(value);
        
        //add to pie chart data
        PieChart.Data data = new PieChart.Data(Eyecolor, percentage);
        ChartData.add(data);
        pieChart.setData(ChartData);
    }
    
}
