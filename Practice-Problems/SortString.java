/*
WAP which will read a string and rewrite it in alphabetical order.
For eg. the word STUDENT should be written as DENSTTU
*/

import java.util.*;

public class Assignment1  
{ 
    // Method to sort a mixed string 
    public static String sortString(String inputString) 
    { 
        // convert input string to Character array 
        Character tempArray[] = new Character[inputString.length()]; 
        for (int i = 0; i < inputString.length(); i++) { 
            tempArray[i] = inputString.charAt(i); 
        } 
          
          
        // Sort, ignoring case during sorting 
        Arrays.sort(tempArray, new Comparator<Character>(){ 
  
            public int compare(Character c1, Character c2) 
            { 
                // ignoring case 
                return Character.compare(Character.toLowerCase(c1), 
                                        Character.toLowerCase(c2)); 
            } 
        }); 
          
        // using StringBuilder to convert Character array to String 
        StringBuilder sb = new StringBuilder(tempArray.length); 
        for (Character c : tempArray) 
            sb.append(c.charValue()); 
  
        return sb.toString(); 
    } 
      
    // Driver method 
    public static void main(String[] args) 
    { 
        
        Scanner sc = new Scanner(System.in);
        
        String inputString = sc.next();
        String outputString = sortString(inputString); 
          
        System.out.println("Input String : " + inputString); 
        System.out.println("Output String : " + outputString); 
    } 
  
} 
