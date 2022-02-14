package minji.DP;

import java.util.Scanner;

public class 이친수 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int N = sc.nextInt();
    long [] dp = new long[N+2];
    dp[0] = 0;
    dp[1] = 1;
    dp[2]= 1;
    for(int i = 3; i <=N; i++) {
        dp[i] = dp[i-1] + dp[i-2];
    }
    System.out.println(dp[N]);
} 
}
