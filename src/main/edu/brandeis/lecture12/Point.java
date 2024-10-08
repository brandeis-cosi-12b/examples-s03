package edu.brandeis.lecture12;

public class Point{
    private int x;
    private int y;

    public Point(int initialX, int initialY){
        x = initialX;
        y = initialY;
    }

    public Point() {
        this(0, 0);
    }

    public Point(Point p){
        this(p.x, p.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // shifts this point's location by the given amount
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }

    // computes the distance between two points
    public double distance(Point other){
        int dx = x - other.x;
        int dy = y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // computes the distance between a point and the origin
    public double distanceFromOrigin() {
        Point origin = new Point();
        return distance(origin);
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else {
            return false;
        }
    }

}
