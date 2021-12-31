package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class 날짜계산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        int e = 1;
        int s = 1;
        int m = 1;
        int count = 1;
        for (;;) {
            if (e == E && s == S && m == M) {
                System.out.println(count);
                break;
            }

            e += 1;
            s += 1;
            m += 1;
            if (e == 16) {
                e = 1;
            }
            if (s == 29) {
                s = 1;
            }
            if (m == 20) {
                m = 1;
            }

            count++;
        }

    }

}