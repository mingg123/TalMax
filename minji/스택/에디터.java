package minji.스택;

import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// BufferReader, BufferWriter 안쓰면 시간초과 나는 문제임
class 에디터 {

  public static void main(String args[])  throws IOException{
    // Scanner sc = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // String temp = sc.next();
    String temp =reader.readLine();
    // sc.nextLine();

    // int N = sc.nextInt();
    int N = Integer.parseInt(reader.readLine());
    Stack<String> leftSt = new Stack<String>();
    Stack<String> rightSt = new Stack<String>();
    for(int i = 0 ; i < temp.length(); i++) {
      leftSt.push(Character.toString(temp.charAt(i)));
    }
    for(int i = 0; i < N; i++) {
      // String command = sc.next();
      String command = reader.readLine();
      switch(command.charAt(0)) {
        case 'L' :
        if(!leftSt.isEmpty())
        rightSt.push(leftSt.pop());
        break;
        case 'D' :
        if(!rightSt.isEmpty())
        leftSt.push(rightSt.pop());
        break;
        case 'B' :
        if(!leftSt.isEmpty()) {
          leftSt.pop();
        }
        break;
        case 'P':
        // String addStr = sc.next();
        // String addStr = reader.readLine();
        leftSt.push(Character.toString(command.charAt(2)));
        break;
        default : 
        break;
      }
    }
    while(!leftSt.isEmpty()) {
      rightSt.push(leftSt.pop());
    }
    // System.out.println(rightSt.size());
    while(!rightSt.isEmpty()) {
      // System.out.print(rightSt.pop());
      bw.write(rightSt.pop());
    }
    bw.flush();
		bw.close(); 
  }

}