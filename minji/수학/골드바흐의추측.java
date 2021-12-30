package minji.수학;

import java.util.*;
import java.util.Scanner;

public class 골드바흐의추측 {
    public static boolean[] prime;
    public static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prime = new boolean[1000001];
        sb = new StringBuilder();
        get_prime();
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            sol(n);
        }
    }

    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i])
                continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

    public static void sol(int num) {
        if (num == 0 || num == 1 || num == 2) {
            System.out.println("Goldbach's conjecture is wrong.");
        } else {
            for (int i = 2; i <= num; i++) {
                if (!prime[i] && !prime[num - i]) {
                    System.out.println(num + " = " + i + " + " + (num - i));

                    break;
                }
            }

        }
    }
}