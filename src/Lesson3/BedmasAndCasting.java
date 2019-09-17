
package Lesson3;

public class BedmasAndCasting {

    public static void main(String[] args) {
        int x = 22;
        int y = x*2;
        
        double z = (double)y / 7; // mmust cast y to double
        System.out.println("" + z);
        
        //MOD -> calculates REMAINDER as a whole
        int remain = y%7;
        System.out.println("%d mod 7 = %d");
        
        System.out.println("\n\nBEDMAS\n======\n\n");
        int e,f,g;
        e=f=g=5; //assign all to 5
        int ans;
        ans = e + f * g; // 5 + 25 = 30
        System.out.format("%d + %d * %d = %d", e, f, g, ans);
        
        ans = (e + f) * g; // 10 * 5 = 125
        System.out.format("(%d + %d) * %d = %d", e, f, g, ans);
        
        ans = e + f % g; // 5 + 5 % 5 = 5 + 0
        System.out.format("%d + %d %% %d = %d", e, f, g, ans);
        
        ans = (e + f) % g; // 10 % 5 = 0
        System.out.format("(%d + %d) %% %d = %d", e, f, g, ans);
    }
    
}
