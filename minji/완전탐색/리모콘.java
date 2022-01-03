package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class 리모콘 {
    public static boolean[] broken;

    public static int possible(int c) {
        if (c == 0) {
            if (broken[c]) {
                return 0;
            } else
                return 1;
        }
        int len = 0;
        while (c > 0) {
            if (broken[c % 10]) {
                return 0;
            }
            len++;
            c = c / 10;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        broken = new boolean[10];
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            broken[x] = true;
        }
        // 하나하나 이동한경우
        int ans = Math.abs(target - 100);
        for (int i = 0; i < 1000000; i++) {
            int c = i;
            int len = possible(c);
            if (len > 0) {
                ans = Math.min(ans, Math.abs(target - c) + len);
            }
        }
        System.out.println(ans);
    }
}