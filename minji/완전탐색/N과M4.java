package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class N과M4 {
    public static int N;
    public static int M;
    public static boolean[] visit;
    public static StringBuilder sb;

    public static void sol(int start, int count, String temp) {
        if (count == M) {
            System.out.println(temp);
            return;
        }
        for (int i = start; i <= N; i++) {
            sol(i, count + 1, temp + " " + Integer.toString(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            sol(i, 1, Integer.toString(i));
        }

    }
}