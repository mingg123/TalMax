package minji.스택;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        int result = 0;
        Stack<String> st = new Stack<>();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '(') {
                st.add(Character.toString(temp.charAt(i)));
            } else {
                st.pop();
                if (temp.charAt(i - 1) == '(') {
                    result += st.size();
                } else {
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}
