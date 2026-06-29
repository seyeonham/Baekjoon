import java.util.*;

class Solution {
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;
    
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];

        dfs(numbers, "");

        int answer = 0;

        for (int num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }
    
    private static void dfs(String numbers, String current) {
        if (!current.equals("")) {
            set.add(Integer.parseInt(current));
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, current + numbers.charAt(i));
                visited[i] = false;
            }
        }
    }
    
    private static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}