package edu.brandeis.lecture3;

/**
 * This class contains examples of using Math library methods.
 */
public class Triangle {
    public static void main(String[] args){
        System.out.println("hypotenuse 1 = " + hypotenuse(5, 12));
        System.out.println("hypotenuse 2 = " + hypotenuse(3, 4));	
    }
    
    public static double hypotenuse(double a, double b){
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }
}
