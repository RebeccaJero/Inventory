/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Becky
 */
public abstract class AbstractItem 
{

    private double price;
    private double weight;
    private String description;
    private String category;
    private int barcode;
    
      public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }
    
   
    
}
