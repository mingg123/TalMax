package minji.BFS;

import java.util.*;

public class 숨박꼭질3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean[] visit = new boolean[100001];
        Queue<dir> q = new LinkedList<>();
        q.offer(new dir(start, 0));
        visit[start] = true;
        int result = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            int x = q.peek().x;
            int cnt = q.peek().cnt;
            // System.out.print(x + " ");
            if (x == end) {
                result = Math.min(result, cnt);
                // System.out.println(cnt);
            }
            q.poll();
            if (2 * x >= 0 && 2 * x <= 100000 && !visit[2 * x]) {
                visit[2 * x] = true;
                q.offer(new dir(x * 2, cnt));
            }
            if (x - 1 >= 0 && x - 1 <= 100000 && !visit[x - 1]) {
                visit[x - 1] = true;
                q.offer(new dir(x - 1, cnt + 1));
            }
            if (x + 1 >= 0 && x + 1 <= 100000 && !visit[x + 1]) {
                visit[x + 1] = true;
                q.offer(new dir(x + 1, cnt + 1));
            }

        }
        System.out.println(result);
    }
}

class dir {
    int x;
    int cnt;

    public dir(int x, int cnt) {
        super();
        this.x = x;
        this.cnt = cnt;
    }
}