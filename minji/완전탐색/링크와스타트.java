package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class 링크와스타트 {
    public static int N;
    public static int M;
    public static int[][] player;
    public static boolean[] isStart;
    public static int result;

    static void bt(int depth, int start) {
        if (depth == M) {
            int Ssum = 0;
            int Lsum = 0;
            for (int i = 0; i < N - 1; i++)
                for (int j = i + 1; j < N; j++) {
                    if (isStart[i] && isStart[j])
                        Ssum += player[i][j] + player[j][i];
                    if (!isStart[i] && !isStart[j])
                        Lsum += player[i][j] + player[j][i];
                }
            result = Math.min(result, Math.abs(Ssum - Lsum));
            return;
        }
        for (int i = start; i < N; i++) {
            isStart[i] = true;
            bt(depth + 1, i + 1);
            isStart[i] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        result = Integer.MAX_VALUE;
        isStart = new boolean[N];
        player = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                player[i][j] = sc.nextInt();
            }
        }
        for (M = 1; M < N; M++) {
            bt(0, 0);
        }
        System.out.println(result);
    }

}