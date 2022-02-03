package minji.구현;

import java.util.*;

//정확도는 100, 효율성은 0
public class CountNonDivisible {
    public int[] solution(int[] A) {
        int [] ans = new int[A.length];

        for(int i = 0; i < A.length; i++) {
            int temp = A[i];
            int count = 0;
            for(int j = 0; j < A.length; j++) {
                if(i!=j && (temp >= A[j]) && temp % A[j]==0) {
                    count++;
                }
            }
            ans[i] = (A.length - count) -1;
        }
        return ans;
    }
}