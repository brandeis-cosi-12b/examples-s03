package edu.brandeis.lecture7.ver8;

public class PointMain {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point(7, 2);
        Point p2 = new Point(4, 3);
        Point p3 = new Point();

        // print the points 
        System.out.println("p1 is (" + p1.x + "," + p1.y + ")"); 
        System.out.println("p2 is (" + p2.x + "," + p2.y + ")");        
        System.out.println("p3 is (" + p3.x + "," + p3.y + ")");        

        // translate each point to a new location
        p1.translate(11, 6);
        p2.translate(1, 7);
        p3.translate(5, 8);

        // print the points 
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
        System.out.println("p3 is " + p3);

    }
}
