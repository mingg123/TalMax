package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class 부등호 {
    public static int N;
    public static boolean[] visit;
    public static String[] dir;
    public static ArrayList ans;

    public static boolean ch(String dir, char a, char b) {
        if (dir.equals("<") && Character.getNumericValue(a) < Character.getNumericValue(b)) {
            return true;
        }
        if (dir.equals(">") && Character.getNumericValue(a) > Character.getNumericValue(b)) {
            return true;
        }
        return false;
    }

    public static void sol(int idx, String num) {
        if (idx == N + 1) {
            ans.add(num);
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (!visit[i] && ch(dir[idx - 1], num.charAt(idx - 1), Integer.toString(i).charAt(0))) {
                visit[i] = true;
                sol(idx + 1, num + Integer.toString(i));
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        ans = new ArrayList<String>();
        dir = new String[N];
        visit = new boolean[10];
        for (int i = 0; i < N; i++) {
            dir[i] = sc.next();
        }

        for (int i = 0; i < 10; i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(1, Integer.toString(i));
                visit[i] = false;
            }
        }
        Collections.sort(ans);
        System.out.println(ans.get(ans.size() - 1));
        System.out.println(ans.get(0));

    }

}