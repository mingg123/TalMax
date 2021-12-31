package minji.완전탐색;

import java.util.*;
import java.util.Scanner;

public class 일곱난쟁이 {
    public static boolean visit[];
    public static int map[];
    public static boolean isflag;

    public static void sol(int[] map, boolean[] visit, int count, String str, int total) {
        if (total > 100 || isflag)
            return;
        if (count == 7 && total == 100) {
            isflag = true;
            String[] token = str.split(" ");
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < token.length; i++) {
                arr.add(Integer.parseInt((token[i])));
            }
            Collections.sort(arr);
            for (int i = 0; i < arr.size(); i++) {
                System.out.println(arr.get(i));
            }
            return;
        }
        for (int i = 0; i < map.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(map, visit, count + 1, str + " " + Integer.toString(map[i]), total + map[i]);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        visit = new boolean[9];
        map = new int[9];
        isflag = false;
        for (int i = 0; i < 9; i++) {
            map[i] = sc.nextInt();
        }

        for (int i = 0; i < map.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                sol(map, visit, 1, Integer.toString(map[i]), map[i]);
                visit[i] = false;
            }

        }

    }

}