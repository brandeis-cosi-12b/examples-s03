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
    
    public void crawl() {
        if (goingUp) {
            height += 1;
        } else {
            height -= 1;
        }
        if (height == NUM_FLOORS) {
            goingUp = false;
            turnaroundCount += 1;
            height -= 1;
        }
        if (height == 0) {
            goingUp = true;
            turnaroundCount += 1;
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
   