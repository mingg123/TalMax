package 문자열;

import java.util.*;

class JadenCase문자열만들기 {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        answer = answer + Character.toString(s.charAt(0)).toUpperCase();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer = answer + " ";
            } else if (s.charAt(i - 1) == ' ') {
                answer = answer + Character.toString(s.charAt(i)).toUpperCase();
            } else {
                answer = answer + s.charAt(i);
            }
        }
        // " "로 자르면 안됨. 런타임 에러 발생
        // String [] token = s.split(" ");
        // System.out.println(s);
        // for(int i = 0; i < token.length; i++) {
        // String temp = token[i];
        // String first = temp.substring(0,1);
        // String second = temp.substring(1, temp.length());
        // answer = answer + " " + first.toUpperCase() + second;
        // }
        return answer;
    }
}