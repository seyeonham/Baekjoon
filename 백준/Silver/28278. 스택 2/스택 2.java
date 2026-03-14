import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (num == 2) {
                if (stack.empty()) {
                    sb.append(-1).append('\n');
                } else {
                    int x = stack.pop();
                    sb.append(x).append('\n');
                }
            } else if (num == 3) {
                sb.append(stack.size()).append('\n');
            } else if (num == 4) {
                if (stack.empty()) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else if (num == 5) {
                if (stack.empty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(stack.peek()).append('\n');
                }
            }
        }

        System.out.print(sb);
    }
}
