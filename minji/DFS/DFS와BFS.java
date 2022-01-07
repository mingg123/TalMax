package minji.DFS;

import java.util.*;

public class DFS와BFS {
    public static int N;
    public static int M;
    public static ArrayList<Integer>[] arr;
    public static boolean[] visit;

    public static void dfs(int start, int cnt, String temp) {
        System.out.print(start + " ");

        visit[start] = true;
        for (int i = 0; i < arr[start].size(); i++) {
            int newtemp = arr[start].get(i);
            if (!visit[newtemp]) {
                visit[newtemp] = true;
                dfs(newtemp, cnt + 1, temp + " " + Integer.toString(newtemp));
                // visit[newtemp] = false;
            }
        }
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visit[start] = true;
        while (!queue.isEmpty()) {
            int top = queue.poll();
            System.out.print(top + " ");
            for (int i = 0; i < arr[top].size(); i++) {
                int temp = arr[top].get(i);
                if (!visit[temp]) {
                    visit[temp] = true;
                    queue.add(temp);
                    // System.out.println(temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int start = sc.nextInt();
        arr = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x].add(y);
            arr[y].add(x);
        }

        for (int i = 0; i <= N; i++) {
            Collections.sort(arr[i]);

        }
        visit = new boolean[N + 1];
        dfs(start, 0, Integer.toString(start));
        System.out.println("");
        visit = new boolean[N + 1];
        bfs(start);
    }

}