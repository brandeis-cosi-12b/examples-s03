package edu.brandeis.lecture7.ver1;

public class PointMain {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point();
        p1.y = 2;
        Point p2 = new Point();
        p2.x = 4;

        // print p1
        System.out.println(p1.x + "," + p1.y);  

        // move p2 and then print it
        p2.x += 2;
        p2.y++;
        System.out.println(p2.x + "," + p2.y);
    }

    /*
    // Extended usage:
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
        p1.x += 11;
        p1.y += 6;
        p2.x += 1;
        p2.y += 7;

        // print the points 
        System.out.println("p1 is (" + p1.x + "," + p1.y + ")"); 
        System.out.println("p2 is (" + p2.x + "," + p2.y + ")");        
    }
    */
}
