package minji.구현;

import java.util.*;



public class Peaks  {
    public int solution(int[] A) {
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1; i < A.length -1; i++) {
            if(A[i-1] < A[i] && A[i] > A[i+1]) {
                arr.add(i);
                i++;
            }
        }
        for(int idx = A.length; idx>=1; idx--) {
            if(A.length % idx == 0) {
                int blockSize = A.length/idx;
                int blockCount = 0;
                for(int i = 0; i < arr.size(); i++) {
                    if(arr.get(i) / blockSize == blockCount) {
                        blockCount++;
                    }
                }
                if(blockCount == idx) {
                    return blockCount;
                }
            }
        }
        return 0;
    }
}