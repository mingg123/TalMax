package minji.스택;

import java.util.*;

public class 단어뒤집기20221016 {  
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int N = sc.nextInt();
    sc.nextLine();
    for(int i = 0; i < N; i++) {
      String str = sc.nextLine();
      String[] token = str.split(" ");
      for(int j = 0; j< token.length; j++) {
          Stack<Character> stack = new Stack<>();
          for(int k = 0; k < token[j].length(); k++) {
              stack.push(token[j].charAt(k));
          }
          while(!stack.isEmpty()) {
              sb.append(stack.pop());
          }
          sb.append(" ");
      }
      sb.append("\n");
    }
    System.out.println(sb.toString());
	}
}
