package minji.구현;

import java.util.*;
public class CountFactors {
  public int solution(int N) {
    HashSet <Integer> set = new HashSet<>();
    if(N==1) {
        return 1;
    }
    if(N==0) {
        return 0;
    }
    int count = 0;
    for(int i = 1; i <= Math.sqrt(N); i++) {
        if(N%i == 0) {
            set.add(i);
            set.add(N/i);
            count++;
        }
    }
    return set.size();
  }
}
