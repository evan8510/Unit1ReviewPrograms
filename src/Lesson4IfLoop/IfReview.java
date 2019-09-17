
package Lesson4IfLoop;

import java.util.Scanner;


public class IfReview {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int myNum, rNum;
        System.out.print("Enter a number: ");
        myNum = s.nextInt();
        if(myNum < 7){
            System.out.println("Number is too low, adding 1 to it");
            myNum++;
        }
        else if(myNum > 7){
            System.out.println("Number is too high, subtracting 1 from it");
            myNum--;
        }
        else
            System.out.println("Number sis just right");
        System.out.format("Number is now %d\n", myNum);
        
        System.out.println("Picking a number for the computer");
        rNum = (int)(Math.random()* 10 + 1);
        System.out.format("Computer number is %d\n", rNum);
        
        int higher;
        if(myNum> rNum) higher = myNum;
        else higher = rNum;
    }
    
}
