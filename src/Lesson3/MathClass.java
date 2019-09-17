
package Lesson3;

public class MathClass {
    /*
    Math class is a part of core java -> no import needed
    All methods of Math class are static
    We DONT need to make a Math object -> DONT DO THIS: Math m = new Math();
    All Math methods can be run directly through Math class
    DONT GO: m.sqrt(25) instead go: Math.sqrt(25);
    */

    public static void main(String[] args) {
        int x = 10;
        System.out.println(Math.pow(x, 3)); // 10^3
        System.out.println(Math.sqrt(x)); // square of 10?
        double y = 8.98716;
        System.out.println(Math.round(y));
        System.out.println("The biggest number is " + Math.max(x, y));
        
        System.out.println("Here is a random number: " + Math.random()); // 0 to 1
        //Gr 11: Random r = new Random() r.nextInt()
        //Math.random() can give an integer like this: (int)(Math.random() * range + min val)
        //ex -> from 30 to to: range 21, min is 30
        int rnum = (int)(Math.random() * 21 + 30);
        rnum = (int)(Math.random()*10 + 1);
        
        System.out.println("\nSHORTCUT REVIEW\n===============\n");
        
        int a = 10;
        a+=10; // a = 20
        int b = a; // b =20
        b++; // b = 21
        System.out.format("a is %d and b is %d\n", a,b);
        a*=2; // doubles a      a = 40
        
        int c = b++; // c = b; then add 1 to b      b=22; c=21;
        int d = ++b; // d = b after 1 has been added        b=23; d=23;
        System.out.format("a is %d and b is %d and c is %d and d is %d\n", a,b,c,d);
        
    }
    
}
