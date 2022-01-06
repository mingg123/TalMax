package minji.완전탐색.순열;

import java.util.*;
import java.util.Scanner;

public class 모든순열 {
    public static int N;
    public static boolean[] visit;

    public static void sol(int num, int count, String temp) {
        if (N == count) {
            System.out.println(temp);
        }
        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(i, count + 1, temp + " " + Integer.toString(i));
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        visit = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(i, 1, Integer.toString(i));
                visit[i] = false;
            }
        }
    }
}