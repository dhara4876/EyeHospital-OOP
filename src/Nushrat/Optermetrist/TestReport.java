/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nushrat.Optermetrist;

/**
 *
 * @author user
 */
public class TestReport {
    private int patientId;
    private String testName;
    private String result;
    private String reportStatus;

    public TestReport(int patientId, String testName, String result, String reportStatus) {
        this.patientId = patientId;
        this.testName = testName;
        this.result = result;
        this.reportStatus = reportStatus;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    @Override
    public String toString() {
        return "TestReport{" + "patientId=" + patientId +
                ", testName=" +  testName + 
                ", result=" + result + ","
                + " reportStatus="  + reportStatus + '}';
    }
    
    
    
}
