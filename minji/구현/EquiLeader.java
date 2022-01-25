package minji.구현;
import java.util.*;

//정확도는 100인데 효율성은 0임
class EquiLeader {
    public static HashMap<Integer, Integer> left;
    public static HashMap<Integer, Integer> right;
    public boolean sol(int idx, int [] A) {
        for(int i = 0; i <=idx; i++) {
            left.put(A[i], left.getOrDefault(A[i], 0)+1);
        }
        for(int i = idx+1; i < A.length; i++) {
            right.put(A[i], right.getOrDefault(A[i], 0)+1);
        }
        int leftVal = 0;
        int leftKey = -1;
        for(Integer key : left.keySet()) {
            if(leftVal < left.get(key) && (float) left.get(key) > (float) (idx+1)/2) {
                leftVal = left.get(key);
                leftKey = key;
            }
        }

        int rightVal = 0;
        int rightKey = -1;
      
        for(Integer key : right.keySet()) {
            if(rightVal < right.get(key) && (float) right.get(key) > (float) (A.length - (idx+1)) / 2) {
                rightVal = right.get(key);
                rightKey = key;
            }
        }
        if(leftKey == -1 || rightKey == -1) {
            return false;
        }
        int leftcount = 0;
        for(Integer key : left.keySet()) {
            if(leftVal == left.get(key)) {
                leftcount++;
            }
        }
        if(leftcount > 1) {
            return false;
        }

        int rightcount = 0;
        for(Integer key : right.keySet()) {
            if(rightVal == right.get(key)) {
                rightcount++;
            }
        }
        if(rightcount > 1) {
            return false;
        }
        if(leftKey == rightKey) 
        return true;
        else return false;

    }
    public int solution(int[] A) {
        int count = 0;
        left = new HashMap<>();
        right = new HashMap<>();
        for(int i =0; i < A.length; i++) {
            left.clear();
            right.clear();
           if(sol(i, A)) {
               count++;
           }
        }
        return count;
    }
}