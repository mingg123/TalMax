package minji.BFS;

import java.util.*;

public class 알고스팟 {
    public static int N;
    public static int M;
    public static int[][] map;
    public static int[] dx = { 1, 0, -1, 0 };
    public static int[] dy = { 0, 1, 0, -1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[M][N];
        boolean[][] visit = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            String temp = sc.next();
            for (int j = 0; j < temp.length(); j++) {
                map[i][j] = Character.getNumericValue(temp.charAt(j));
            }

        }
        PriorityQueue<dir> q = new PriorityQueue<>();
        q.add(new dir(0, 0, 0));
        visit[0][0] = true;
        while (!q.isEmpty()) {
            int x = q.peek().x;
            int y = q.peek().y;
            int count = q.peek().cnt;
            q.poll();
            if (x == M - 1 && y == N - 1) {
                System.out.println(count);
            }
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visit[nx][ny]) {
                    visit[nx][ny] = true;
                    if (map[nx][ny] == 1) {
                        q.offer(new dir(nx, ny, count + 1));
                    } else {
                        q.offer(new dir(nx, ny, count));
                    }
                }
            }
        }
    }
}

class dir implements Comparable<dir> {
    int x;
    int y;
    int cnt;

    public dir(int x, int y, int cnt) {
        super();
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }

    @Override
    public int compareTo(dir o1) {
        return cnt - o1.cnt;
    }
}