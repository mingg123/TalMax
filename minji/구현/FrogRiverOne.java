package minji.구현;

import java.util.*;

//Codility
//배열쓰면 무조건 타임아웃 에러남. 이럴땐 set에서 넣어서 뺴고 이런식으로하자.
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        HashSet<Integer> set = new HashSet<>();
        int result = -1;
        for (int i = 1; i <= X; i++) {
            set.add(i);
        }
        for (int i = 0; i < A.length; i++) {
            set.remove(A[i]);
            if (set.isEmpty()) {
                return i;
            }
        }
        return result;

    }
}
