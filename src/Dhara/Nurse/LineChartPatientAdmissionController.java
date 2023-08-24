/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Nurse;

import Users.Nurse;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class LineChartPatientAdmissionController implements Initializable {
    
    private Nurse nurse;
    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @FXML
    private LineChart<String, Integer> patientAdmittedLineChart;
    @FXML
    private NumberAxis patientsYaxis;
    @FXML
    private CategoryAxis timeXaxis;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         initializeChart();
        // TODO
       
    }    

    private void initializeChart() {
         List<XYChart.Data<String, Integer>> chartData = Nurse.getAdmittedPatientsChartData();

        
        XYChart.Series<String, Integer> series = new XYChart.Series<>();
        series.setName("Admitted Patients");
        series.getData().addAll(chartData);

        
        patientAdmittedLineChart.getData().add(series);
    }
    
}
