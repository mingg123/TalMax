package minji.DFS;

import java.util.*;

public class 단지번호붙이기 {
    public static int N;
    public static int[][] arr;
    public static boolean[][] visit;
    public static int[] result;
    public static int[] dx = { 0, 0, 1, -1 };
    public static int[] dy = { 1, -1, 0, 0 };

    public static void dfs(int x, int y, int cnt) {
        result[cnt]++;
        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < N && nx >= 0 && ny < N && ny >= 0 && !visit[nx][ny] && arr[nx][ny] == 1) {
                dfs(nx, ny, cnt);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][N];
        visit = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String temp = sc.next();
            for (int j = 0; j < temp.length(); j++) {
                arr[i][j] = Character.getNumericValue(temp.charAt(j));
            }
        }
        result = new int[10001];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1 && !visit[i][j]) {
                    dfs(i, j, count);
                    count++;
                }
            }

        }
        Arrays.sort(result);
        System.out.println(count);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0)
                System.out.println(result[i]);
        }
    }

}