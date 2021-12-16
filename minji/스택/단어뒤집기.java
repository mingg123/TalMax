package minji.스택;

import java.util.*;
import java.util.Scanner;

public class 단어뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            String temp = sc.nextLine();
            sol(temp);
        }
    }

    public static void sol(String temp) {
        String[] token = temp.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < token.length; i++) {
            Stack<String> st = new Stack<String>();
            for (int j = 0; j < token[i].length(); j++) {
                st.push(Character.toString(token[i].charAt(j)));
            }
            while (!st.isEmpty()) {
                sb.append(st.pop());
            }
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
