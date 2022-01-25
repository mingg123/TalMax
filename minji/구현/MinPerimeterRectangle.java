package minji.구현;

public class MinPerimeterRectangle {
  public int solution(int N) {
    int min = Integer.MAX_VALUE;
    for(int i = 1; i <= Math.sqrt(N); i++) {
        if(N%i == 0) {
            int temp = 2*(i + (N/i));
            min = Math.min(temp, min);
        }
    }
    return min;
}
}
