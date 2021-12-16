import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        ArrayList<Integer> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String temp = in.next();
            switch (temp) {
                case "push":
                    int num = in.nextInt();
                    st.push(num);
                    break;
                case "top":
                    int top = -1;
                    sb.append(!st.isEmpty() ? st.peek() : top).append("\n");
                    break;
                case "size":
                    sb.append(st.size()).append("\n");
                    break;
                case "empty":
                    sb.append(st.empty() ? 1 : 0).append("\n");
                    break;
                case "pop":
                    sb.append(!st.isEmpty() ? st.pop() : -1).append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());

    }
}