package minji.수학;

import java.util.*;
import java.util.Scanner;

public class 골드바흐파티션 {
    public static boolean[] prime;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        prime = new boolean[1000001];
        get_prime();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int count = sol(num);
            System.out.println(count);
        }

    }

    public static void get_prime() {
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i])
                continue;
            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }
    }

    public static int sol(int num) {
        int count = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (!prime[i] && !prime[num - i]) {
                count++;
            }
        }

        return count;
    }
}