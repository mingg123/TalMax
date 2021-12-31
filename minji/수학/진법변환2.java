package minji.수학;

import java.util.*;
import java.util.Scanner;

public class 진법변환2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int radix = sc.nextInt();
        String result = Integer.toUnsignedString(N, radix);
        if (N > 10) {
            result = result.toUpperCase();
        }
        System.out.println(result);
    }

}