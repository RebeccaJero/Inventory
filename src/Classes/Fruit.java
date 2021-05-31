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
public class Fruit implements Inventoriable 
{
    
    private  double price;
    private  int size;
    private  String description;
    private  String category;
    private int barcode;
    private static int barcodeNumber=1000;
    String itemType;

    public Fruit() 
    {
        double newPrice = price;
        double newweight = size;
        String newcategory = category;
        int newbarcode=barcode;
        String newdescription =description;
        String newtypeOfFruit=itemType;

    }

    public Fruit(String typeOfFruit,double price, int weight, String description, String category, int barcode) 
    {
        this.price = price;
        this.size = weight;
        this.description = description;
        this.category = category;
        this.barcode = barcode;
        this.itemType=typeOfFruit;
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
    public static LinkedQueue<Fruit> fruitfactory(int size)
    {
        LinkedQueue<Fruit> fruitQueue=new LinkedQueue<>();
        
        for(int i=0;i<=size;i++)
        {
            Fruit fruit=createRandomFruit();
            fruitQueue.enqueue(fruit);
        }
        return fruitQueue;
    }
    
    public static Fruit createRandomFruit()
    {
         Random rand=new Random();
        String[]fruitDescription={"Green,100% Vitamin C good for your health","Yellow Full of antioxidants good for healing", "Blue Full of Vitamin A good for energy","Green-Yellow 60% vitamin C and antioxidants good for health booster."};
        String [] fruitTypes={"Mango","Kiwi","Pinneaple","Apple","Banana","Strawberrie","WaterMelon."}; 
       double price=0.0;
       int barcodeNum=1000;
       int weight=rand.nextInt(4-1+1)+1;
        if(weight<=1)
        {
            price=2.50;
        }
        else if(weight>1&&weight<=2)
        {
            price=3.50;
        }
        else if(weight>2&&weight<=4)
        {
            price=4.50;
        }
        
       //barcodeNumber++;
       String description=fruitDescription[rand.nextInt(fruitDescription.length)];
       String category="Fruit";
       String  itemType=fruitTypes[rand.nextInt(fruitTypes.length)];
       Fruit fruit=new Fruit(itemType,price, weight,description,category,barcodeNumber++);

        
        return fruit;
    }
    
 
    @Override
    public String toString() {
        return "Fruit'{'Fruit Type= " + itemType +" " + "price=$" + price + ", weight=" + size + ", description=" + description + ", category=" + category + ", barcode=" + barcode + '}'+"\n";
    }

    @Override
    public String getItemType() {
        return itemType;
    }
    
    
    
    
}
