package collection1;
import java.util.HashSet;
import java.util.Set;

public class qus2 {

    public static void main(String[] args) {
    	
    	//defining and initializing string 
 
        String s = "hello";
        System.out.println("Given string is - " +s);
       
        //  for unique character of the string 
        
        Set<Character> set = new HashSet<>();
        for (Character i : s.toCharArray()) {
            set.add(i);
        }

        System.out.println("Total unique characters in the string are " + set.size());
    }
}