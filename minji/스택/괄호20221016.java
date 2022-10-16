package minji.스택;

import java.util.Scanner;
import java.util.Stack;

public class 괄호20221016 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int N = sc.nextInt();
    sc.nextLine();
    for(int i = 0 ; i < N; i++) {
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for(int j = 0; j < str.length(); j++) {
            Character token = str.charAt(j);
            if(token == '(') {
                stack.push(token);
            }
            else {
                if(stack.isEmpty()) {
                    sb.append("NO\n");
                    break;
                } else {
                    stack.pop();
                }
            }
            if(j== str.length()-1) {
                if(stack.isEmpty()) {
                    sb.append("YES\n");
                    break;
                } else {
                    sb.append("NO\n");
                    break;
                }
            }
        }
    }
    System.out.println(sb.toString());
  }
}
