import java.util.*;
public class 오픈채팅방 {
class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        HashMap<String, String> map = new HashMap<>();
        
        for(int i = 0; i < record.length; i++) {
            String [] token = record[i].split(" ");
            if(!token[0].equals("Leave")) {
                String Id = token[1];
                map.put(Id, token[2]);
            }
        }
     
       
        ArrayList <String> result = new ArrayList<>();
        for(int i = 0; i < record.length; i++) {
             String [] token = record[i].split(" ");
             String info = map.get(token[1]) + "님이 ";
             String temp = "";
             StringBuilder sb = new StringBuilder();
             switch(token[0]) {
                 case "Enter" : 
                 sb.append(info).append("들어왔습니다.");
                 break;
                 case "Leave" : 
                sb.append(info).append("나갔습니다.");
                break;
                default :
                break;
             }
            if(sb.length() != 0)
            result.add(sb.toString());
        }
        answer = result.toArray(new String[result.size()]);
        return answer;
    }
}
}
