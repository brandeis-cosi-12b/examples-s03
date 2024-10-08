package edu.brandeis.lecture12;

public class PointMain {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point(7, 2);
        Point p2 = new Point(4, 3);
        Point p3 = new Point();

        // print the points
        System.out.println("p1 is (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("p2 is (" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("p3 is (" + p3.getX() + "," + p3.getY() + ")");

        // translate each point to a new location
        p1.translate(11, 6);
        p2.translate(1, 7);
        p3.translate(18, 8);

        // print the points
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
        System.out.println("p3 is " + p3);

        System.out.println("p1 == p2 ? " + p1.equals(p2));
        System.out.println("p1 == p3 ? " + p1.equals(p3));
        System.out.println("p2 == p3 ? " + p2.equals(p3));

    }
}
