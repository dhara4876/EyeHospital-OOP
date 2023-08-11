/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Users;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class Patient implements Serializable {
    private String name;
    private Integer Id;

    public Patient(String name, Integer Id) {
        this.name = name;
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", Id=" + Id + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
}
