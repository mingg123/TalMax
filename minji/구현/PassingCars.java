package minji.구현;

import java.util.*;

//Codility
public class PassingCars {
    public int solution(int[] A) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1)
                count++;
            map.put(i, count);
        }
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                result = result + (count - map.get(i));
                if (result > 1000000000) {
                    return -1;
                }
            }
        }
        return result;
    }
}
