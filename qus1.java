package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class qus1 {

    public static void main(String[] args) {
        
    	//  make a float collection 
    	
        List<Float> ab = new ArrayList<>();
        ab.add(7.32f);
        ab.add(5.556f);
        ab.add(3.32f);
        ab.add(22.58f);
        ab.add(77.3f);

        System.out.print("Data in list are:- ");
        float sum = 0;
        
       // make an iterator 
        
        Iterator<Float> iterator = ab.iterator();
        while(iterator.hasNext()){
            float a = iterator.next();
            if(!iterator.hasNext()) System.out.print(a);
            else System.out.print(a + ", ");
            
       // addition of elements 
            
            sum += a;
        }

        System.out.println("\nThe sum of all elements are:- " + sum);
    }
}