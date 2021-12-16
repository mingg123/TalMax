package minji.스택;

import java.util.*;

public class 괄호 {
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
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '(') {
                st.push(temp.charAt(i));
            } else {
                if (st.isEmpty()) {
                    System.out.println("NO");
                    return;
                } else {
                    st.pop();
                }
            }
        }
        if (st.size() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
