import java.util.Scanner;


public class Convert1 {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double f, c;
        //input ask farenheit
        System.out.print("Enter degrees F > ");
        f = s.nextDouble();
        c = (f - 32.0)* 5.0 / 9.0;
        System.out.format("%.2f F = %.2f C\n\n", f,c);
    }
    
}
