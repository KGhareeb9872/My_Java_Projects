
// Kathleen Ghareeb, Assignment 1: This program helps users count change.
// ***********************************************************************

import java.util.Scanner;

    public class ChangeCounter {


// ----------------------------------------------------------------------
// Calculates change based on values entered by user
// ----------------------------------------------------------------------

        public static void main(String[] args){
        
            double quaters;
            double dimes;
            double nickels;
            double pennies;
            double dollars;
       
        
            Scanner scan = new Scanner(System.in);
        
        
                System.out.print(" Enter number of quaters: ");
                quaters = scan.nextDouble();
        
                System.out.print(" Enter number of dimes: ");
                dimes = scan.nextDouble();
        
                System.out.print(" Enter number of nickels: ");
                nickels = scan.nextDouble();
        
                System.out.print(" Enter number of pennies: ");
                pennies = scan.nextDouble();
            
            
                    dollars=0.25*quaters + 0.10*dimes + 0.05*nickels + 0.01*pennies;
        
    
        
            System.out.println("You have " + dollars + " dollars");
        
    }
    
}

        
        
