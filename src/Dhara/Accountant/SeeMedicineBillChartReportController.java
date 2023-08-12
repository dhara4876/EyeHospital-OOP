/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Accountant;

import CommonScenes.StartSceneController;
import Model.ChartData;
import Users.Accountant;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class SeeMedicineBillChartReportController implements Initializable {




    @FXML
    private BarChart<Integer, Integer> BillBarChart;
    @FXML
    private NumberAxis xaxis;
    @FXML
    private CategoryAxis yaxis;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        XYChart.Series<Integer, Integer> series = new XYChart.Series<>();
        ObservableList<ChartData> chartDataList = Accountant.readChartDataList();

        for (ChartData chartData : chartDataList) {
            series.getData().add(new XYChart.Data<>(chartData.getPatientId(), chartData.getTotalDue()));
        }

        BillBarChart.getData().add(series);
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        
          try {
            Parent scene2Parent = FXMLLoader.load(getClass().getResource("BillMenuItemScene.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            
            Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();
            
            
            
            stg2.setScene(scene2);
            stg2.show();
        } catch (IOException ex) {
            Logger.getLogger(StartSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }


    

