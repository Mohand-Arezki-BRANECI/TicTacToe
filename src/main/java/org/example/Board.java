package org.example;


public class Board {

    private static final int ROW_NUMBER = 3;

    protected char[][] board = new char[ROW_NUMBER][ROW_NUMBER];

    public Board(){
        for (int i = 0; i < ROW_NUMBER; i++){
            for (int j = 0; j < ROW_NUMBER; j++){
                this.board[i][j] = '.';
            }
        }
    }

    public void displayBoard(){
        for (int i = 0; i < ROW_NUMBER; i++){
            for (int j = 0; j < ROW_NUMBER; j++){
                System.out.print(this.board[i][j]);
            }
            System.out.println();
        }
    }
}
