package edu.brandeis.lecture7.ver8;

public class Point{
    int x;
    int y;
    
    public Point(int initialX, int initialY){
        x = initialX;
        y = initialY;
    }

    public Point() {
        this(0, 0);
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
    
    public String toString(){
        return "(" + x + ", " + y + ")";    
    }
}
