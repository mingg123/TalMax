package minji.구현;

import java.util.*;

public class Ladder {
    public static int [] result;
    public static void sol(int idx, int x, int total) {
        if(x== total) {
            result[idx]++;
            return;
        }
        if(x+1 <= total) {
            sol(idx, x+1,total);
        }
        if(x+2 <= total) {
            sol(idx, x+2,total);
        }
    }
    public int[] solution(int[] A, int[] B) {
        result = new int [A.length];
        for(int i = 0; i < A.length; i++) {
            sol(i,0,A[i]);
        }
        for(int i = 0; i < result.length; i++) {
            int pow = (int)(Math.pow(2, B[i]));
            result[i] = result[i]%pow;
        }
        return result;
    }
}