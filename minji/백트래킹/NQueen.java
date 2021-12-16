package minji.백트래킹;

import java.util.*;

class NQueen {
    public static boolean[] visit;
    public static int[] pick;
    public static int count;

    public int solution(int n) {
        count = 0;
        pick = new int[n];
        visit = new boolean[n];
        per(n, 0);
        return count;
    }

    public static void per(int n, int idx) {
        if (idx == n) {
            count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                pick[idx] = i;
                if (check(idx)) {
                    per(n, idx + 1);
                }
                visit[i] = false;
            }
        }
    }

    public static boolean check(int idx) {
        for (int i = 0; i < idx; i++) {
            if (pick[idx] == pick[i])
                return false;
            if (Math.abs(i - idx) == Math.abs(pick[i] - pick[idx]))
                return false;
        }
        return true;
    }
}