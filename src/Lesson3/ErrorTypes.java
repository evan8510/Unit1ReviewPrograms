
package Lesson3;

import java.util.Scanner;

public class ErrorTypes {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        System.out.println("Enter a value for x > ");
        
        // 1) Syntax Error -> typing error, prevents program from running
        // x = s.nextDouble();
        
        // 2) Logic Error -> code will rund but results will be incorrect
        double wage = 14.50, hours = 10;
        double pay = wage + hours; // logic error should be wage * hours
        System.out.println("Your pay this week will be $" + pay); // should be 145, not 24.5
        
        // 3) Runtime Error -> program starts but crashes
        System.out.println("Enter a value for x > ");
        x = s.nextInt(); // errir will ocur if no valid int was entered
        System.out.println("You entered " + x);
        
        // Use try catch to avoid generating Runtime Errors
        try{
        System.out.println("Enter a value for x > ");
        x = s.nextInt(); // error will occur if no valid int was entered
        System.out.println("You entered " + x);
        }catch(Exception e){
            // this will run if an error occurs
            System.out.println("Invalid entry");
        }
    }
    
}
