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
public class Vegetables implements Inventoriable 
{
    private  double price;
    private  int size;
    private  String description;
    private  String category;
    private  int barcode;
    String itemType;
    private static int barcodeNumber=2000;

    public Vegetables() 
    {
        double newPrice = price;
        double newweight = size;
        String newcategory = category;
        int newbarcode = barcode;
        String newdescription =description;
        String newtypeOfFruit=itemType;
      
    }
    public Vegetables(String typeOfVeggie,double price, int weight, String description, String category, int barcode) 
    {
        this.price = price;
        this.size = weight;
        this.description = description;
        this.category = category;
        this.barcode = barcode;
        this.itemType=typeOfVeggie;
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

    @Override
    public String getItemType() {
       return itemType;
    }
    
   
      public static LinkedQueue<Vegetables> veggieFactory(int size)
    {
        LinkedQueue<Vegetables> veggieQueue=new LinkedQueue<>();
        
        for(int i=0;i<=size;i++)
        {
            Vegetables vegetable=createRandomVeggie();
            veggieQueue.enqueue(vegetable);
        }
        return veggieQueue;
    }
      
    public static Vegetables createRandomVeggie()
    {
       Random rand=new Random();
       String[]veggieDescription={"Green,100% Vitamin C good for your health","Yellow Full of antioxidants good for healing", "Blue Full of Vitamin A good for energy","Green-Yellow 60% vitamin C and antioxidants good for health booster."};
       String [] vegetableTypes={"Lettuce","Spinach","Carrot","Celery","Green Pepper","Yellow Pepper","Cilantro."}; 
       double price=0.0;
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
        
        String description=veggieDescription[rand.nextInt(veggieDescription.length)];
        String category="Vegetable";
        String itemType=vegetableTypes[rand.nextInt(vegetableTypes.length)];
        Vegetables vegetable=new Vegetables(itemType,price, weight,description,category,barcodeNumber++);
      
        return vegetable;
    }  

    @Override
    public String toString() {
        return "Vegetables{" + "price=" + price + ", weight=" + size + ", description=" + description + ", category=" + category + ", barcode=" + barcode + ", itemType=" + itemType + '}';
    }
      
      
}
