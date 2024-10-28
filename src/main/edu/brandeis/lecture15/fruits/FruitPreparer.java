package edu.brandeis.lecture15.fruits;

public class FruitPreparer {
    public static void main(String[] args) {
        Fruit[] fruits = {
            new Mango("red", true), 
            new Banana("green", false)
        };
        for (int i=0; i<fruits.length; i++) {
            String seasonalStr = "out-of-season";
            Fruit f = fruits[i];
            if (f.isSeasonal()) {
                seasonalStr = "seasonal";
            }
            System.out.println("Preparing " + seasonalStr + " " + f.getColor() + " " + f);
            f.prepare();
        }
    }
}

