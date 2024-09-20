package edu.brandeis.lecture7.ver4;

public class Point{
    int x;
    int y;

    // shifts this point's location by the given amount 
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";    
    }
}
