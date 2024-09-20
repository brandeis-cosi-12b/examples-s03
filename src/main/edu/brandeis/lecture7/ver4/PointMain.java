package edu.brandeis.lecture7.ver4;

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
        p1.translate(11, 6);
        p2.translate(1, 7);
              
        // print the points 
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
    }
}
