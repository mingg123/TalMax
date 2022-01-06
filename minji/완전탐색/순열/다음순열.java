package minji.완전탐색.순열;

import java.util.*;
import java.util.Scanner;

public class 다음순열 {
    public static int N;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int target = 0;
        for (int i = N - 1; i >= 1; i--) {
            if (arr[i - 1] < arr[i]) {
                target = i;
                break;
            }
        }
        if (target == 0) {
            System.out.println(-1);
            return;
        }
        int min = Integer.MAX_VALUE;
        int minIdx = Integer.MAX_VALUE;
        for (int i = N - 1; i >= target; i--) {
            if (arr[target - 1] < arr[i] && min > arr[i]) {
                minIdx = i;
                min = arr[i];
            }
        }
        if (minIdx != Integer.MAX_VALUE) {
            int temp = arr[target - 1];
            arr[target - 1] = arr[minIdx];
            arr[minIdx] = temp;
        }

        for (int i = target; i < N; i++) {
            for (int j = target; j < N; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}