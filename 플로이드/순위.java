package 플로이드;

import java.util.*;

class 순위 {
    public int solution(int n, int[][] results) {
        int answer = 0;
        int[][] map = new int[n][n];
        for (int i = 0; i < results.length; i++) {
            int x = results[i][0] - 1;
            int y = results[i][1] - 1;
            map[x][y] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (map[j][i] == 1 && map[i][k] == 1) {
                        map[j][k] = 1;
                    }
                }
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result = 0;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    map[i][j] = 1;
                if (map[i][j] == 1)
                    map[j][i] = 1;
                if (map[j][i] == 1)
                    map[i][j] = 1;
                if (map[i][j] == 1) {
                    result++;
                }
            }
            if (result == n) {
                answer++;
            }
        }
        return answer;
    }
}