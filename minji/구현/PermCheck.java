package minji.구현;

import java.util.*;

//Codility
public class PermCheck {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) {
                return 0;
            }
        }
        return 1;
    }
}
