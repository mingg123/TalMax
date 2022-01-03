package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class N과M9 {
    public static int N;
    public static int M;
    public static int[] map;
    public static boolean[] visit;
    public static ArrayList<String> arr;

    public static void sol(int start, int count, String temp) {
        if (count == M) {
            if (!arr.contains(temp)) {
                arr.add(temp);
            }
            // System.out.println(temp);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(i, count + 1, temp + " " + Integer.toString(map[i]));
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N];
        arr = new ArrayList<>();
        visit = new boolean[100001];
        for (int i = 0; i < N; i++) {
            map[i] = sc.nextInt();
        }
        Arrays.sort(map);
        for (int i = 0; i < N; i++) {
            sol(i, 1, Integer.toString(map[i]));
            if (!visit[i]) {
                visit[i] = true;
                sol(i, 1, Integer.toString(map[i]));
                visit[i] = false;
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}