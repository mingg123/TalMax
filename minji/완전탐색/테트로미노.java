package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class 테트로미노 {
    public static int N, M, ans;
    public static int[][] map;
    public static int[] dy = { 0, 1, 0, -1 };
    public static int[] dx = { 1, 0, -1, 0 };

    public static void check(int y, int x) {
        if (y + 2 < N && x + 1 < M) {
            ans = Math.max(ans, map[y][x] + map[y + 1][x] + map[y + 2][x] + map[y + 1][x + 1]);
        }
        if (y + 1 < N && x + 2 < M) {
            ans = Math.max(ans, map[y][x] + map[y][x + 1] + map[y + 1][x + 1] + map[y][x + 2]);
        }
        if (y - 1 >= 0 && y + 1 < N && x + 1 < M) {
            ans = Math.max(ans, map[y][x] + map[y - 1][x + 1] + map[y][x + 1] + map[y + 1][x + 1]);
        }
        if (y - 1 >= 0 && y + 1 < N && x + 2 < M) {
            ans = Math.max(ans, map[y][x] + map[y - 1][x + 1] + map[y][x + 1] + map[y][x + 2]);
        }
    }

    public static void dfs(int y, int x, int cnt, int sum, boolean[][] visit) {
        if (cnt >= 4) {
            ans = Math.max(ans, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= M || ny >= N || visit[ny][nx]) {
                continue;
            }
            visit[ny][nx] = true;
            dfs(ny, nx, cnt + 1, sum + map[ny][nx], visit);
            visit[ny][nx] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();

            }
        }
        boolean[][] visit = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visit[i][j] = true;
                dfs(i, j, 1, map[i][j], visit);
                visit[i][j] = false;
                check(i, j);
            }
        }
        System.out.println(ans);
    }
}