package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class 스타트와링크 {
    public static int N;
    public static int count;
    public static int x;
    public static int y;
    public static int team1;
    public static int team2;
    public static int[][] map;
    public static boolean[] visit;
    public static int result;

    public static void sol(int num, int cnt, String temp) {
        if (cnt == count) {

            String[] token = temp.split(" ");
            visit = new boolean[N + 1];
            int[] tokneizer = new int[token.length];
            int[] reversetokenizer = new int[token.length];
            for (int i = 0; i < token.length; i++) {
                tokneizer[i] = Integer.parseInt(token[i]);
                visit[tokneizer[i]] = true;
            }
            int idx = 0;
            for (int i = 1; i < visit.length; i++) {
                if (!visit[i]) {
                    reversetokenizer[idx] = i;
                    idx++;
                }
            }

            team1 = 0;
            team2 = 0;

            for (int i = 0; i < reversetokenizer.length; i++) {

                makePoint(i, 1, Integer.toString(tokneizer[i]), tokneizer);
                makePoint2(i, 1, Integer.toString(reversetokenizer[i]), reversetokenizer);
            }

            result = Math.min(result, Math.abs(team1 - team2));
            return;
        }
        for (int i = num + 1; i <= N; i++) {
            sol(i, cnt + 1, temp + " " + Integer.toString(i));
        }
    }

    public static void makePoint(int num, int cnt, String temp, int[] target) {
        if (cnt == 2) {

            String[] token = temp.split(" ");
            int x = Integer.parseInt(token[0]);
            int y = Integer.parseInt(token[1]);

            team1 = team1 + map[x][y] + map[y][x];

            return;
        }
        for (int i = num + 1; i < target.length; i++) {
            makePoint(i, cnt + 1, temp + " " + Integer.toString(target[i]), target);
        }
    }

    public static void makePoint2(int num, int cnt, String temp, int[] target) {
        if (cnt == 2) {
            String[] token = temp.split(" ");
            int x = Integer.parseInt(token[0]);
            int y = Integer.parseInt(token[1]);

            team2 = team2 + map[x][y] + map[y][x];

            return;
        }
        for (int i = num + 1; i < target.length; i++) {
            makePoint2(i, cnt + 1, temp + " " + Integer.toString(target[i]), target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        count = N / 2;
        map = new int[N + 1][N + 1];
        result = Integer.MAX_VALUE;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i < N / 2; i++) {
            sol(i, 1, Integer.toString(i));
        }
        System.out.println(result);
    }

}
