package minji.구현;

import java.util.*;

//Codility
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N + 1];
        int max = 0;
        int tempmax = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > N) {
                max = tempmax;
                continue;
            }

            if (result[A[i]] < max) {
                result[A[i]] = max;
            }
            result[A[i]]++;
            if (result[A[i]] > tempmax) {
                tempmax = result[A[i]];
            }
        }
        for (int i = 0; i < result.length; i++) {
            if (result[i] < max) {
                result[i] = max;
            }
        }
        return Arrays.copyOfRange(result, 1, result.length);
    }
}
