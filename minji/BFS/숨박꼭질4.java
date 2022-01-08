package minji.BFS;

import java.util.*;

public class 숨박꼭질4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        Queue<dir> q = new LinkedList<>();
        boolean[] visit = new boolean[100001];
        int[] path = new int[100001];

        q.add(new dir(start, 0));
        visit[start] = true;
        path[start] = start;

        int result = Integer.MAX_VALUE;

        while (!q.isEmpty()) {
            int x = q.peek().x;
            int count = q.peek().cnt;

            if (x == end) {
                System.out.println(count);
                Stack<Integer> stack = new Stack<>();
                while (path[x] != x) {
                    stack.add(x);
                    x = path[x];
                }
                stack.add(x);
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty()) {
                    sb.append(stack.pop() + " ");
                }
                System.out.print(sb);
                return;
            }
            q.poll();
            if (x - 1 >= 0 && x - 1 <= 100000 && !visit[x - 1]) {
                visit[x - 1] = true;
                path[x - 1] = x;
                q.add(new dir(x - 1, count + 1));
            }
            if (x + 1 >= 0 && x + 1 <= 100000 && !visit[x + 1]) {
                visit[x + 1] = true;
                path[x + 1] = x;
                q.add(new dir(x + 1, count + 1));
            }
            if (x * 2 >= 0 && x * 2 <= 100000 && !visit[x * 2]) {
                visit[x * 2] = true;
                path[x * 2] = x;
                q.add(new dir(x * 2, count + 1));
            }
        }

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