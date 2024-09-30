package edu.brandeis.lecture9;

public class Ant {
    public static final int NUM_FLOORS = 5;
    int height;
    int turnaroundCount;
    boolean goingUp;
    
    public Ant() {
        this(0);
    }

    public Ant(int height) {
        if (height < 0 || height > NUM_FLOORS) {
            System.out.println("Bad Height");
        }
        this.height = height;
        goingUp = true;
    } 

    public int getTurnaroundCount() {
        return turnaroundCount;
    }

    public int getHeight() {
        return height;
    }
    
    private void turnAroundIfNeeded() {
        if(goingUp && height == NUM_FLOORS - 1) {
            goingUp = false;
            turnaroundCount++;
        } else if(!goingUp && height == 0) {
            goingUp = true;
            turnaroundCount++;
        }
    }

    public void crawl() {
        turnAroundIfNeeded();

        if (goingUp) {
            height += 1;
        } else {
            height -= 1;
        }
    }

    public String toString() {
        String rval = "Ant at floor " + height;
        if(goingUp) {
            rval += " (going up)";
        } else {
            rval += " (going down)";
        }
        return rval;
    }
}
   