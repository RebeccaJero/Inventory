/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparators;

import Classes.Inventoriable;

/**
 *
 * @author Becky
 */
public class PriceComparator implements Comparator<Inventoriable> 
{

    @Override
    public int compare(Inventoriable a, Inventoriable b) 
    {
        return (int) a.getPrice()-(int)b.getPrice();
    }

   
      
 }
    
