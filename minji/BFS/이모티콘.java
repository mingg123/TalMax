package minji.BFS;

import java.util.*;

public class 이모티콘 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        boolean[][] visit = new boolean[1001][1001];
        boolean[] copytemp = new boolean[1001];
        Queue<copy> q = new LinkedList<>();
        q.offer(new copy(1, 0, 0));

        int result = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            int x = q.peek().x;
            int count = q.peek().cnt;
            int copy = q.peek().copy;
            if (x == end) {
                result = Math.min(result, count);
            }
            q.poll();
            if (x - 1 >= 0 && x - 1 <= 1000 && !visit[x][x - 1]) {
                visit[x][x - 1] = true;
                q.offer(new copy(x - 1, count + 1, copy));
            }

            // 붙여넣기
            if (copy != 0 && x + copy >= 0 && x + copy <= 1000 && !visit[x][x + copy]) {
                visit[x][x + copy] = true;
                q.offer(new copy(x + copy, count + 1, copy));
            }
            // 복사
            if (x >= 0 && x <= 1000 && !copytemp[x]) {
                copytemp[x] = true;
                q.offer(new copy(x, count + 1, x));
            }
        }
        System.out.println(result);
    }
}

class copy {
    int x;
    int cnt;
    int copy;

    public copy(int x, int cnt, int copy) {
        super();
        this.x = x;
        this.cnt = cnt;
        this.copy = copy;
    }
}