package minji.수학;

import java.util.*;
import java.util.Scanner;

public class 진법변환 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        int N = sc.nextInt();
        long result = Long.valueOf(temp, N);
        System.out.println(result);
    }

}