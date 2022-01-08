package minji.BFS;

import java.util.*;

public class 숨박꼭질 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        Queue<dir> q = new LinkedList<>();
        boolean[] visit = new boolean[1000001];
        q.add(new dir(start, 0));
        visit[start] = true;
        int result = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            int sx = q.peek().x;
            int count = q.peek().cnt;
            q.poll();
            if (sx == end) {
                result = Math.min(result, count);
                // System.out.println(count);
                // break;
            }
            if (sx - 1 >= 0 && sx - 1 <= 1000000 && !visit[sx - 1]) {
                visit[sx - 1] = true;
                q.add(new dir(sx - 1, count + 1));
            }
            if (sx + 1 >= 0 && sx + 1 <= 1000000 && !visit[sx + 1]) {
                visit[sx + 1] = true;
                q.add(new dir(sx + 1, count + 1));
            }
            if (sx * 2 >= 0 && sx * 2 <= 1000000 && !visit[sx * 2]) {
                q.add(new dir(sx * 2, count + 1));
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