package minji.구현;

import java.util.*;
//정확도 100 효율성 0
public class CommonPrimeDivisors {
    public static ArrayList<Integer> arr;
    public static void sol(int max) {
        for(int i = 2; i <=max; i++) {
            boolean isflag = false;
            for(int j = 2; j <=Math.sqrt(max); j++) {
                if(i%j==0 && i!=j) {
                    isflag = true;
                    break;
                }
            }
            if(!isflag) {
                arr.add(i);
            }
        }
    } 
    public int solution(int[] A, int[] B) {
        int [] tempA = A.clone();
        int [] tempB = B.clone();
        Arrays.sort(tempA);
        Arrays.sort(tempB);
        int max = Math.max(tempA[tempA.length-1], tempB[tempB.length-1]);
        arr = new ArrayList<>();
        sol(max);

        int count = 0;
        for(int i = 0; i < A.length; i++) {
            int numA = A[i];
            int numB = B[i];
            int countA = 0;
            int countB = 0;
            boolean isflag = true;
            for(int j = 0; j < arr.size(); j++) {
                if(numA % arr.get(j) == 0 && numB% arr.get(j) != 0) {
                    isflag = false;
                   break;
                }
                if(numB % arr.get(j) == 0 && numA%arr.get(j) != 0) {
                   isflag = false;
                   break;
                }
            }
            if(isflag) {
                count++;
            }
        }
        return count;
    }
}