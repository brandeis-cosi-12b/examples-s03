import java.util.Arrays;

public class ReferencePuzzles {
    
    public static void one() {
        int[] a = {5, 7, 10, 4};
        int[] b = a;
        b[2] = -1;
        System.out.println(Arrays.toString(a));
    }
    
    public static void two() {
        int[] a = {5, 7, 10, 4};
        twoHelper(a);
        System.out.println(Arrays.toString(a));
    }
    
    public static void twoHelper(int[] in) {
        in[2] = 9;
        System.out.println(Arrays.toString(in));
    }
    
    public static void three() {
        int[] a = {5, 7, 10, 4};
        threeHelper(a);
        System.out.println(Arrays.toString(a));
    }
    
    public static int[] threeHelper(int[] in) {
        in = new int[4];
        in[2] = 9;
        System.out.println(Arrays.toString(in));
    }
    
    public static void main(String[] args) {
        one();
        //two();
        //three();
    }
}
