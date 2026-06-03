import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        
        int answer = 0;
        int camera = -30001;
        
        for (int[] route : routes) {
            int start = route[0];
            int end = route[1];
            
            if (start > camera) {
                answer++;
                camera = end;
            }
        }
        
        return answer;
    }
}