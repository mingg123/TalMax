package minji.수학;

import java.util.*;
import java.util.Scanner;

public class 최대공약수와최소공배수 {

    public static int gcb(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 1;

        System.out.println(gcb(a, b));
        System.out.println(a * b / gcb(a, b));
    }
}