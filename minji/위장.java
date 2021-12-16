package minji;

import java.util.*;

class 위장 {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String cloth = clothes[i][0];
            String type = clothes[i][1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        answer = 1;
        for (String key : map.keySet()) {
            answer = (map.get(key) + 1) * answer;
        }
        return answer - 1;
    }
}