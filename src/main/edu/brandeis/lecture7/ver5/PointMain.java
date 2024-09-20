package edu.brandeis.lecture7.ver5;

public class PointMain {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point(7, 2);
        Point p2 = new Point(4, 3);

        // print the points 
        System.out.println("p1 is (" + p1.x + "," + p1.y + ")"); 
        System.out.println("p2 is (" + p2.x + "," + p2.y + ")");        

        // translate each point to a new location
        p1.translate(11, 6);
        p2.translate(1, 7);
              
        // print the points 
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
    }
}
