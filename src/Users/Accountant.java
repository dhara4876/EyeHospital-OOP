/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import CommonScenes.RegisterSceneController;
import Model.Bill;

import Model.ExpenseRecord;
import Model.InsuranceRecord;
import Model.LoginInfo;
import Model.Treatment;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.text.Document;




/**
 *
 * @author Asus
 */
public class Accountant extends Employee implements Serializable{
    private static final long serialVersionUID = 345L;
    
   //goal 1
    public boolean addNewBill(Integer patientId,Integer accountantId, Integer totalDue, LocalDate dueBy){
        
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
    //goal 2
public void readBillLists(ObservableList<Bill> paidBillList, ObservableList<Bill> pendingBillList) {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BillObjects.bin"))) {
        while (true) {
            Bill bill = (Bill) ois.readObject();
            System.out.println("Bill read: " + bill.toString());
            if (bill.getPaidStatus()) {
                paidBillList.add(bill);
            } else {
                pendingBillList.add(bill);
            }
        }
    } catch (EOFException e) {
        
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error reading BillObjects.bin: " + e.getMessage());
    }
}
    

      //goal 3
    
  public static void editBillListAndRewrite(List<Bill> paidBillList, List<Bill> pendingBillList) {
     try {
        
        File billFile = new File("BillObjects.bin");
        if (billFile.exists()) {
            billFile.delete();
        }
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BillObjects.bin"))) {
            
            for (Bill bill : paidBillList) {
                oos.writeObject(bill);
            }
            
            
            for (Bill bill : pendingBillList) {
                oos.writeObject(bill);
            }
            
            System.out.println("BillList updated and written to BillObjects.bin");
        } catch (IOException e) {
            System.out.println("Error writing updated BillList to file");
        }
    } catch (Exception e) {
        System.out.println("Error deleting existing BillObjects.bin file");
    }
}
  
  
          //goal 7
        
    public static ObservableList<Bill> readAllBillsList(){
        ObservableList<Bill> billList = FXCollections.observableArrayList();
        Bill i;
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream (new FileInputStream("BillObjects.bin"));
            while(true){
                i = (Bill) ois.readObject();
                System.out.println("The Insurance u read: "+i.toString());
                billList.add(i);
            }
        }
        catch(IOException | ClassNotFoundException e){System.out.println("File reading done");}
        System.out.println(billList);
        return billList;
        
    }
  
  // goal 4
  



    
    public boolean CreateExpenseRecord(
        Double Amount, String SpentOn, LocalDate DateSpent, String Details){
        
        ExpenseRecord newExpense = new ExpenseRecord(
                Amount,
                SpentOn,
                DateSpent,
                Details
                );
        System.out.println("Expense record made:"+newExpense.toString());

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("ExpenseRecords.bin");

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
    //goal 3
 
  
    
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
        
    
    
        
     //goal 5
    
    public boolean CreateInsuranceRecord(String item, Double insuranceAmount, LocalDate dateOfIssue, String Details){
        
        
        InsuranceRecord newInsurance = new InsuranceRecord(
                item,
                insuranceAmount,
                dateOfIssue, Details);
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

      
    
  //goal 6
        
        public static ObservableList<InsuranceRecord> readInsuranceRecordList(){
        ObservableList<InsuranceRecord> InRecList = FXCollections.observableArrayList();
        InsuranceRecord i;
        ObjectInputStream ois = null;
        try{
            ois = new ObjectInputStream (new FileInputStream("InsuranceRecords.bin"));
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
        
         public static ArrayList<Treatment> readTreatmentList() {
        ArrayList<Treatment> treatmentList = new ArrayList<>();
        Treatment i;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Treatment.bin"));
            while (true) {
                i = (Treatment) ois.readObject();
                System.out.println("The Treatment you read: " + i.toString());
                treatmentList.add(i);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File reading done");
        }
        System.out.println(treatmentList);
        return treatmentList;
    }
    
    
    
    
    public Accountant(String name, Integer ID, String password, String email, String gender, LocalDate DOB, String Designation, Double Salary, LocalDate DoJ) {
        super(name, ID, password, email, gender, DOB, Designation, Salary, DoJ);
    }

    public LocalDate getDOJ() {
        return DOJ;
    }

    public Integer getID() {
        return ID;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDOB() {
        return DOB;
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
        return super.toString();
    }


    }
    
    
    
    

