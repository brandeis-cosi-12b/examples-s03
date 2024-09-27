package edu.brandeis.lecture9;

/*
 * A barbell holds weight
 * You can add or subtract weight 
 * You can create a Barbell with 0 weight, or by specifying an initial weight
 */
public class Barbell {
    static int MAX_WEIGHTS = 10;
    int[] weights;
    int lastWeightIndex;

    public Barbell(){ 
        this(new int[MAX_WEIGHTS]);
    }

    public Barbell(int[] weights) {
        this.weights = weights;
        lastWeightIndex = -1;
        for(int i = 0; i < this.weights.length; i++) {
            if(this.weights[i] != 0) {
                lastWeightIndex = i;
            }
        }
    }

    public boolean addWeight(int weight) {
        // Failure case: already at amax weight count 
        if (lastWeightIndex == weights.length - 1) {
            return false;
        }
        // Failure case: Prev. weight is smaller than new weight
        if (lastWeightIndex != -1 && weight > weights[lastWeightIndex]) {
            return false;
        }

        lastWeightIndex++;
        weights[lastWeightIndex] = weight;
        return true;
    }

    public int removeWeight() {
        if(lastWeightIndex == -1) {
            return 0;
        }

        int rval = weights[lastWeightIndex];
        weights[lastWeightIndex] = 0;
        lastWeightIndex--;
        return rval;
    }

    public int getTotalWeight() {
        int total = 0;
        for(int i = 0; i < weights.length; i++) {
            total += weights[i];
        }
        return total;
    }

    public String toString() {
        String rval = new String();
        for(int i = weights.length-1; i >= 0; i--) {
            if(weights[i] > 0) {
                rval += (int)(weights[i]/2) + "-";
            }
        }

        rval += "---";
        
        for(int i = 0; i < weights.length; i++) {
            if(weights[i] > 0) {
                rval += "-" + (int)(weights[i]/2);
            }
        }

        return rval;
    }
}
