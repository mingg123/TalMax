import java.util.*;

class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        Stack<String> st = new Stack<>();
        if (s.charAt(s.length() - 1) == '(')
            return false;
        if (s.charAt(0) == ')')
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.add(Character.toString(s.charAt(i)));
            } else {
                if (st.size() > 0) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.size() != 0 ? false : true;
    }
}