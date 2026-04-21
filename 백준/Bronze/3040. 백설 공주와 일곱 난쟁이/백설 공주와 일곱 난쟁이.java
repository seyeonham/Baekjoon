import java.util.Scanner;

public class Main {

	static int[] numbers;
	static int[] input;
	static int count;
	static boolean found;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		input = new int[9];
		numbers	= new int[7];
		found = false;
		
		for (int i = 0; i < 9; i++) {
			input[i] = scan.nextInt();
		}
		
		combi(0, 0);
	}
	
	private static void combi(int depth, int start) {
		if (found) return;
		
		if (depth == 7) {
			int sum = 0;
			for (int num : numbers) {
				sum += num;
			}
			
			if (sum == 100) {
				for (int num : numbers) {
					System.out.println(num);
					found = true;
				}
			}
			return;
		}
		
		for (int i = start; i < 9; i++) {
			numbers[depth] = input[i];
			combi(depth + 1, i + 1);
		}
	}

}
