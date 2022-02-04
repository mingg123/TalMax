package minji.구현;

import java.util.*;

public class AbsDistinct {
    public int solution(int[] A) {
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0; i < A.length; i++) {
            set.add(Math.abs(A[i]));
        }
        if(set.isEmpty()) return 0;
        return set.size();
    }
}