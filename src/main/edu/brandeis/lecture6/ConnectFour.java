package edu.brandeis.lecture6;

import java.util.Scanner;

public class ConnectFour {

    public static String[][] makeBoard() {
        String[][] board = new String[6][7];
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                board[row][col] = "O";
            }
        }
        return board;
    }

    public static void printBoard(String[][] board) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int getChoice(Scanner c) { 
        System.out.println("Which column?");
        return c.nextInt();
    }

    public static void placePiece(String[][] board, int column, String player) {
        for(int row = board.length - 1; row >= 0; row--) {
            if(board[row][column].equals("O")) {
                board[row][column] = player;
                return;
            }
        }
    }

    public static boolean gameFinished(String[][] board) {
        return false;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[][] board = makeBoard();

        String player = "R";

        while(!gameFinished(board)) {
            printBoard(board);
            int decision = getChoice(console);

            placePiece(board, decision, player);

            if(player.equals("R")) {
                player = "B";
            } else {
                player = "R";
            }
        }

    }
}
