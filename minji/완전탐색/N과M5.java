package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class N과M5 {
    public static int N;
    public static int M;
    public static boolean[] visit;
    public static int[] map;

    public static void sol(int start, int count, String temp) {
        if (count == M) {
            System.out.println(temp);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[map[i]]) {
                visit[map[i]] = true;
                sol(i, count + 1, temp + " " + Integer.toString(map[i]));
                visit[map[i]] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visit = new boolean[10001];
        map = new int[N];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            map[i] = x;
        }
        Arrays.sort(map);

        for (int i = 0; i < N; i++) {
            if (!visit[map[i]]) {
                visit[map[i]] = true;
                sol(i, 1, Integer.toString(map[i]));
                visit[map[i]] = false;
            }
        }

    }
}