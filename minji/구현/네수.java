package minji.구현;

import java.util.*;
import java.util.Scanner;

public class 네수 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String A = in.next();
        String B = in.next();
        String C = in.next();
        String D = in.next();
        String temp = A + B;
        String temp2 = C + D;
 
       long result = Long.parseLong(temp) + Long.parseLong(temp2);
      
        System.out.println(result);
    }
}