package minji.구현;

import java.util.*;

class 숫자의표현 {
    public static int answer;

    public static void sol(int num, int total, int n) {
        if (total > n)
            return;
        if (total == n) {
            answer++;
            return;
        } else {
            sol(num + 1, num + 1 + total, n);
        }
    }

    public int solution(int n) {
        answer = 0;
        for (int i = 1; i <= n; i++) {
            sol(i, i, n);
        }
        return answer;
    }
}