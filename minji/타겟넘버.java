package minji;

import java.util.*;

class 타겟넘버 {
    public static ArrayList<Integer> result;

    public int solution(int[] numbers, int target) {
        result = new ArrayList<>();
        int answer = 0;
        dfs(0, 0, numbers, target);
        return result.size();
    }

    public void dfs(int total, int idx, int[] arr, int target) {
        if (idx == arr.length) {
            if (total == target) {
                result.add(idx);
            }
            return;
        }
        dfs(total + arr[idx], idx + 1, arr, target);
        dfs(total - arr[idx], idx + 1, arr, target);
    }
}