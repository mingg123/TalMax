package minji.완전탐색.순열;

import java.util.*;
import java.util.Scanner;

public class 차이를최대로 {
    public static int N;
    public static boolean[] visit;
    public static int[] map;
    public static int answer;

    public static void sol(int num, int count, int total) {
        if (count == N) {
            answer = Math.max(answer, total);
            // System.out.println(total);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(map[i], count + 1, total + Math.abs(num - map[i]));
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        answer = 0;
        N = sc.nextInt();
        visit = new boolean[N];
        map = new int[N];
        for (int i = 0; i < N; i++) {
            map[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(map[i], 1, 0);
                visit[i] = false;
            }
        }
        System.out.println(answer);
    }
}