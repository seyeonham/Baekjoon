import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                int index = stack.pop();
                
                answer[index] = i - index;
            }
            
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int index = stack.pop();
            
            answer[index] = n - 1 - index;
        }
        
        return answer;
    }
}