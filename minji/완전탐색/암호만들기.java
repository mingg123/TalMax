package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class 암호만들기 {
    public static int N;
    public static int len;
    public static int answer;
    public static String[] temp;
    public static boolean[] visit;
    public static ArrayList<String> check2;

    public static void sol(int num, int cnt1, int cnt2, String[] check, int count, String str) {

        if (count == N && cnt1 >= 1 && cnt2 >= 2) {

            System.out.println(str);
            return;
        }
        for (int i = num + 1; i < len; i++) {
            int tempcnt1 = cnt1;
            int tenpcnt2 = cnt2;
            if (!visit[i]) {
                visit[i] = true;
                if (check2.contains(temp[i])) {
                    tempcnt1++;
                } else {
                    tenpcnt2++;
                }
                sol(i, tempcnt1, tenpcnt2, check, count + 1, str + temp[i]);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        len = sc.nextInt();
        temp = new String[len];
        visit = new boolean[len];
        String[] check = { "a", "e", "i", "o", "u" };
        check2 = new ArrayList<>(Arrays.asList(check));
        for (int i = 0; i < len; i++) {
            temp[i] = sc.next();
        }
        Arrays.sort(temp);

        for (int i = 0; i < len; i++) {
            int cnt1 = 0;
            int cnt2 = 0;
            if (!visit[i]) {
                visit[i] = true;
                if (check2.contains(temp[i])) {
                    cnt1++;
                } else {
                    cnt2++;
                }
                sol(i, cnt1, cnt2, check, 1, temp[i]);
                visit[i] = false;
            }
        }
    }
}