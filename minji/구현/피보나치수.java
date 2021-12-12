import java.util.*;
class 피보나치수 {
    //재귀함수 쓰면 시간초과남
    public static int sol(int n) {
        if(n == 1) {
            return 1;
        } 
        if(n == 0) return 0;
        else {
            int k = sol((n-1)%1234567);
            int z = sol((n-2)%1234567);
            return k+z;
        }
    }
    public int solution(int n) {
        int answer;
        int a = 0;
        int b = 1;
        answer = 1;
        for(int i = 2; i < n; i++) {
            a = b % 1234567;
            b = answer % 1234567;
            answer = a + b;
        }
        return answer%1234567;
    }
}