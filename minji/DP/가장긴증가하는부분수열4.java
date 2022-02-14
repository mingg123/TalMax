package minji.DP;

import java.util.*;

class 가장긴증가하는부분수열4 {
 
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
               }
           }
       }
       int max = 0;
       for(int i = 0; i < N; i++) {
           max = Math.max(max, dp[i]);
       }
       int value = max;
       Stack<Integer> st = new Stack<>();
       for(int i = N-1; i >=0; i--) {
            if(value == dp[i]) {
                st.add(arr[i]);
                value --;
            }
       }
       System.out.println(max);
       while(!st.isEmpty()) {
           System.out.print(st.pop() + " ");
       }

    } 
}