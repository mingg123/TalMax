package minji.구현;

import java.util.*;

//Codility
public class MaxProductOfThree {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int a = A[0] * A[1] * A[2];
        int b = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int c = A[0] * A[A.length - 1] * A[A.length - 2];
        int d = A[A.length - 1] * A[0] * A[1];
        int f = A[0] * A[1] * A[A.length - 1];
        int g = A[A.length - 1] * A[A.length - 2] * A[0];
        return Math.max(a, Math.max(b, Math.max(c, Math.max(d, Math.max(f, g)))));
    }
}

// 다른 사람 풀이
class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);

        int i = A.length - 1;
        int answer = A[i] * A[i - 1] * A[i - 2];

        if (A[0] <= 0 && A[1] <= 0 && A[i] >= 0) {
            int answer2 = A[0] * A[1] * A[i];

            if (answer2 > answer)
                answer = answer2;
        }

        return answer;
    }
}