package minji.수학;

import java.util.*;
import java.util.Scanner;

public class 소인수분해 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long num = sc.nextLong();
        int temp = 2;
        while (true) {
            if (num == 1)
                break;
            if (num % temp == 0 && isprime(temp)) {
                num = num / temp;
                System.out.println(temp);
            } else {
                temp++;
            }
        }
    }

    public static boolean isprime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}