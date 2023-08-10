/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public abstract class Employee extends User implements Serializable{
    private static final long serialVersionUID = 13L;
    
    public String designation;
    protected double salary;
    protected final LocalDate DOJ;
    
    
}
