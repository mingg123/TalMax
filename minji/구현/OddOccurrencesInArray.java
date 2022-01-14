package minji.구현;

import java.util.*;

//Codility
//HashMap 안쓰면 배열이나 arrayList사용하면 100% 정확도 안나옴 
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }
        int result = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 == 1) {
                result = key;
                break;
            }
        }
        return result;
    }
}
