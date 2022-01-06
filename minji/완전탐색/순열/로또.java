package minji.완전탐색.순열;

import java.util.*;
import java.util.Scanner;

public class 로또 {
    public static int N;
    public static boolean[] visit;
    public static int[] map;
    public static int answer;
    public static HashSet<Integer> set;

    public static void sol(int num, int count, String temp) {
        if (count == 6) {
            System.out.println(temp);
            return;
        }
        for (int i = num + 1; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(i, count + 1, temp + " " + map[i]);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        answer = 0;

        while (true) {
            N = sc.nextInt();
            if (N == 0) {
                break;
            }
            visit = new boolean[N];
            map = new int[N];
            set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                map[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    sol(i, 1, Integer.toString(map[i]));
                    visit[i] = false;
                }
            }
            System.out.println(" ");
        }
    }
}