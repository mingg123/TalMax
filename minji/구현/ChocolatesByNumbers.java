package minji.구현;

import java.util.*;
//Codility
//정확도 100 효율성 0
public class ChocolatesByNumbers {
    public int solution(int N, int M) {
        HashSet<Integer> set = new HashSet<>();
        if(N==0) return 0;
        set.add(0);
        int num = -1;
        int prev = 0;
        while(num != 0) {
            int temp = prev + M;
            num = temp % N;
            prev = num;
            set.add(num);
        }
        return set.size();
    }
}