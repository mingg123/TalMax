package minji.수학;

import java.util.*;
import java.util.Scanner;

public class 이진수8진수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        int len = temp.length();
        StringBuilder sb = new StringBuilder();
        if (len % 3 == 2) {
            temp = "0" + temp;
        } else if (len % 3 == 1) {
            temp = "00" + temp;
        }
        int result = 0;
        for (int i = 0; i < temp.length(); i++) {
            int target = Integer.parseInt(Character.toString(temp.charAt(i)));
            if (i % 3 == 0) {
                target = target * 4;
            } else if (i % 3 == 1) {
                target = target * 2;
            } else {
                target = target * 1;
            }
            result = result + target;
            if (i % 3 == 2) {
                sb.append(result);
                result = 0;
            }
        }
        System.out.println(sb.toString());
    }

}