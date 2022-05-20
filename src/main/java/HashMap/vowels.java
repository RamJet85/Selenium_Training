package HashMap;

public class vowels {

	public static void main(String[] args) {
		
		//Counter variable to store the count of vowels and consonant    
        int vCount = 0, cCount = 0;    
            
        //Declare a string    
        String str = "Ramakrishna";    
            
        //Converting entire string to lower case to reduce the comparisons    
        String str1 = str.toLowerCase();  
        System.out.println(str1);
            
        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {    
                //Increments the vowel counter    
                vCount++; 
               // the char value at the specified index of this string. The first char value is at index 0.

            }    
            //Checks whether a character is a consonant    
            else if(str1.charAt(i) >= 'a' && str1.charAt(i)<='z') {      
                //Increments the consonant counter    
                cCount++;    
            }    
        }    
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);    
    }    

}
