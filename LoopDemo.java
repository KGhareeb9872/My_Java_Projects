// **************************************************************************
//Kathleen Ghareeb, Assignment 3: This program demonstrates a loop.
// **************************************************************************

import java.util.Scanner;

    public class LoopDemo {

//---------------------------------------------------------------------------
//---------------------------------------------------------------------------
        
        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in); // declaring scanner
            
            
        // declaring variables to be used. Num is for storing user input, num2 is for identifying even or odd
        // number, sumE and sumO are for storing even and odd numbers, count is to increment the loop.
        int sumE, sumO, num, num2, count;
        
        
        
        // To take user input and store it in num
        System.out.print(" Please enter a number greater than 0: ");
            num = scan.nextInt();
        
            // To assign the variables values
            sumE = 0;
            
            sumO = 0;
            
            num2 = num % 2;
            
        
     //To make the program continue running until 0 is entered by the user
        while (num != 0) {
            
         
            
                if (num2 == 0) {
                
                    sumE = num + sumE;
                
                    System.out.println("The sum of even numbers is " + sumE);
                
            }
        
                
                else  {
                
                    sumO = num + sumO;
                
                    System.out.println("The sum of odd numbers is " + sumO);
                
            }
            
            System.out.println(" Please enter a number greater than 0: ");
            num = scan.nextInt();
            num2=num %2;
         
         
     }
            
            
        
 System.out.println("Total of odd numbers is " + sumO + " and the total of even numbers is " + sumE + ". " + "GoodBye");
                   
            
            
        
            
        }
}


        
            
        
        
        