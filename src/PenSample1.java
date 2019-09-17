
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;
import java.util.Scanner;


public class PenSample1 {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int x1, y1, x2, y2;
        // ask user for start and end points
        System.out.print("Enter x1: ");
        x1 = s.nextInt();
        System.out.print("Enter y1: ");
        y1 = s.nextInt();
        System.out.print("Enter x2: ");
        x2 = s.nextInt();
        System.out.print("Enter y2: ");
        y2 = s.nextInt();
        
        // draw window and stuff
        Pen p = new StandardPen(new SketchPadWindow(640,480));
        
        drawAxis(p);
        // draw tick every 40 along x
        for(int i = -340; i<=340; i+=40){
            drawTick(p,i,0,0);
        }
        
        // draw tick ever 40 along y
        for(int i = -240; i<=240; i+=40){
            drawTick(p,0,i,1);
        }
        
        // draw line
        p.up();
        p.move(x1,y1);
        p.down();
        p.move(x2,y2);
        drawDot(p,x1,y1);
        drawDot(p,x2,y2);
        /*
        p.setDirection(0); // 0 is to the right then like a graph 90 degrees up etc
        p.move(50); // moves pen in direction preset
        p.setColor(Color.red);
        p.setWidth(10); // adjsuts width
        p.move(200, -100);
        p.up(); // lifts pen off page
        p.move(-200, -100);
        p.down();
        p.move(1);
*/
    }
    public static void drawDot(Pen p, int xLoc, int yLoc){
        p.up();
        p.move(xLoc, yLoc);
        p.down();
        p.setWidth(10);
        p.setColor(Color.red);
        p.move(1);
        //reset pen to default
        p.setWidth(1);
        p.setColor(Color.blue);
        p.up();
        p.move(5);
        p.down();
        p.drawString("(" + xLoc + "," + yLoc + ")");
    }
    public static void drawTick(Pen p, int xLoc, int yLoc, int dir){
        // dir 0 = x, dir 1 = y
        p.up();
        p.move(xLoc, yLoc);
        p.down();
        if(dir==0)p.setDirection(90);
        else p.setDirection(0);
        p.move(10);
        p.up();
        p.move(5);
        if(dir==0)p.drawString("" + xLoc);
        else p.drawString("" + yLoc);
    }
    //static = NOT an instance method / not an ability of an object
    public static void drawAxis(Pen p){
        p.up();
        p.move(-320,0);
        p.down();
        p.setDirection(0); // right
        p.move(640); // x axis drawn
        p.up();
        p.move(0,-240);
        p.down();
        p.setDirection(90);
        p.move(480);
        
    }
    
}
