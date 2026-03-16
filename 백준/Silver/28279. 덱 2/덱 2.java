import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if (num == 2) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if (num == 3) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.pollFirst()).append('\n');
                }
            } else if (num == 4) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.pollLast()).append('\n');
                }
            } else if (num == 5) {
                sb.append(deque.size()).append('\n');
            } else if (num == 6) {
                if (deque.isEmpty()) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else if (num == 7) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.peekFirst()).append('\n');
                }
            } else if (num == 8) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.peekLast()).append('\n');
                }
            }
        }

        System.out.print(sb);
    }
}
