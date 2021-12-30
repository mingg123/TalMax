package minji.수학;

import java.util.*;
import java.util.Scanner;

public class 팔진수2진수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        if (temp.equals("0")) {
            System.out.println(0);
            return;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("0", "000");
        map.put("1", "001");
        map.put("2", "010");
        map.put("3", "011");
        map.put("4", "100");
        map.put("5", "101");
        map.put("6", "110");
        map.put("7", "111");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            sb.append(map.get(Character.toString(temp.charAt(i))));
        }
        String result = sb.toString();

        while (result.startsWith("0")) {
            result = result.replaceFirst("0", "");
        }
        System.out.println(result);

    }

}