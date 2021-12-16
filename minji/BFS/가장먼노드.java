package minji.BFS;

import java.util.*;

class 가장먼노드 {
    public static int[] disit;
    public static boolean[] visit;

    public int solution(int n, int[][] edge) {
        int answer = 0;
        disit = new int[n];
        visit = new boolean[n];
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            list.add(i, new ArrayList<>());
        }
        for (int i = 0; i < edge.length; i++) {
            int x = edge[i][0] - 1;
            int y = edge[i][1] - 1;
            list.get(x).add(y);
            list.get(y).add(x);

        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        visit[0] = true;
        while (!q.isEmpty()) {
            int top = q.poll();
            for (int i = 0; i < list.get(top).size(); i++) {
                if (!visit[list.get(top).get(i)]) {
                    q.add(list.get(top).get(i));
                    visit[list.get(top).get(i)] = true;
                    disit[list.get(top).get(i)] = disit[top] + 1;
                }
            }

        }
        int max = 0;
        for (int i = 0; i < disit.length; i++) {
            max = Math.max(disit[i], max);
        }
        for (int i = 0; i < disit.length; i++) {
            if (max == disit[i]) {
                answer++;
            }
        }
        return answer;
    }
}