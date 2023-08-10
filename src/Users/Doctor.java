/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import java.io.Serializable;
import java.time.LocalDate;


public class Doctor extends Specialist implements Serializable {
    
     public Doctor(String name, Integer ID, String password, String email, String gender, LocalDate DOB, String Designation, Double Salary, LocalDate DoJ, String specialty) {
        super(name, ID, password, email, gender, DOB, Designation, Salary, DoJ, specialty);
     }
    
}

    
