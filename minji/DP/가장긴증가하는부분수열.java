package minji.DP;

import java.util.Scanner;

public class 가장긴증가하는부분수열 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int [] arr = new int[N];
        int [] dp = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        dp[0] = 1;
       for(int i = 1; i < N; i++) {
           dp[i] = 1;
           for(int j = 0; j <N; j++) {
               if(arr[i] > arr[j] && dp[i] <= dp[j]) {
                    dp[i] = dp[j]+1;
                    sb.append(arr[i]).append(" ");
               }
           }
       }
       int max = 0;
       for(int i = 0; i < N; i++) {
           max = Math.max(max, dp[i]);
       }
       System.out.println(max);
    } 
}

