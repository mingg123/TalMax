package minji.트리;

import java.util.*;
import java.io.*;

public class 트리의지름1967 {
    public static ArrayList<Node>[] list;
    public static boolean[] visit;
    public static int max = 0;
    public static int node;
    public static int N;

    public static void dfs(int x, int len) {
        if (len > max) {
            max = len;
            node = x;
        }
        visit[x] = true;
        for (int i = 0; i < list[x].size(); i++) {
            Node n = list[x].get(i);
            if (!visit[n.e]) {
                visit[n.e] = true;
                dfs(n.e, n.cost + len);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        list = new ArrayList[N + 1];
        if (N == 1) {
            System.out.println(0);
            System.exit(0);
        }
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            int s = sc.nextInt();
            int child = sc.nextInt();
            int num = sc.nextInt();
            list[s].add(new Node(child, num));
            list[child].add(new Node(s, num));
        }
        visit = new boolean[N + 1];
        dfs(1, 0);

        visit = new boolean[N + 1];
        dfs(node, 0);
        System.out.println(max);
    }
}

class Node {
    int e;
    int cost;

    public Node(int e, int cost) {
        this.e = e;
        this.cost = cost;
    }
}