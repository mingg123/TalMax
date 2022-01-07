package minji.DFS;

import java.util.*;

public class 미로탐색 {
    public static int N;
    public static int M;
    public static int[][] arr;
    public static boolean[][] visit;
    public static int[] result;
    public static int[] dx = { 0, 0, 1, -1 };
    public static int[] dy = { 1, -1, 0, 0 };
    public static int[][] temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][M];
        temp = new int[N][M];
        visit = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String temp = sc.next();
            for (int j = 0; j < temp.length(); j++) {
                arr[i][j] = Character.getNumericValue(temp.charAt(j));
            }
        }

        Queue<find> queue = new LinkedList<>();
        queue.add(new find(0, 0, 1));
        visit[0][0] = true;
        while (!queue.isEmpty()) {
            int tx = queue.peek().x;
            int ty = queue.peek().y;
            int tcnt = queue.peek().cnt;
            queue.poll();
            if (tx == N - 1 && ty == M - 1) {
                System.out.println(tcnt);
            }
            for (int i = 0; i < 4; i++) {
                int nx = tx + dx[i];
                int ny = ty + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visit[nx][ny] && arr[nx][ny] != 0) {
                    queue.add(new find(nx, ny, tcnt + 1));
                    visit[nx][ny] = true;
                }
            }
        }
    }
}

class find {
    int x;
    int y;
    int cnt;

    public find(int x, int y, int cnt) {
        super();
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}