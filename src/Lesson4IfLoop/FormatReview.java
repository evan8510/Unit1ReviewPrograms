
package Lesson4IfLoop;


public class FormatReview {


    public static void main(String[] args) {
        // population in Barrie is 140000 and grows 4% per decade
        // here are the next 100 years prediction
        int pop = 140000;
        int growth;
        System.out.format("%s%20s%20s%20s\n", "YEAR", "POPULATION", "GROWTH", "NEW POPULATION");
        System.out.format("%s%20s%20s%20s\n", "====", "==========", "======", "==============");
        
            for (int year = 2020; year < 2120; year+=10) {
                System.out.format("%d%20d", year, pop);
                growth = (int)(0.04 * pop);
                pop += growth;
                System.out.format("%20d%16d\n", growth, pop);
            }
            
            double fee =  99.99;
            System.out.format("That wo;; ne $%20.4f\n", fee);
    }
    
}
