package minji.구현;

public class MaxSliceSum {
  public int solution(int[] A) {
    int sum = 0;
    int max = A[0];
    for(int i = 0; i < A.length; i++) {
        sum = Math.max(A[i], sum + A[i]);
        max = Math.max(max, sum);
    }
    return max;
 }
}
