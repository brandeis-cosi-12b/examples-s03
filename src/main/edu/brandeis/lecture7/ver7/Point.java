package edu.brandeis.lecture7.ver7;

public class Point{
    int x;
    int y;
    
    public Point(int initialX, int initialY){
        x = initialX;
        y = initialY;
    }

    public Point() {
        x = 0;
        y = 0;
    }
    
    public void setLocation(int x, int y) {
        // This doesn't work...
        // How do we set the class instances x and y???
        x = x;
        y = y;
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
