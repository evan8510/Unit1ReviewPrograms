
package Lesson4IfLoop;

import java.util.Scanner;


public class MovieTicket {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char day;
        int age;
        double price;
        boolean ageok;
        // force a m, t, or o for day
        while(true){
            System.out.print("Enter a \"m\" for matinee, \"t\" for Tuesday or \"o\" for other > ");
            day = s.next().charAt(0); // read string and only take first character
            if(day == 'm'||day == 't'|| day =='o') break;
            System.out.println("Error - must be m, t, or o -> try again!");
        }
        //will come here only after t, m, or o are entered
        if(day=='m') price = 4;
        else if(day =='t') price = 5;
        else{
            do{
                System.out.println("Enter age from 0 to 99");
                age = s.nextInt();
                ageok = age >=0 && age <=99;
                if(!ageok) System.out.println("Error - must be from 1 to 99");
            }while(!ageok);
            price = age >= 18?  1250 : 10.50;
        }
        System.out.format("Your price will be $%.2f \n", price);
    }
    
}
