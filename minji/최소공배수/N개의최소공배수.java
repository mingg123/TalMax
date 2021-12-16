package minji.최소공배수;

import java.util.*;

class N개의최소공배수 {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            ans = sol(ans, arr[i]);
        }
        return ans;
    }

    public static int sol(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}