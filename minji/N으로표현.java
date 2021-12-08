import java.util.*;
class N으로표현 {
    public static int target;
    public static int n;
    public static int answer;
    public int solution(int N, int number) {
        answer = Integer.MAX_VALUE;
        n = N;
        target = number;
        dfs(0,0);
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
    public void dfs(int count, int value) {
        if(count > 8) {
            answer = -1;
            return;
        }
        if(value == target) {
            answer = Math.min(answer, count);
        }
        int temp = n;
        for(int i = 1; i <= 8 - count; i++) {
            dfs(i+count, value + temp);
            dfs(i+count, value - temp);
            dfs(i+count, value * temp);
            dfs(i+count, value / temp);
            temp = temp * 10 + n;
        }
    }
}