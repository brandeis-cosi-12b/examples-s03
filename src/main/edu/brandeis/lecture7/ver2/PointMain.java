package edu.brandeis.lecture7.ver2;

public class PointMain {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point();
        p1.x = 7;
        p1.y = 2;

        Point p2 = new Point();
        p2.x = 4;
        p2.y = 3;

        // print the points 
        System.out.println("p1 is (" + p1.x + "," + p1.y + ")"); 
        System.out.println("p2 is (" + p2.x + "," + p2.y + ")");        

        // translate each point to a new location
        translate (p1, 11, 6);
        translate (p2, 1, 7);
      
        // print the points 
        System.out.println("p1 is (" + p1.x + "," + p1.y + ")"); 
        System.out.println("p2 is (" + p2.x + "," + p2.y + ")");        
    }

    // static method to translate a Point
    // Note: not the recommended way to implement this!
    public static void translate(Point p, int dx, int dy){
        p.x += dx;
        p.y += dy;
    }
}
