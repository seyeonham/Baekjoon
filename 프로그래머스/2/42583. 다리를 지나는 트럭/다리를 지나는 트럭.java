import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new ArrayDeque<>();
        
        int answer = 0;
        int sum = 0;
        int index = 0;
        
        for (int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }
        
        while (index < truck_weights.length) {
            answer++;
            
            sum -= queue.poll();
            
            if (sum + truck_weights[index] <= weight) {
                queue.offer(truck_weights[index]);
                sum += truck_weights[index];
                index++;
            } else {
                queue.offer(0);
            }
        }
        
        return answer + bridge_length;
    }
}