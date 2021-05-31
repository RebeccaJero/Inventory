/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import src.LinkedQueue;

/**
 *
 * @author Becky
 */
public interface Inventoriable 
{
    
    public double getPrice();

    public int getSize();

    public String getDescription();

    public String getCategory();

    public int getBarcode();

    public String getItemType();
    
    public static LinkedQueue getItems(LinkedQueue...queue)
    {
        Inventoriable itemType;
        LinkedQueue<Inventoriable> itemQueue=new LinkedQueue<>();
        
        for(int i=0;i<queue.length;i++)
        {
            itemType=(Inventoriable) queue[i].first();
            switch (itemType.getCategory()) {
                case "Fruit":
                    while(!queue[i].isEmpty())
                    {
                        itemQueue.enqueue((Inventoriable) queue[i].dequeue());
                    }   break;
                case "Vegetable":
                    while(!queue[i].isEmpty())
                    {
                        itemQueue.enqueue((Inventoriable) queue[i].dequeue());
                    }   break;
                case "Electronic":
                    while(!queue[i].isEmpty())
                    {
                        itemQueue.enqueue((Inventoriable) queue[i].dequeue());
                    }   break;
                case "Outfit":
                    while(!queue[i].isEmpty())
                    {
                        itemQueue.enqueue((Inventoriable) queue[i].dequeue());
                    }   break;
                default:
                    break;
            }
       
        }
      
       return itemQueue; 
    }  
    
}
