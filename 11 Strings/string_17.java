// Question 4 -- check if it is anagrams or not(important question)
// anagrams means the string countain same charactar 
// care and race are anagrams to each others

import java.util.Arrays;

public class string_17 {

    public static void isAnagrams(String str1, String str2){
        //lowercase the strings
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            // convert string to the array
            char [] str1array = str1.toCharArray();
            char [] str2array = str2.toCharArray();

            // sort the array
            Arrays.sort(str1array);
            Arrays.sort(str2array);
                
            // compare two array
            boolean result = Arrays.equals(str1array, str2array);
            if(result == true){
                System.out.println("Both string are anagrams"); 
            } else{
                System.out.println("Both string are not anagrams");
            }
        } else{
            System.out.println("both the string are not anagrams");
        }

        
    }
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        isAnagrams(str1, str2);
    }
}
