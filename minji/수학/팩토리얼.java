package minji.수학;

import java.util.*;
import java.util.Scanner;

public class 팩토리얼 {
    public static boolean[] prime;
    public static StringBuilder sb;

    public static int sol(int num) {
        if (num == 1 || num == 0)
            return 1;
        else {
            return num * sol(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = sol(N);
        System.out.println(result);
    }

}