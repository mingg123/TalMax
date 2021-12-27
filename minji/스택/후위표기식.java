package minji.스택;

import java.util.*;
import java.util.Scanner;

public class 후위표기식 {
    public static boolean isOper(char c) {
        if(c == '+' || c == '/' || c == '-' || c == '*')
        return true;
        else return false;
    }
    public static int validate(char c) {
        if(c == '+' || c == '-') {
            return 1;
        } else if(c == '(') return 0;
        else {
            return 2;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Stack <String> st = new Stack<>();
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                System.out.print(input.charAt(i));
            }
            else if(input.charAt(i) == '(') {
                st.add(Character.toString(input.charAt(i)));
            } 
            else if(input.charAt(i) == ')') {
                while(!st.isEmpty() && !st.peek().equals("(")) {
                    System.out.print(st.pop());
                }
                if(!st.isEmpty())
                {st.pop();
                }
            } else if(isOper(input.charAt(i))) {
                while(!st.isEmpty() && validate(st.peek().charAt(0)) >= validate(input.charAt(i))) {
                    String remove = st.pop();
                    if(!remove.equals("("))
                    System.out.print(remove);
                }
                st.add(Character.toString(input.charAt(i)));
            }
            
        }
        
        while(!st.isEmpty()) {
            System.out.print(st.pop());
        }
        
    }
}