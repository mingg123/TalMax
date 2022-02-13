package minji.DP;

import java.util.Scanner;

public class 제곱수의합 {
  // 일반 방법으로하면 18이 예외가 나와서 그렇게 하면안되고 무조건 DP로 풀어야함.
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int N = sc.nextInt();
    int count = 0;
    int [] dp = new int[N+1];
    for(int i = 1; i <=N; i++) {
        dp[i] = i;
    }
    for(int i = 1; i <=N; i++) {
        for(int j = 1; j*j <=i; j++) {
            dp[i] = Math.min(dp[i], dp[i-j*j]+1);
        }
    }
    System.out.println(dp[N]);
} 
}
