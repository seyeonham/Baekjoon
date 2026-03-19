import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] step = new int[progresses.length];
        
        for (int i = 0; i < progresses.length; i++) {
            step[i] = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
        }
        
        List<Integer> list = new ArrayList<>();
        
        int day = step[0];
        int count = 1;
        
        for (int i = 1; i < step.length; i++) {
            if (step[i] <= day) {
                count++;
            } else {
                list.add(count);
                day = step[i];
                count = 1;
            }
        }
        
        list.add(count);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}