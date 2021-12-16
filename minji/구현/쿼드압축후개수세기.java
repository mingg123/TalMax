package minji.구현;

import java.util.*;

class 쿼드압축후개수세기 {
    public static int[] answer;

    public int[] solution(int[][] arr) {
        answer = new int[2];
        sol(arr.length, 0, 0, arr);
        return answer;
    }

    public static void sol(int n, int x, int y, int[][] arr) {
        if (n == 1) {
            answer[arr[x][y]]++;
            return;
        }
        if (isBlack(x, y, n, arr)) {
            return;
        }
        sol(n / 2, x, y, arr);
        sol(n / 2, x + n / 2, y, arr);
        sol(n / 2, x, y + n / 2, arr);
        sol(n / 2, x + n / 2, y + n / 2, arr);
    }

    public static boolean isBlack(int x, int y, int n, int[][] arr) {
        int temp = arr[x][y];
        for (int i = x; i < x + n; i++) {
            for (int j = y; j < y + n; j++) {
                if (temp != arr[i][j]) {
                    return false;
                }
            }
        }
        answer[arr[x][y]]++;
        return true;
    }
}