package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class ABCDE {
    public static int N;
    public static int M;
    public static ArrayList<Integer>[] arr;
    public static boolean[] visit;

    public static void dfs(int start, int cnt) {
        if (cnt == 4) {
            System.out.println(1);
            System.exit(0);
            return;
        }
        visit[start] = true;
        for (int i = 0; i < arr[start].size(); i++) {
            int temp = arr[start].get(i);
            if (!visit[temp]) {
                visit[temp] = true;
                dfs(temp, cnt + 1);
                visit[temp] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x].add(y);
            arr[y].add(x);
        }

        for (int i = 0; i < N; i++) {
            visit = new boolean[N];
            dfs(i, 0);
        }
        System.out.println(0);
    }

}