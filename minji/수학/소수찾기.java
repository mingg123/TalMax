package minji.수학;

import java.util.*;
import java.util.Scanner;

public class 소수찾기 {
    public static boolean find(int target) {
        if (target == 1)
            return false;
        boolean isflag = true;
        for (int i = 2; i < target; i++) {
            int result = target % i;
            if (result == 0) {
                return false;
            }
        }
        return isflag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int target = sc.nextInt();
            if (find(target)) {
                count++;
            }
        }
        System.out.println(count);
    }
}