package minji.구현;


import java.util.*;
import java.util.Scanner;

public class ROT13 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp = in.nextLine();
      
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < temp.length(); i++) {
            if(Character.isDigit(temp.charAt(i))) {
                sb.append(temp.charAt(i));
            } else if(temp.charAt(i) == ' '){
                sb.append(" ");
            } else {
               if(Character.isLowerCase(temp.charAt(i))) {
                    if(temp.charAt(i) >= 'a' && temp.charAt(i) <= 'm') {
                        sb.append((char) (temp.charAt(i) + 13));
                    } else {
                        sb.append((char) (temp.charAt(i) - 13));
                    }
                
               } else {
                if(temp.charAt(i) >= 'A' && temp.charAt(i) <= 'M') {
                    sb.append((char) (temp.charAt(i) + 13));
                } else {
                    sb.append((char)(temp.charAt(i) - 13));
                }
               }
            }
        }
        System.out.println(sb.toString());
    }
}