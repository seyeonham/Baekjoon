import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String s = br.readLine();
            if (s.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                } else if (s.charAt(i) == ')') {
                    if (stack.empty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;
                    } else if (stack.peek() == '(') {
                        stack.pop();
                    }
                } else if (s.charAt(i) == ']') {
                    if (stack.empty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    } else if (stack.peek() == '[') {
                        stack.pop();
                    }
                }
            }

            if (isBalanced && stack.empty()) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }

        }

        System.out.print(sb);
    }
}
