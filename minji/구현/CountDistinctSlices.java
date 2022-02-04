package minji.구현;
import java.util.*;

public class CountDistinctSlices {
  public int solution(int M, int[] A) {
      int count = 0;
      for(int i = 0; i < A.length; i++) {
          HashSet<Integer> set = new HashSet<>();
          set.add(A[i]);
          count++;
          for(int j = i+1; j < A.length; j++) {
              if(!set.contains(A[j])) {
                  set.add(A[j]);
                  count++;
              } else {
                  break;
              }
          }
      }
      return count;
  }
}