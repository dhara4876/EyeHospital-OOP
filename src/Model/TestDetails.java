/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author user
 */
public class TestDetails {
    private int patientId;
    private String testName;
    private LocalDate testDate;
    private String testResults;
    private String testingEquipments;
    private String performedBy;
    private String recommendation;

    public TestDetails(int patientId, String testName, LocalDate testDate, String testResults, String testingEquipments, String performedBy, String recommendation) {
        this.patientId = patientId;
        this.testName = testName;
        this.testDate = testDate;
        this.testResults = testResults;
        this.testingEquipments = testingEquipments;
        this.performedBy = performedBy;
        this.recommendation = recommendation;
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

    public LocalDate getTestDate() {
        return testDate;
    }

    public void setTestDate(LocalDate testDate) {
        this.testDate = testDate;
    }

    public String getTestResults() {
        return testResults;
    }

    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }

    public String getTestingEquipments() {
        return testingEquipments;
    }

    public void setTestingEquipments(String testingEquipments) {
        this.testingEquipments = testingEquipments;
    }

    public String getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(String performedBy) {
        this.performedBy = performedBy;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    @Override
    public String toString() {
        return "TestDetails{" + "patientId=" + patientId + ", testName=" + testName + ", testDate=" + testDate + ", testResults=" + testResults + ", testingEquipments=" + testingEquipments + ", performedBy=" + performedBy + ", recommendation=" + recommendation + '}';
    }
    
    
    
}
