/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparators;

import src.LinkedQueue;
import src.Queue;

/**
 *
 * @author Becky
 */
public class Sort<E> 
{
    public static <E> void simpleBubbleSort(E[] list, Comparator<E> comp)
    {
        for(int i = 0; i < list.length - 1; i++)
        {
            for(int j = i + 1; j < list.length; j++)
            { 
                if(comp.compare(list[i], list[j]) > 0)
                {
                    E temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
  
    public static <E> void merge(E[] S1, E[] S2, E[] S, Comparator<E>comp)
    {
       int i = 0;
       int j = 0;

       while(i + j < S.length)
       {

           if(j == S2.length || (i < S1.length && comp.compare(S1[i], S2[j]) < 0))
           {
               S[i+j] = S1[i++];        //copy ith element S1 and increment i
           }
           else        
           {
               S[i+j] = S2[j++];        //copy ith element S2 and increment j
           } 
       }
    }

    public static <E> void mergeSort(E[] S, Comparator<E>comp)
    {
        int n = S.length;
        
        if(n < 2)
        {
            return;
        }
        
        int mid = (n / 2);
        
        E S1[] = copyOfRange(S, 0, mid);
        E S2[] = copyOfRange(S, mid, n);
        
        mergeSort(S1, comp);         
        mergeSort(S2, comp);
        
        merge(S1, S2, S, comp);
    }
    
    public static <E> E[] copyOfRange(E[] S, int num1, int num2)
    {
         int copy = num2 - num1;
         E copyArr[] = (E[]) new Object[copy];
         int k = 0;

         for(int i = num1; i < S.length; i++)
         { 
             if(i >= num1 && i < num2)
             {
                 copyArr[k++] = S[i];                    
             }
         }

         return copyArr;
    }
   
    public static <E> void quickSort(Queue<E> S, Comparator<E> comp)
    {
        int n = S.size();

        if(n < 2)
        {
            return;                        // queue is trivially sorted
        }

        E pivot = S.first();                // using first as arbitary pivot
        Queue<E> L = new LinkedQueue<>();
        Queue<E> E = new LinkedQueue<>();
        Queue<E> G = new LinkedQueue<>();

        while(!S.isEmpty())           // divide original into L,E, and G
        {
            E element = S.dequeue();
            int c = comp.compare(element, pivot);

            if(c < 0)                   // element is less than pivot
            {
                L.enqueue(element);
            }
            else if(c == 0)
            {
                E.enqueue(element);
            }
            else
            {
                G.enqueue(element);
            }
        }
        // conquer
        quickSort(L, comp);   //sort elements greateer than pivot
        quickSort(G, comp);   // sort elements less than pivot
        // concatenate results

        while(!L.isEmpty())
        {
            S.enqueue((L.dequeue()));
        }

        while(!E.isEmpty())
        {
            S.enqueue((E.dequeue()));
        }

        while(!G.isEmpty())
        {
            S.enqueue((G.dequeue()));
        }
    }
   
   
  
     
     public static <E> void multiKeySort(E[] S, Comparator<E> comp,Comparator<E>comp1,Comparator<E> comp2,Comparator<E> comp3)
    {
       
        mergeSort(S,comp3);
        multiKeySort(S,comp,comp1,comp2);
       
      
    }
     public static <E> void multiKeySort(E[] S, Comparator<E> comp,Comparator<E>comp1,Comparator<E>comp2)
    {
       
        mergeSort(S,comp2);
        multiKeySort(S,comp,comp1);
     
    }
     
      public static <E> void multiKeySort(E[] S, Comparator<E> comp,Comparator<E>comp1)
    {
       
        mergeSort(S,comp1);
        mergeSort(S,comp);
     
    }
   
    
}
