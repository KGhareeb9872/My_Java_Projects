// Kathleen Ghareeb, Assignment 2: This program capitalizes user's first and last names
// and prints the names in reverse order.
// ***********************************************************************************************

import java.util.Scanner;

public class CapitalizeReverseOrder
 {
    
    //------------------------------------------------------------------------------------------------
    // User is prompted to enter first and last names separated with a space. The program then capitalizes
    // all letters and returns the last name with comma and then first name.
    //------------------------------------------------------------------------------------------------
    
    public static void main(String[] args ){
        
        
        String name = new String();
        
        
        
        Scanner scan = new Scanner(System.in);
        
        
        // Prompts user to enter first and last name separated with a space
        System.out.println("Enter your first and last name separated by a space, then press enter:");
             name = scan.nextLine();
        
       
        
                // Finds name characters in user imput
                String name1 = name.substring(0,name.indexOf(' '));
                String name2 = name.substring(name.indexOf(' ')+1);
        
        
                    //Capitailizes all letters
                    String firstName = name1.toUpperCase();
                    String lastName = name2.toUpperCase();
        
        
                        // Prints out first and last name in capitalized letters in reverse order
                        System.out.println( "Welcome " + lastName +","+" "+ firstName);
        
        
        
        
    }
}
