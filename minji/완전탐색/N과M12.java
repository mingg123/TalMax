package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class N과M12 {
    public static int N;
    public static int M;
    public static int[] map;
    public static boolean[] visit;
    public static ArrayList<String> arr;
    public static StringBuilder sb;
    public static HashSet<String> set;

    public static void sol(int start, int count, String temp) {
        // arrayList쓰면 시간초과 남
        if (count == M) {
            if (!set.contains(temp)) {
                set.add(temp);
                sb.append(temp).append("\n");
            }
            return;
        }
        for (int i = start; i < N; i++) {
            sol(i, count + 1, temp + " " + Integer.toString(map[i]));

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N];
        arr = new ArrayList<>();
        sb = new StringBuilder();
        set = new HashSet<>();
        visit = new boolean[100001];
        for (int i = 0; i < N; i++) {
            map[i] = sc.nextInt();
        }
        Arrays.sort(map);
        for (int i = 0; i < N; i++) {
            sol(i, 1, Integer.toString(map[i]));
        }

        System.out.print(sb.toString());
    }
}