/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import Model.Bill;
import Model.ChartData;
import Model.ExpenseRecord;
import Model.InsuranceRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Asus
 */
public class Accountant extends Employee implements Serializable{
    private static final long serialVersionUID = 345L;
    
    public static boolean addNewBill(Integer patientId,Integer accountantId, Integer totalDue, LocalDate dueBy){
        
        Bill newBill = new Bill(
                patientId,
                accountantId,
                totalDue,
                dueBy);
               
                
                
        System.out.println("Bill made:"+newBill.toString());

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("BillObjects.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newBill);
            oos.close();
            return true;
            
        } catch (IOException e) {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Error writing Object to binary file");
            return false;
       
        }
    }
    
    public static ObservableList<Bill> readBillList(){
        ObservableList<Bill> BillList = FXCollections.observableArrayList();
        Bill b;
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream (new FileInputStream("BillObjects.bin"));
            while(true){
                b = (Bill) ois.readObject();
                System.out.println("The faculty u read: "+b.toString());
                BillList.add(b);
            }
        }
        catch(IOException | ClassNotFoundException e){System.out.println("File reading done");}
        System.out.println(BillList);
        return BillList;
    }
    
     public static ObservableList<String> getPatientList(){
        Set<String> patientSet = new HashSet<>();
        ObservableList<Bill> BillList = readBillList();
        for (Bill i : BillList) {
            patientSet.add(Integer.toString(i.getPatientId()));
        }
        System.out.println(patientSet.toString());
        ObservableList<String> patientList = FXCollections.observableArrayList(patientSet);
        return patientList;
    }
     
 

     
    public static ObservableList<ChartData> readChartDataList() {
        ObservableList<ChartData> ChartList = FXCollections.observableArrayList();
        ChartData b;
        List<Bill> dataList = Accountant.readBillList();
        for (Bill data : dataList) {

            Integer patientId = data.getPatientId(); // Get patientId from original object
            Integer totalDue = data.getTotalDue();
            ChartData barChartData = new ChartData(patientId, totalDue);
            ChartList.add(barChartData);

        }
        return ChartList;
  


     }
    
    public static boolean CreateExpenseRecord(
        Double Amount, String SpentOn, LocalDate DateSpent){
        
        ExpenseRecord newExpense = new ExpenseRecord(
                Amount,
                SpentOn,
                DateSpent
                
                );
        System.out.println("Expense record made:"+newExpense.toString());

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("BillObjects.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newExpense);
            oos.close();
            return true;
            
        } catch (IOException e) {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Error writing Object to binary file");
            return false;
       
        }
    }
    
    
    public static ObservableList<ExpenseRecord> readExpenseRecordList() {
        ObservableList<ExpenseRecord> ExpenseList = FXCollections.observableArrayList();
        ExpenseRecord v;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("ExpenseRecords.bin"));
            while (true) {
                v = (ExpenseRecord) ois.readObject();
                System.out.println("The faculty u read: " + v.toString());
                ExpenseList.add(v);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(ExpenseList);
        return ExpenseList;
    }
        
        
    
    
    public static boolean CreateInsuranceRecord(String item, Double insuranceAmount, LocalDate dateOfIssue){
        
        
        InsuranceRecord newInsurance = new InsuranceRecord(
                item,
                insuranceAmount,
                dateOfIssue);
        System.out.println("Insurance made:"+newInsurance.toString());

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("InsuranceRecords.bin");

            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newInsurance);
            oos.close();
            return true;
            
        } catch (IOException e) {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException ex) {
                    Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("Error writing Object to binary file");
            return false;
       
        }
    }
        
        
    
    
 
        
        public static ObservableList<InsuranceRecord> readInsuranceRecordList(){
        ObservableList<InsuranceRecord> InRecList = FXCollections.observableArrayList();
        InsuranceRecord i;
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream (new FileInputStream("BillObjects.bin"));
            while(true){
                i = (InsuranceRecord) ois.readObject();
                System.out.println("The Insurance u read: "+i.toString());
                InRecList.add(i);
            }
        }
        catch(IOException | ClassNotFoundException e){System.out.println("File reading done");}
        System.out.println(InRecList);
        return InRecList;
        
    }
    
    
    
    
    public Accountant(String name, Integer ID, String password, String email, String gender, LocalDate DOB, String Designation, Double Salary, LocalDate DoJ) {
        super(name, ID, password, email, gender, DOB, Designation, Salary, DoJ);
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Accountant{" + '}';
    }
    
    
    
    
}
