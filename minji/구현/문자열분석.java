package minji.구현;

import java.util.*;
import java.util.Scanner;

public class 문자열분석 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String temp = sc.nextLine();
            int[] result = new int[4];
            for (int i = 0; i < temp.length(); i++) {
                char c = temp.charAt(i);
                if (Character.isLowerCase(c)) {
                    result[0]++;
                } else if (Character.isUpperCase(c)) {
                    result[1]++;
                } else if (Character.isDigit(c)) {
                    result[2]++;
                } else {
                    result[3]++;
                }
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        }
    }
}