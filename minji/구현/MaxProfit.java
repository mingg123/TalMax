package minji.구현;

//정확도는 100 효율은 0
public class MaxProfit {
  public int solution(int[] A) {
    int max = 0;
    for(int i = A.length-1; i >0 ; i--) {
       for(int j = i-1; j >= 0; j--) {
           max = Math.max(A[i]- A[j], max);
       }
    }
    return max;
}
}
