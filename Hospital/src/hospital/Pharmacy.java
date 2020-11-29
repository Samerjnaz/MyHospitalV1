/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;

/**
 *
 * @author faisa
 */
public class Pharmacy {
    
 private String name;
 private String location;
 private  ArrayList<String> staff=new ArrayList<String>();
 private ArrayList<medicine> medcines=new ArrayList<medicine>();
 
 
    public ArrayList<String> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<String> staff) {
        this.staff = staff;
    }
 

    public ArrayList<medicine> getMedcines() {
        return medcines;
    }

    public void setMedcines(ArrayList<medicine> medcines) {
        this.medcines = medcines;
    }

 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pharmacy(String name, String location) {
        this.name = name;
        this.location = location;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
 
 
     @Override
    public String toString() {
        return "Pharmacy{" + "name=" + name + ", location=" + location + '}';
    }
}