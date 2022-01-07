package minji.DFS;

import java.util.*;

public class 섬의개수 {
    public static int N;
    public static int M;
    public static int[][] arr;
    public static boolean[][] visit;
    public static int[] result;
    public static int[] dx = { 0, 0, 1, -1, -1, 1, 1, -1 };
    public static int[] dy = { 1, -1, 0, 0, 1, 1, -1, -1 };

    public static void dfs(int x, int y) {
        visit[x][y] = true;
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visit[nx][ny] && arr[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            N = sc.nextInt();
            M = sc.nextInt();
            if (N == 0 && M == 0)
                break;
            arr = new int[M][N];
            visit = new boolean[M][N];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int count = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 1 && !visit[i][j]) {

                        dfs(i, j);

                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}