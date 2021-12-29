package minji.구현;


import java.util.*;
import java.util.Scanner;

public class 접미사배열 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp = in.next();
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < temp.length(); i++) {
            String st = temp.substring(i);
            arr.add(st);
        }
        
        Collections.sort(arr);
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        
    }
}