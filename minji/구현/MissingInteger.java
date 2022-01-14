package minji.구현;

import java.util.*;

//Codility
public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }
}
