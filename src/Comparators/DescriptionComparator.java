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
public class DescriptionComparator implements Comparator<Inventoriable> 
{

    @Override
    public int compare(Inventoriable a, Inventoriable b) 
    {
        return a.getDescription().compareTo(b.getDescription());
    }

   
}
