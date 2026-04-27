package com.kruthik.backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class RatInAMazeObsticles_GFG {
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length;
        int m = maze.length;
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[n][m];
        paths(0, 0, n - 1, m - 1, visited, "", maze, ans);
        Collections.sort(ans);
        return ans;
    }

    private static void paths(int r, int c, int er, int ec, boolean[][] visited,
                              String s, int[][] maze, ArrayList<String> ans) {

        if (r == er && c == ec) {
            ans.add(s);
            return;
        }
        if (r > er || c > ec || r < 0 || c < 0 || maze[r][c] == 0 || visited[r][c]) return;

        visited[r][c] = true;

        paths(r, c + 1, er, ec, visited, s + "R", maze, ans);
        paths(r + 1, c, er, ec, visited, s + "D", maze, ans);
        paths(r, c - 1, er, ec, visited, s + "L", maze, ans);
        paths(r - 1, c, er, ec, visited, s + "U", maze, ans);

        visited[r][c] = false;
    }
}
