package minji.DFS;

import java.util.*;

public class 연결요소갯수 {
    public static int N;
    public static int M;
    public static ArrayList<Integer>[] arr;
    public static boolean[] visit;

    public static void dfs(int start) {
        visit[start] = true;
        for (int i = 0; i < arr[start].size(); i++) {
            int temp = arr[start].get(i);
            if (!visit[temp]) {
                visit[temp] = true;
                dfs(temp);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new ArrayList[N + 1];
        visit = new boolean[N + 1];
        for (int i = 0; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x].add(y);
            arr[y].add(x);
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }

}