package minji.구현;

public class MaxDoubleSliceSum {
  public static int max;
  public static void sol(int x, int y, int z, int [] A) {
      int sum = 0;
      for(int i = x+1; i < y; i++) {
          sum = sum + A[i];
      }
      for(int i = y+1; i < z; i++) {
          sum = sum+ A[i];
      }
      max = Math.max(max, sum);
  }
  public int solution(int[] A) {
      max = 0;
      for(int i =0; i < A.length; i++) {
          for(int j = i+1; j < A.length; j++) {
              for(int k = j+1; k < A.length; k++) {
                  sol(i,j,k, A);
              }
          }
      }
      return max;
  }
}
