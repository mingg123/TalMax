package minji.구현;

import java.util.*;


public class Flags {
    public int solution(int[] A) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 1; i < A.length-1; i++) {
            if(A[i] > A[i-1] && A[i] > A[i+1]) {
                arr.add(i);
                i++;
            }
        }

        int start = 0;
        int end = arr.size();
        int maxFlagCount = 0;
        if(end < 2) {
            return arr.size();
        }
        while(start<=end) {
            int flag = (start+end)/2;
            int count = 1;
            int prevIndex = arr.get(0);

            for(int j = 1; j < arr.size() && count < flag; j++) {
                if(arr.get(j) - prevIndex >=flag) {
                    count++;
                    prevIndex = arr.get(j);
                }
            }
            if(count == flag) {
                start = flag + 1;
                maxFlagCount = count;
            }
            else {
                end = flag -1;
            }
        }
        return maxFlagCount;
    }
}