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
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            deque.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }

        while (!deque.isEmpty()) {
            int[] current = deque.pollFirst();
            sb.append(current[0]).append(" ");

            if (deque.isEmpty()) {
                break;
            }

            int move = current[1];

            if (move > 0) {
                for (int j = 0; j < move - 1; j++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for (int j = 0; j < Math.abs(move); j++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.print(sb);
    }
}
