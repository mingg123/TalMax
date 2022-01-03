package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class 수이어붙이기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int temp = 0;
        int up = 10;
        int cnt = 1;
        for (int i = 1; i <= target; i++) {
            if (i == up) {
                cnt++;
                up = up * 10;
            }
            temp = temp + cnt;
        }
        System.out.println(temp);

    }
}