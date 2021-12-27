package minji.스택;

import java.util.*;
import java.util.Scanner;

public class 오큰수 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            temp[i] = in.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < N; i++) {
            while (!st.isEmpty() && temp[st.peek()] < temp[i]) {
                temp[st.pop()] = temp[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            temp[st.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            sb.append(temp[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}