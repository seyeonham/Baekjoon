import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[] {i, priorities[i]});
        }
        
        int count = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            boolean isHigher = false;
            for (int[] process : queue) {
                if (process[1] > current[1]) {
                    isHigher = true;
                    break;
                }
            }
            
            if (isHigher) {
                queue.offer(current);
            } else {
                count++;
                if (current[0] == location) {
                    return count;
                }
            }
        }
        
        return count;
    }
}