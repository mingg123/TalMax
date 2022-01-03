package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class N과M1 {
    public static int N;
    public static int M;

    public static void sol(int count, boolean[] visit, String temp) {
        if (count == M) {
            System.out.println(temp);
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(count + 1, visit, temp + " " + Integer.toString(i));
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        boolean[] visit = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(1, visit, Integer.toString(i));
                visit[i] = false;
            }
        }

    }
}