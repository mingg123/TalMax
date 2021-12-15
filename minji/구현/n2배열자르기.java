import java.util.*;
class n2배열자르기 {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) right - (int)left +1];
        int index = 0;
        for(long i = left; i < right+1; i++) {
            long max = Math.max(i/n+1, i%n+1);
            answer[index] = (int)max;
            index++;
        }
        return answer;
    }
}