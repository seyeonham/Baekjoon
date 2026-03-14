import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int now = 1;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            if (num == now) {
                now++;
            } else {
                stack.push(num);
            }

            while (!stack.isEmpty() && stack.peek() == now) {
                stack.pop();
                now++;
            }
        }

        if (now == n + 1) {
            System.out.print("Nice");
        } else {
            System.out.print("Sad");
        }
    }
}
