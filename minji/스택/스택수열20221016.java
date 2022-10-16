package minji.스택;
import java.util.*;

public class 스택수열20221016 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int N = sc.nextInt();
    sc.nextLine();
    Stack<Integer> st = new Stack<>();
    int start = 0;
    for(int i = 0; i < N; i++) {
        int num = sc.nextInt();
        sc.nextLine();
        if(start < num) {
            for(int j = start+1; j <= num; j++) {
                st.push(j);
                sb.append("+\n");
            }
            start = num;
        } else {
            if(st.peek() != num) {
                System.out.println("NO");
                return;
            }
        }
        st.pop();
        sb.append("-\n");
    }
    System.out.println(sb.toString());
  }
}
