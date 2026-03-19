import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        Arrays.sort(times);
        
        long low = 1;
        long high = (long) times[times.length - 1] * n;
        
        while (low <= high) {
            long mid = (low + high) / 2;
            long sum = 0;
            
            for (int time : times) {
                sum += mid / time;
            }
            
            if (sum >= n) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return answer;
    }
}