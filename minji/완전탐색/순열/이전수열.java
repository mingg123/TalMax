package minji.완전탐색.순열;

import java.util.*;
import java.util.Scanner;

public class 이전수열 {
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
            if (arr[i] < arr[i - 1]) {
                target = i;
                break;
            }
        }
        if (target == 0) {
            System.out.println(-1);
            return;
        }
        // 7보다 작지만 뒤에서 젤 큰거
        int maxIdx = 0;
        int max = 0;
        for (int i = N - 1; i >= target; i--) {
            if (max < arr[i] && arr[target - 1] > arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }
        if (max != 0) {
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[target - 1];
            arr[target - 1] = temp;
        }

        for (int i = target; i < N; i++) {
            for (int j = target; j < N; j++) {
                if (arr[i] > arr[j]) {
                    int change = arr[j];
                    arr[j] = arr[i];
                    arr[i] = change;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}