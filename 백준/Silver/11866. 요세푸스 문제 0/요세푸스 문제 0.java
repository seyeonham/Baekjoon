import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue1 = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue1.add(i);
        }

        Queue<Integer> queue2 = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k - 1; j++) {
                queue1.add(queue1.poll());
            }
            queue2.add(queue1.poll());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int size = queue2.size();
        for (int i = 0; i < size - 1; i++) {
            sb.append(queue2.poll()).append(", ");
        }
        sb.append(queue2.poll()).append(">");

        System.out.print(sb);
    }
}
