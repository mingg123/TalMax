package minji.수학;

import java.util.*;
import java.util.Scanner;

public class GCD합 {
    public static long result;

    public static void check(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        result = result + a;
    }

    public static void sol(boolean[] visit, ArrayList<Integer> arr, String target, int count, int index) {
        if (count == 2) {

            String[] token = target.split(" ");
            check(Integer.parseInt(token[0]), Integer.parseInt(token[1]));
            return;
        }
        for (int i = index; i < arr.size(); i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(visit, arr, target + " " + arr.get(i), count + 1, i);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            result = 0;
            int m = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                arr.add(num);
            }
            boolean[] visit = new boolean[arr.size()];
            for (int j = 0; j < arr.size(); j++) {
                if (!visit[j]) {
                    visit[j] = true;
                    sol(visit, arr, arr.get(j).toString(), 1, j);
                    visit[j] = false;
                }
            }
            System.out.println(result);
        }

    }

}