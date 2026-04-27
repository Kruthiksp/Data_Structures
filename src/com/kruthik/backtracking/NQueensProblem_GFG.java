package com.kruthik.backtracking;

import java.util.ArrayList;

public class NQueensProblem_GFG {
    public static void main(String[] args) {
        int n = 4;
        char[][] chessBoard = new char[n][n];
        helper(0, chessBoard);
    }

    private static void helper(int row, char[][] chessBoard) {
        int n = chessBoard.length;

        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(chessBoard[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int col = 0; col < n; col++) {
            if (canQueenBePlaced(row, col, chessBoard)) {
                chessBoard[row][col] = 'Q';
                helper(row + 1, chessBoard);
                chessBoard[row][col] = '\u0000';
            }
        }
    }

    private static boolean canQueenBePlaced(int row, int col, char[][] chessBoard) {
        int n = chessBoard.length;

        // 1. check column
        int i = row - 1;
        while (i >= 0) {
            if (chessBoard[i][col] == 'Q') return false;
            i--;
        }

        // 2. check left diagonal
        i = row - 1;
        int j = col - 1;
        while (i >= 0 && j >= 0) {
            if (chessBoard[i][j] == 'Q') return false;
            i--;
            j--;
        }

        // 3. check right diagonal
        i = row - 1;
        j = col + 1;
        while (i >= 0 && j < n) {
            if (chessBoard[i][j] == 'Q') return false;
            i--;
            j++;
        }
        return true;
    }
}
