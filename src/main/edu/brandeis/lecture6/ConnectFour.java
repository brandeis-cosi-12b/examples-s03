package edu.brandeis.lecture6;

import java.util.Scanner;

public class ConnectFour {










    

    /*
    public static void takeTurn(String[][] board, String player, Scanner console) {
        System.out.println(player + "'s turn. Which col (0-6)?");
        int col = console.nextInt();

        int i = board.length - 1;
        while(i >= 0) {
            if(board[i][col].equals(" ")) {
                board[i][col] = player;
                break;
            }
            i--;
        }
    }

    public static void printBoard(String[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkWinner(String[][] board) {
        return false;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[][] board = new String[6][7];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = " ";
            }
        }
        boolean end = false;
        String red = "R";
        String black = "B";
        String currPlayer = red;
        while(!end) {
            takeTurn(board, currPlayer, console);
            printBoard(board);
            end = checkWinner(board);

            if(currPlayer == red) {
                currPlayer = black;
            } else {
                currPlayer = red;
            }
        }
    }
        */
}
