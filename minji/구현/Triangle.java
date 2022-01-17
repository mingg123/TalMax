package minji.구현;

import java.util.*;

//Codility
public class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 2; i < A.length; i++) {
            long P = A[i - 2];
            long Q = A[i - 1];
            long R = A[i];
            if (P + Q > R) {
                return 1;
            }
        }
        return 0;
    }
}
