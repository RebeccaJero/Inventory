/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventory;

import Classes.Electronics;
import Classes.Fruit;
import Classes.Vegetables;
import Classes.Inventoriable;
import Comparators.BarcodeComparator;
import Comparators.CategoryComparator;
import Comparators.DescriptionComparator;
import Comparators.ItemTypeComparator;
import Comparators.PriceComparator;
import static Comparators.Sort.mergeSort;
import Comparators.WeightComparator;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import src.AVLTreeMap;
import src.Entry;
import src.LinkedQueue;


/**
 *
 * @author Becky
 */
public class Main
{
    
  
   public static AVLTreeMap<Integer,Inventoriable>inventory;
    public static void main(String[] args) 
    {
        InventoryJFrame inventoryFrame=new InventoryJFrame();
        inventoryFrame.setVisible(true);
        
        
     
       inventory=new AVLTreeMap<>();
       LinkedQueue<Fruit> fruitQueue=Fruit.fruitfactory(100);
       LinkedQueue<Vegetables> veggieQueue=Vegetables.veggieFactory(100); 
       LinkedQueue<Electronics> electronicQueue=Electronics.ElectronicFactory(100); 
       
       LinkedQueue<Inventoriable> storeItems=Inventoriable.getItems(fruitQueue,veggieQueue,electronicQueue);
       putItemsToTree(storeItems);
       
  

    
    }
    
    public static String putItemsToTree(LinkedQueue<Inventoriable>storeItems)
    {
       int newKey=1;
       while(!storeItems.isEmpty())
       {
          int keyValue=storeItems.first().getBarcode()/1000;
          Inventoriable item=storeItems.first();
           int key=item.getBarcode();
          if(keyValue==1)
          {    
              inventory.put(newKey, item);
              
          }
          if(keyValue==2)
          {
            
              inventory.put(newKey,item);
          }
            
           else if(keyValue==3)
          {
               inventory.put(newKey,item);
          }
            
           else if(keyValue==4)
          {
               inventory.put(newKey,item);
              
          }
          
           storeItems.dequeue();
           newKey++;
       }
       
       String showList=printCategories();
       
       return showList;
    }
    
    
    
    
    public static String printCategories()
    {
        
      String allCategories=" ";
      String categoryPrint1="" ; 
      String categoryPrint2="" ; 
      String categoryPrint3="" ; 
      String categoryPrint4="" ; 
      int categoryCounter=0;
      
       for(int i=1;i<inventory.size();i++)
       {
          int barcode=inventory.get(i).getBarcode()/1000;
          switch (barcode) {
              case 1:
                  categoryPrint1=inventory.get(i).getCategory();
                  categoryCounter=barcode;
                  break;
              case 2:
                  categoryPrint2=inventory.get(i).getCategory();
                  categoryCounter=barcode;
                  break;
              case 3:
                  categoryPrint3=inventory.get(i).getCategory();
                  categoryCounter=barcode;
                  break;
              case 4:
                  categoryPrint4=inventory.get(i).getCategory();
                  categoryCounter=barcode;
                  break;
              default:
                  break;
          }
            
          
         
       }
      
        allCategories+=" Categories Include:\n" + categoryPrint1 + "\n" + categoryPrint2 + "\n" + categoryPrint3 + "\n" + categoryPrint4+  ""+ "Number Of Categories:" + categoryCounter;
        return allCategories;
    }
   
     public static ArrayList printItemsfromCategory(String category)
     {
        ArrayList<Inventoriable> itemlist=new ArrayList(); 
        String printCategory="";
        int categoryCounter=-1;
        Iterable<Entry<Integer,Inventoriable>> iterable=inventory.entrySet();
        Iterator<Entry<Integer,Inventoriable>>iterator=iterable.iterator();
        
        while(iterator.hasNext())
        {
            Inventoriable item=iterator.next().getValue();
            
            if(item.getCategory().equals(category))
            {
               itemlist.add(item);
              
            }
            
            
        }
        
        return itemlist;
     } 
  
     public static ArrayList printItemType(String itemType)
     {
         ArrayList<Inventoriable> itemlist=new ArrayList();
         String printItemType=""; 
         int itemTypeCounter=0;
        Iterable<Entry<Integer,Inventoriable>> iterable=inventory.entrySet();
        Iterator<Entry<Integer,Inventoriable>>iterator=iterable.iterator();
        
        while(iterator.hasNext())
        {
            Inventoriable item=iterator.next().getValue();
            
            if(item.getItemType().equals(itemType))
            {

                itemlist.add(item);
            }
            
            
        }

         return itemlist;
     }
     
     
     public static String getBarcodeFromList(int barcode)
     {
         ArrayList<Inventoriable> inventoriable=new ArrayList<Inventoriable>();
         String barcodeItem=" ";
         Iterable<Entry<Integer,Inventoriable>> iterable=inventory.entrySet();
         Iterator<Entry<Integer,Inventoriable>>iterator=iterable.iterator();
        
        while(iterator.hasNext())
        {
            Inventoriable item=iterator.next().getValue();
            
            if(item.getBarcode()==barcode)
            {
                inventoriable.add(item);
            }
            
            
        }
        
        
        if(inventoriable.size()>0)
        {
            barcodeItem = inventoriable.stream().map((i) -> barcode+ " Barcode found for Item: " + i.getItemType() + " Category: " + i.getCategory() + " Description:  " + i.getDescription() + " Price " + i.getPrice() + "$\n").reduce(barcodeItem, String::concat);
        }else
        {
            barcodeItem="Sorry that barcode is not availabe in the inventory. ";
        }
        
         
         return barcodeItem;
         
     }
     
     public static ArrayList getWeightFromList(int weight)
     {
         ArrayList<Inventoriable> weightList=new ArrayList();
         ArrayList<Inventoriable> inventoriable=new ArrayList<Inventoriable>();
         String weightFound=" ";
         Iterable<Entry<Integer,Inventoriable>> iterable=inventory.entrySet();
         Iterator<Entry<Integer,Inventoriable>>iterator=iterable.iterator();
        
        while(iterator.hasNext())
        {
            Inventoriable item=iterator.next().getValue();
            
            if(item.getSize()==weight)
            {
                inventoriable.add(item);
            }
          
        }
        

        
         
         return inventoriable;
     }
     
     
     public static Inventoriable[] collectItems()
     {
         Inventoriable[] inventoriable=new Inventoriable[inventory.size()];
         Iterable<Entry<Integer,Inventoriable>> iterable=inventory.entrySet();
         Iterator<Entry<Integer,Inventoriable>>iterator=iterable.iterator();
        
         
             
              while(iterator.hasNext())
                {
                    for(int i=0;i<inventoriable.length;i++)
                    { 
                    
                    Inventoriable item=iterator.next().getValue();
            
                    inventoriable[i]=item;
                    
                    
                    
                    }
          
                }
        
         return inventoriable;
         
     }
     
   public static ArrayList getPriceRange(double a, double b)
   {
      ArrayList<Inventoriable> priceRangeList=new ArrayList(); 
      double min=Math.min(a, b);
      double max=Math.max(a, b);
      Inventoriable[] inventoriable=new Inventoriable[inventory.size()];
      inventoriable=collectItems();
    
      
      for(Inventoriable i: inventoriable)
      {
          if(i.getPrice()>=min&&i.getPrice()<=max)
          {
              
               priceRangeList.add(i);
          }

               
      }
       
       return priceRangeList;
     
   }
   
   public static ArrayList getDescriptionOfItem(String characters)
   {
        ArrayList<Inventoriable> descriptionList=new ArrayList(); 
        Inventoriable[] inventoriable=collectItems();
        String itemDescription=" ";
       for(int i=0;i<inventoriable.length;i++)
       {
           
           if(inventoriable[i].getDescription().contains(characters))
           {
               descriptionList.add(inventoriable[i]);
              itemDescription+=inventoriable[i].toString()+"\n";
           }
           
           
       }
       return descriptionList;
   }
   
   public static String searchInventory(String...characters)
   {
       ArrayList<Inventoriable> list=new ArrayList<Inventoriable>();
       Inventoriable[] inventoriable=collectItems();
       String itemDescription=" ";
         
        for(int i=0;i<inventoriable.length;i++)
       {
           
           for(int j=0;j<characters.length;j++)
           {
              if(inventoriable[i].getCategory().contains(characters[j]) || inventoriable[j].getDescription().contains(characters[j])|| inventoriable[j].getItemType().contains(characters[j]))
              {
                  list.add(inventoriable[i]);
              }
           
           }
           
           
       }
        
        if(list.size()>0)
        {
            for(Inventoriable i:list)
            {
              itemDescription+= i+"\n"; 
            }
        }else
        {
            itemDescription="Sorry what you are searching for is not in the inventory.";
        }
        
        
       
       return itemDescription;
   }
   
   
   public static ArrayList sortByPrice()
   {
        ArrayList<Inventoriable> priceList=new ArrayList<>();
       String priceSort="";
       Inventoriable[] inventoriable=collectItems();
       PriceComparator priceComparator=new PriceComparator();
        
        mergeSort(inventoriable,priceComparator);
        
        for(Inventoriable i: inventoriable)
        {
            priceList.add(i);

        }
     
        
     
        return priceList;
   }
   
   public static ArrayList sortByCategory()
   {
      
       ArrayList<Inventoriable> categoryList=new ArrayList<>();
       String categorySort="";
       Inventoriable[] inventoriable=collectItems();
       CategoryComparator categoryComparator=new CategoryComparator();
        
        mergeSort(inventoriable,categoryComparator);
        
        for(Inventoriable i: inventoriable)
        {
            categoryList.add(i);

        }
     
        return categoryList;
   }
   public  static ArrayList sortByItemType()
   {
        ArrayList<Inventoriable> itemList=new ArrayList<>();
        String itemTypeSort="";
       Inventoriable[] inventoriable=collectItems();
         ItemTypeComparator itemTypeComparator=new ItemTypeComparator();
        
        mergeSort(inventoriable,itemTypeComparator);
        
        for(Inventoriable i: inventoriable)
        {
            itemList.add(i);

        }
     
        return itemList;
     
   }
   
   public static ArrayList sortByBarcode()
   {
       ArrayList<Inventoriable> barcodeList=new ArrayList<>();
       String barcodeSort="";
       Inventoriable[] inventoriable=collectItems();
       BarcodeComparator barcodeComparator=new BarcodeComparator();  
        
        mergeSort(inventoriable,barcodeComparator);
        
        for(Inventoriable i: inventoriable)
        {
            barcodeList.add(i);

        }
     
        return barcodeList; 
       
       
       
   }
   public static ArrayList sortByWeight()
   {
       
       ArrayList<Inventoriable> weightList=new ArrayList<>();
        String weightSort="";
       Inventoriable[] inventoriable=collectItems();
        WeightComparator weightComparator=new WeightComparator();
        
        mergeSort(inventoriable,weightComparator);
        
        for(Inventoriable i: inventoriable)
        {
            weightList.add(i);

        }
     
        return weightList; 
     
   }  
    
   public static ArrayList sortByDescription()
   {
        ArrayList<Inventoriable> itemList=new ArrayList<>();
        String descriptionSort="";
       Inventoriable[] inventoriable=collectItems();
       DescriptionComparator descriptionComparator=new DescriptionComparator(); 
        
        mergeSort(inventoriable,descriptionComparator);
        
        for(Inventoriable i: inventoriable)
        {
            itemList.add(i);

        }
        
        
     return itemList;
   }

     
     
  
    }
    
    
    
   


