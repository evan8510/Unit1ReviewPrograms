
package Lesson4IfLoop;

public class LoopReview {


    public static void main(String[] args) {
        /*
        for(int i = 0; i< 10; i++){
            System.out.format("i is now %d\n", i);
        }
        */
        for(double temp = 20; temp >=10; temp-=0.5){
            String weather = temp >=15? "warm" : "cold";
            System.out.format("The temperature os a %s %.2f\n", weather, temp);
        }
        
        //3 examples of the same thing
        int tries = 0;
        int rNum;
        System.out.println("\nGAME 1\n==============\n");
        
        do{
            rNum = (int)(Math.random()*20 + 1);
            tries++;
            System.out.format("On try %d a %d was chosen\n", tries, rNum);
        }while(rNum!=7);
            System.out.format("A 7 was chosed after %d tries\n", tries);
    }
    
}
    
