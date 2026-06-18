import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[numbers.length];
        
        Arrays.fill(result, -1);
        
        for (int i = 0; i < numbers.length; i++) {
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                int index = stack.pop();
                result[index] = numbers[i];
            }
            
            stack.push(i);
        }
        
        return result;
    }
}