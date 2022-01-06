package minji.완전탐색.순열;

import java.util.*;
import java.util.Scanner;

public class 외판원순회2 {
    public static int N;
    public static boolean[] visit;
    public static int[][] map;
    public static int answer;
    public static int min;

    // 돌아가야 하기 떄문에 start 저장, num은 이전에 방문했던곳, count는 for문 도는 횟수, total은 계속 더해나감,
    // temp는 확인용으로 만듬 거쳐가는 순서 확인하려고
    public static void sol(int start, int num, int count, int total, String temp) {
        if (count == N) {
            if (map[num][start] != 0)
                min = Math.min(min, total + map[num][start]);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i] && map[num][i] != 0) {
                visit[i] = true;
                sol(start, i, count + 1, total + map[num][i], temp + " " + Integer.toString(i));
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        answer = 0;
        N = sc.nextInt();
        visit = new boolean[N];
        map = new int[N][N];
        min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(i, i, 1, 0, Integer.toString(i));
                visit[i] = false;
            }
        }
        System.out.println(min);
    }
}