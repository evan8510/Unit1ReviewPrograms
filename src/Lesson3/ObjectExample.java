
package Lesson3;
import TurtleGraphics.*;

public class ObjectExample {

    public static void main(String[] args) {
        Pen p1, p2, p3;
        
        SketchPadWindow w = new SketchPadWindow(800,600);
        
        /*
        All 3 pens can become different TYPES of Pens that inherit all the same commands
        from the Pen class. Pen is a parent to 3 different pens.
        When you type p1. -> you get a list of all things Pens can do PLUS MORE!
        All Objects also inherit a base set of abilities from the Object class
        Object is the MOTHER of all clases, including your own classes
        
        Polymorphism - Even after p1 is a new standardpen, it can later change it's mind
        and become a different object.
        Polymorphism -> Poly = many, morph = change, the ability for an object ot change
        into a different but RELATED object
        
        */
        p1 = new StandardPen(w);
        p2 = new WigglePen(w);
        p3 = new RainbowPen(w);
        
        // draw 3 squares
        
        p1.up();
        p1.move(-100,-100);
        p1.down();
        p1.setDirection(0);
        
        p2.up();
        p2.move(100,100);
        p2.down();
        p2.setDirection(0);
        
        p3.up();
        p3.move(-100,100);
        p3.down();
        p3.setDirection(0);
        
        p1.setWidth(5);
        p2.setWidth(5);
        p3.setWidth(5);
        
        for (int i = 0; i < 4; i++) {
            p1.move(100);
            p2.move(100);
            p3.move(100);
            p1.turn(90);
            p2.turn(90);
            p3.turn(90);
        }
        
        //polymorph p1 into a wiggle
        p1 = new WigglePen(w);
        p1.move(100);
    }
    
}
