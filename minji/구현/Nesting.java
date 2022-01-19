package minji.구현;
import java.util.*;
public class  Nesting {
  public int solution(String S) {
    Stack<Character> s = new Stack<>();
    for(int i = 0; i < S.length(); i++) {
        if(S.charAt(i) == '(') {
            s.push(S.charAt(i));
        } else {
            if(s.isEmpty()) return 0;
            else s.pop();
        }
    }
    return s.size() == 0 ? 1 : 0;
}
}
