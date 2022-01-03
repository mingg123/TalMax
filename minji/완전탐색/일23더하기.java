package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class 일23더하기 {
    public static int result;

    public static void sol(int num, int target, int count, String temp) {
        if (num > target)
            return;
        if (num == target) {
            result++;
            // System.out.println(temp);
            return;
        }
        sol(num + 1, target, count + 1, temp + " " + count + 1);
        sol(num + 2, target, count + 1, temp + " " + count + 2);
        sol(num + 3, target, count + 1, temp + " " + count + 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int target = sc.nextInt();
            result = 0;
            sol(0, target, 0, "");
            System.out.println(result);
        }

    }
}