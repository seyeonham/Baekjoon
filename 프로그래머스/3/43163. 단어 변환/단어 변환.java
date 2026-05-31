import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Queue<String> queue = new LinkedList<>();
        Queue<Integer> countQueue = new LinkedList<>();

        boolean[] visited = new boolean[words.length];

        queue.offer(begin);
        countQueue.offer(0);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int count = countQueue.poll();

            if (current.equals(target)) {
                return count;
            }

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && canChange(current, words[i])) {
                    visited[i] = true;
                    queue.offer(words[i]);
                    countQueue.offer(count + 1);
                }
            }
        }

        return 0;
    }

    private boolean canChange(String word1, String word2) {
        int diff = 0;

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diff++;
            }
        }

        return diff == 1;
    }
}