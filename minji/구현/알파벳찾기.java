package minji.구현;

import java.util.*;
import java.util.Scanner;

public class 알파벳찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        HashMap<String, Integer> map = new HashMap<>();
        String[] alph = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z" };
        for (int i = 0; i < alph.length; i++) {
            map.put(alph[i], -1);
        }
        for (int i = 0; i < temp.length(); i++) {
            String target = Character.toString(temp.charAt(i));
            if (map.containsKey(target)) {
                int num = map.get(target);
                if (num == -1) {
                    map.put(target, i);
                }
            }
        }
        for (String key : map.keySet()) {
            System.out.print(map.get(key) + " ");
        }
    }
}