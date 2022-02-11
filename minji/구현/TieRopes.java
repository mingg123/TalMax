package minji.구현;
import java.util.*;

public class TieRopes {
    public int solution(int K, int[] A) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < A.length; i++) {
            temp += A[i];
            if(temp >= K) {
                count ++;
                temp = 0;
            }
        }
        return count;
    }
}