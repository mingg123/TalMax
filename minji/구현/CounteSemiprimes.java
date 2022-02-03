package minji.구현;
import java.util.*;
//Codility
////정확도는 100, 효율성은 0
class CounteSemiprimes {
    public static ArrayList <Integer> arr;
    public static void sol(int N) {
        for(int i = 2; i <= N; i++) {
            boolean flag = false;
            for(int j = 2; j<= Math.sqrt(i); j++) {
                if(i%j == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                arr.add(i);
            }
        }
    }
    public int[] solution(int N, int[] P, int[] Q) {
        arr = new ArrayList<>();
        int [] tempQ = Arrays.copyOf(Q, Q.length);
        Arrays.sort(tempQ);
        int max = tempQ[tempQ.length-1];
        sol(max);
        int [] result = new int[P.length];
       
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.size(); j++) {
                int cal = arr.get(i) * arr.get(j);
                if(!temp.contains(cal)) {
                    temp.add(cal);
                }
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        for(int i = 1; i <= max; i++) {
            if(temp.contains(i)) {
                map.put(i, map.get(i-1)+1);
            } else {
                map.put(i, map.get(i-1));
            }
        }
 
        for(int i = 0; i < P.length; i++) {
            result[i] = map.get(Q[i]) - map.get(P[i]-1);
        }
        return result;
    }
}