package minji;

import java.util.*;

class 정수삼각형 {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] dp = new int[triangle.length][triangle.length];
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                dp[i][j] = triangle[i][j];
            }
        }
        for (int i = 1; i < triangle.length; i++) {
            // 가장 왼쪽 대각선줄 채워준다.
            dp[i][0] = dp[i][0] + dp[i - 1][0];
            for (int j = 1; j < dp[i].length - 1; j++) {
                dp[i][j] = dp[i][j] + Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
            }
        }
        int max = 0;
        for (int j = 0; j < dp.length; j++) {
            if (max < dp[dp.length - 1][j]) {
                max = dp[dp.length - 1][j];
            }
        }
        return max;
    }
}