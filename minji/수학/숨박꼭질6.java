package minji.수학;

import java.util.*;
import java.util.Scanner;

public class 숨박꼭질6 {
    public static long sol(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long start = sc.nextInt();
        long[] visit = new long[n];
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            visit[i] = Math.abs(temp - start);
        }
        long result = visit[0];
        for (int i = 1; i < n; i++) {
            result = sol(result, visit[i]);
        }
        System.out.println(result);
    }

}