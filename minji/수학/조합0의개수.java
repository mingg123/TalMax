package minji.수학;

import java.util.*;
import java.util.Scanner;

public class 조합0의개수 {
    public static int five(int num) {
        int count = 0;
        while (num >= 5) {
            count += num / 5;
            num = num / 5;
        }
        return count;
    }

    public static int two(int num) {
        int count = 0;
        while (num >= 2) {
            count += num / 2;
            num = num / 2;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = (five(n) - five(n - m) - five(m));
        int res1 = (two(n) - two(n - m) - two(m));
        System.out.println(Math.min(res, res1));
    }

}