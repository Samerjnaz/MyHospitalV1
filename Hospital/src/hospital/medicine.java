/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author faisa
 */
public class medicine {
    
    private String medicineID;
    private String name;
    private String type;
    private double cost;
    private boolean instock;
    private String manual;
    private String medicineDescription;

    public medicine(String medicineID, String name, String type, double cost, boolean instock, String manual, String medicineDescription) {
        this.medicineID = medicineID;
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.instock = instock;
        this.manual = manual;
        this.medicineDescription = medicineDescription;
    }
    

    public String getManual() {
        return manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    public boolean isInstock() {
        return instock;
    }

    public void setInstock(boolean instock) {
        this.instock = instock;
    }
    

    public String getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(String medicineID) {
        this.medicineID = medicineID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getMedicineDescription() {
        return medicineDescription;
    }

    public void setMedicineDescription(String medicineDescription) {
        this.medicineDescription = medicineDescription;
    }

    @Override
    public String toString() {
        return "medicine{" + "medicineID=" + medicineID + ", name=" + name + ", type=" + type + ", cost=" + cost + ", instock=" + instock + ", manual=" + manual + ", medicineDescription=" + medicineDescription + '}';
    }

    
}
