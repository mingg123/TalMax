package minji;

import java.util.*;

class 단어변환 {
    public static boolean[] visit;
    public static ArrayList<Integer> arr;

    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];
        arr = new ArrayList<>();
        dfs(begin, target, words, 0);
        Collections.sort(arr);
        return arr.size() > 0 ? arr.get(0) : 0;
    }

    public void dfs(String begin, String target, String[] words, int count) {
        if (begin.equals(target)) {
            arr.add(count);
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if (visit[i])
                continue;
            String temp = words[i];
            int cnt = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == temp.charAt(j)) {
                    cnt++;
                }
            }
            if (cnt == begin.length() - 1) {
                visit[i] = true;
                dfs(words[i], target, words, count + 1);
                visit[i] = false;
            }
        }
    }
}