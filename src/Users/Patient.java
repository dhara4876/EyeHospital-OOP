/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Asus
 */

public class Patient extends User implements Serializable {
    private static final long serialVersionUID = 345L;

    public Patient(String name, int ID, String password, String email, String gender, LocalDate DOB) {
        super(name, ID, password, email, gender, DOB);


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
        return "Patient{" + '}';
    }


}
    
    

 