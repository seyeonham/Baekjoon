import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int res = 0;
		
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				stack.push('(');
			} else {
				stack.pop();
				if (s.charAt(i - 1) == '(') {
					res += stack.size();
				} else {
					res += 1;
				}
			}
		}
		
		System.out.println(res);
	}

}
