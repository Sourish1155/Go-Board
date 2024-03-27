package com.example.project;

import java.util.Scanner;

public class goBoard {
    // ⚫⚪

    static String[][] board = new String[9][9];
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Boolean cont = true, turn = true;
        while(cont){
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == null){
                        if(j == 0){
                            System.out.print("|");
                        }
                        else{
                            System.out.print("-|");
                        }
                    }
                    else{
                        System.out.print(board[i][j]);
                    }
                }
                System.out.println();
            }

            System.out.println("\n" + ((turn) ? "Black" : "White") + "'s turn to move.\n\n");
            turn = !turn;
            Boolean fail = true;
            while(fail){
                System.out.println("Enter an X coordinate: ");
                int mX = s.nextInt();
                System.out.println("Enter a Y coordinate: ");
                int mY = s.nextInt();

                
                if(((mX > board.length) || (mY > board[0].length)) || ((mY > board.length) || mY > board[0].length)){
                    System.out.println("You missed the board!");
                }
                else if(board[mX][mY] != null){
                    System.out.println("Sorry, that space is occupied!");
                }
                else{
                    if(mX == 0){
                        if(turn == true){
                            board[mY][mX] = "●";
                        }
                        else{
                            board[mY][mX] = "◯";
                        }
                    }
                    else{
                        if(turn == true){
                            board[mY][mX] = "-●";
                        }
                        else{
                            board[mY][mX] = "-◯";
                        }
                    }
                    System.out.println("Tile placed");
                    fail = false;
                }
            }
        }
    }

}
