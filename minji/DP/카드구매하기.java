package minji.DP;

  import java.util.*;


 class 카드구매하기 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int N = sc.nextInt();
  
    int [] arr = new int[N+1];
    int [] p = new int[N+1];
  
    for(int i = 1; i <=N; i++) {
        p[i] = sc.nextInt();
    }
    for(int i = 1; i <=N; i++) {
        for(int j = 1; j <=i; j++) {
            arr[i] = Math.max(arr[i], p[j] + arr[i-j]);
        }
    }
    System.out.println(arr[N]);
  }
 }
  // DP문제라 이렇게 하면 시간초과남.
  // class 카드구매하기 {
  //     public static int max;
  //     public static void sol(int num, int[] arr, int total) {
  //         if(num == 0) {
  //             max = Math.max(max, total);
  //             return;
  //         }
  //         for(int i = 1 ; i < arr.length; i++) {
  //             if(num - i >=0) {
  //                 sol(num-i, arr, total+ arr[i]);
  //             }
  //         }
  //     }
  //     public static void main(String args[]) {
  //         Scanner sc = new Scanner(System.in);
  //         StringBuilder sb = new StringBuilder();
  //         int N = sc.nextInt();
  //         max = Integer.MIN_VALUE;
  //         int [] arr = new int[N+1];
  //         for(int i = 1; i <= N; i++) {
  //             int num = sc.nextInt();
  //             arr[i] = num;
  //         }
  //         sol(N, arr, 0);
  //         System.out.println(max);
  //     } 
  // }  
