package minji.수학;

import java.util.*;
import java.util.Scanner;

public class GCD합 {
    public static long count;
    public static void sol(int a , int b) {
        // System.out.println(a + " "+ b);
        int c=  0;
        while(b!=0) {
            c = a%b;
            a = b;
            b = c;
        }
        count += a;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            count = 0;
            int loop = sc.nextInt();
            int [] arr = new int[loop];
            for(int j = 0; j < loop; j++) {
                arr[j] = sc.nextInt();
            }
            for(int k = 0; k < loop; k++) {
                for(int z = k+1; z < loop; z++) {
                    sol(arr[k],arr[z]);
                }
            }
            System.out.println(count);
        }
       
    } 


}