package minji.구현;

import java.util.*;

//Codility
public class Distinct {
    public int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        return set.size();
    }
}
