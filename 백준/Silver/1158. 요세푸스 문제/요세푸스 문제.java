import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayDeque<Integer> queue = new ArrayDeque<>();
		for (int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while (!queue.isEmpty()) {
			for (int i = 0; i < k - 1; i++) {
				int num = queue.poll();
				queue.offer(num);
			}
			
			int removed = queue.poll();
			sb.append(removed);
			
			if (!queue.isEmpty()) {
				sb.append(", ");
			}
		}
		
		sb.append(">");
		System.out.println(sb);
	}

}
