package minji.스택;

import java.util.*;
import java.util.Scanner;

public class 단어뒤집기2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Stack <String> st = new Stack<>();
        boolean isrever = true;
        ArrayList<String> list = new ArrayList<>();
        for(int i =0; i < input.length(); i++) {
            if(input.charAt(i)== '>') {
                list.add(Character.toString(input.charAt(i)));
                isrever = true;
            }
            else if(input.charAt(i) == '<') {
                isrever = false;
                while(!st.isEmpty()) {
                    list.add(st.pop());
                }
            } else if(input.charAt(i) == ' ') {
                while(!st.isEmpty()) {
                    list.add(st.pop());
                }
                list.add(Character.toString(input.charAt(i)));
            }
            if(isrever && input.charAt(i)!= '>' && input.charAt(i) != ' ') {
                st.add(Character.toString(input.charAt(i)));
               
            } 
            else if(!isrever && input.charAt(i) != ' ') {
                list.add(Character.toString(input.charAt(i)));
            }
        }
         while(!st.isEmpty()) {
             list.add(st.pop());
         }
        for(int i  = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}