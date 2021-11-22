import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue <Integer> q = new LinkedList<>();
        int count = 1;
        int idx = 0;
        int sum = truck_weights[0];
        q.add(truck_weights[idx++]);
        while(!q.isEmpty()) {
            int top = q.peek();
            if(q.size() < bridge_length && idx <truck_weights.length) {
                if(sum + truck_weights[idx] <= weight) {
                    q.add(truck_weights[idx]);
                    sum += truck_weights[idx];
                    idx++;
                    count++;
                } else {
                    q.add(0);
                    count++;
                }
            } else {  
                sum -= q.peek();
                q.poll();
                // count++;
            }
        }
        // System.out.println(count+ bridge_length);
        return count + bridge_length;
    }
}