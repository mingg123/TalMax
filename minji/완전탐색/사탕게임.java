package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class 사탕게임 {
    public static char[][] map;
    public static int N;
    public static int count;
    public static int result;

    public static void check() {
        for (int i = 0; i < N; i++) {
            count = 1;
            for (int j = 0; j < N - 1; j++) {
                if (map[i][j] == map[i][j + 1]) {
                    count++;
                } else {
                    count = 1;
                }
                result = Math.max(result, count);
            }

        }

        // 세로 검사
        for (int i = 0; i < N; i++) {
            count = 1;
            for (int j = 0; j < N - 1; j++) {
                if (map[j][i] == map[j + 1][i]) {
                    count++;
                } else {
                    count = 1;
                }
                result = Math.max(result, count);
            }

        }

    }

    public static void swap(int x, int y, int y2) {
        char temp = map[x][y];
        map[x][y] = map[x][y2];
        map[x][y2] = temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new char[N][N];
        for (int i = 0; i < N; i++) {
            String temp = sc.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = temp.charAt(j);
            }
        }

        result = 0;
        // 가로 바꿈
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (map[i][j] != map[i][j + 1]) {
                    char target = map[i][j];
                    map[i][j] = map[i][j + 1];
                    map[i][j + 1] = target;
                    check();
                    target = map[i][j + 1];
                    map[i][j + 1] = map[i][j];
                    map[i][j] = target;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            count = 1;
            for (int j = 0; j < N - 1; j++) {
                if (map[j][i] != map[j + 1][i]) {
                    char target = map[j][i];
                    map[j][i] = map[j + 1][i];
                    map[j + 1][i] = target;
                    check();
                    target = map[j + 1][i];
                    map[j + 1][i] = map[j][i];
                    map[j][i] = target;
                }
            }
        }

        System.out.println(result);

    }

}