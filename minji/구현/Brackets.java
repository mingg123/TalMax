package minji.구현;

import java.util.*;

//Codility
public class Brackets {

    class Solution {
        public int solution(String S) {
            Stack<Character> s = new Stack<>();

            for (int i = 0; i < S.length(); i++) {
                char temp = S.charAt(i);
                if (temp == '(' || temp == '{' || temp == '[') {
                    s.push(temp);
                } else {
                    if (s.isEmpty())
                        return 0;
                    char str = s.pop();
                    if (temp == ')' && str != '(') {
                        return 0;
                    }
                    if (temp == '}' && str != '{') {
                        return 0;
                    }
                    if (temp == ']' && str != '[') {
                        return 0;
                    }
                }
            }
            return s.isEmpty() ? 1 : 0;
        }
    }
}
