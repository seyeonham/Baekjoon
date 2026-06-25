import java.util.*;

class Solution {
    
    public int[] solution(int brown, int yellow) {
        List<Integer> list = divisors(yellow);
        
        for (int h : list) {
            int w = yellow / h;
            int count = w * 2 + h * 2 + 4;
            
            if (brown == count) {
                return new int[]{w + 2, h + 2};
            }
        }
        return new int[2];
    }
    
    private static List<Integer> divisors(int num) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }

        return list;
    }
}