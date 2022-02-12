package minji.스택;

import java.util.*;

public class 스택수열 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int start = 0;
        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
     
                if(start < num) {
                    for(int k = start+1; k <= num; k++) {
                        st.add(k);
                        sb.append("+").append("\n");
                    }
                    start = num;
                } else {
                    if(st.peek() != num) {
                        System.out.println("NO");
                        return;
                    }
                }
                st.pop();
                sb.append("-").append("\n");
            
        }
        System.out.println(sb.toString());
    }
  
}
