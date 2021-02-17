package collection1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class qus3 {

    public static void main(String[] args) {
   
    	//taking string from user 
        Scanner a = new Scanner(System.in);

        System.out.print("Enter a string:- ");
        char s[] = a.nextLine().toLowerCase().toCharArray();
    
        // counting number of characters
        Map<Character, Integer> b = new HashMap<>();
        for(int i=0; i<s.length; i++){
            int count = 0;
            for(int j=0; j<s.length; j++){
                if (s[i] == s[j]){
                    ++count;
                }
            }
            b.put(s[i], count);
        }
        System.out.println("number of each character in the string is:- ");
        for(char chars: b.keySet()){
            System.out.println(chars + ": " + b.get(chars));
        }
    }
}