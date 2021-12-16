package minji;

import java.util.*;

class 입국심사 {
    public long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        long min = 0;
        long max = Long.MAX_VALUE;
        long mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            long sum = 0;
            for (int i = 0; i < times.length; i++) {
                sum = sum + (mid / times[i]);
                if (sum >= n)
                    break;
            }
            if (sum >= n) {
                max = mid - 1;
                answer = Math.min(answer, mid);
            } else {
                min = mid + 1;
            }
        }
        // System.out.println(mid);
        return answer;
    }
}