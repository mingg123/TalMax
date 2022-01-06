package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class 퇴사 {
    public static int N;
    public static day[] arr;
    public static int result;

    public static void sol(int day, int finish, int sum) {
        if (day == N + 1) {
            result = Math.max(result, sum);
            return;
        }
        if (day >= finish && day + arr[day].time <= N + 1) {
            sol(day + 1, day + arr[day].time, sum + arr[day].cost);
        }
        sol(day + 1, finish, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new day[N + 1];
        for (int i = 1; i <= N; i++) {
            int t = sc.nextInt();
            int c = sc.nextInt();
            arr[i] = new day(t, c);
        }
        result = 0;
        sol(1, 0, 0);
        System.out.println(result);
    }

}

class day {
    int time;
    int cost;

    public day(int time, int cost) {
        super();
        this.time = time;
        this.cost = cost;
    }
}