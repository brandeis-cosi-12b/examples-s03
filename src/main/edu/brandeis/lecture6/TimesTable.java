package edu.brandeis.lecture6;

import java.util.Scanner;

public class TimesTable {

    public static int[][] getTable(int rows, int cols) {
        int[][] table = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                table[i][j] = (i+1) * (j+1);
            }
        }
        return table;
    }

    public static void printTable(int[][] table) {
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Rows?");
        int rows = console.nextInt();
        System.out.println("Cols?");
        int cols = console.nextInt();
        int[][] table = getTable(rows, cols);
        printTable(table);
    }
}
