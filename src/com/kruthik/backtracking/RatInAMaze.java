package com.kruthik.backtracking;

public class RatInAMaze {
    public static void main(String[] args) {
        int n = 3, m = 3;
        boolean[][] visited = new boolean[n][m];
        int paths = paths(0, 0, n - 1, m - 1, visited, "");
        System.out.println(paths);
    }

    private static int paths(int r, int c, int er, int ec, boolean[][] visited, String s) {
        if (r == er && c == ec) {
            System.out.println(s);
            return 1;
        }
        if (r > er || c > ec || r < 0 || c < 0 || visited[r][c])
            return 0;

        visited[r][c] = true;

        int right = paths(r, c + 1, er, ec, visited, s + "R");
        int down = paths(r + 1, c, er, ec, visited, s + "D");
        int left = paths(r, c - 1, er, ec, visited, s + "L");
        int up = paths(r - 1, c, er, ec, visited, s + "U");

        visited[r][c] = false;
        return right + left + down + up;
    }
}
