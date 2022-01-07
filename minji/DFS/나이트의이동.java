package minji.DFS;

import java.util.*;

public class 나이트의이동 {
    public static int N;
    public static int K;
    public static int[][] arr;
    public static boolean[][] visit;

    public static int[] dx = { -1, -2, -2, -1, 1, 2, 2, 1 };
    public static int[] dy = { -2, -1, 1, 2, -2, -1, 1, 2 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        for (int k = 0; k < K; k++) {
            N = sc.nextInt();
            arr = new int[N][N];
            visit = new boolean[N][N];
            int x = sc.nextInt();
            int y = sc.nextInt();
            int nx = sc.nextInt();
            int ny = sc.nextInt();
            Queue<find> queue = new LinkedList<>();
            queue.add(new find(x, y, 0));
            int result = Integer.MAX_VALUE;

            while (!queue.isEmpty()) {
                int tx = queue.peek().x;
                int ty = queue.peek().y;
                int cnt = queue.peek().cnt;
                queue.poll();
                if (tx == nx && ty == ny) {
                    result = Math.min(result, cnt);
                }
                for (int i = 0; i < 8; i++) {
                    int xx = tx + dx[i];
                    int yy = ty + dy[i];
                    if (xx >= 0 && xx < N && yy >= 0 && yy < N && !visit[xx][yy]) {
                        visit[xx][yy] = true;
                        queue.add(new find(xx, yy, cnt + 1));

                    }
                }
            }
            queue.clear();
            System.out.println(result);
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