package minji.구현;

import java.util.*;

//Codility
public class PermMissingElem {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) {
                return i + 1;
            }
        }
        return A.length + 1;
    }
}
