/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;
import src.LinkedQueue;

/**
 *
 * @author Becky
 */
public class Electronics implements Inventoriable 
{
 
    private  double price;
    private  int size;
    private  String description;
    private  String category;
    private int barcode;
    private static int barcodeNumber=3000;
    String itemType;
    
     public Electronics() 
    {
        double newPrice = price;
        double newweight = size;
        String newcategory = category;
        int newbarcode=barcode;
        String newdescription =description;
        String newtypeOfElectronic=itemType;

    }

    public Electronics(String typeOfElectronic,double price, int weight, String description, String category, int barcode) 
    {
        this.price = price;
        this.size = weight;
        this.description = description;
        this.category = category;
        this.barcode = barcode;
        this.itemType=typeOfElectronic;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public int getBarcode() {
        return barcode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
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
    public static LinkedQueue<Electronics> ElectronicFactory(int size)
    {
        LinkedQueue<Electronics> electronicsQueue=new LinkedQueue<>();
        
        for(int i=0;i<=size;i++)
        {
            Electronics electronic=createRandomElectronic();
            electronicsQueue.enqueue(electronic);
        }
        return electronicsQueue;
    }
    
    public static Electronics createRandomElectronic()
    {
         Random rand=new Random();
        String[]electronicDescription={"Black","White", "Blue","Pink."};
        String [] electronicType={"SamSung iPhone","Apple iPhone","PlayStation","X-Box","small Samsung TV","Dell Laptop","MacBook Laptop","Medium Samsung TV","Large Samsung TV"}; 
        String  itemType=electronicType[rand.nextInt(electronicType.length)];
       double price=0.0;
       
       int size=0;
        switch (itemType) {
            case "SamSung iPhone":
                price=150.50;
                size=20;
                break;
            case "Apple iPhone":
                price=200.50;
                size=20;
                break;
            case "PlayStation":
                price=160.50;
                size=80;
                break;
            case "X-Box":
                price=200.50;
                size=80;
                break;
            case "small Samsung TV":
                price=160.50;
                size=40;
                break;
            case "Medium Samsung TV":
                price=460.50;
                size=60;
                break;
            case "Large Samsung TV":
                price=1060.50;
                size=100;
                break;
            case "Dell Laptop":
                price=460.50;
                size=40;
                break;
            case "MacBook Laptop":
                price=760.50;
                size=40;
                break;
            default:
                break;
        }
     
       String description=electronicDescription[rand.nextInt(electronicDescription.length)];
       String category="Electronic";
      
       Electronics electronic=new Electronics(itemType,price, size,description,category,barcodeNumber++);

        
        return electronic;
    }
    
 
    @Override
    public String toString() {
        return "Electronic= " + itemType +" " + "price=$" + price + ", weight=" + size + ", description=" + description + ", category=" + category + ", barcode=" + barcode +"\n";
    }

    @Override
    public String getItemType() {
        return itemType;
    }
    
    
    
    
    
}
