import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int L, C;
	static char[] alphabet;
	static char[] password;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		alphabet = new char[C];
		password = new char[L];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < C; i++) {
			alphabet[i] = st.nextToken().charAt(0);
		}
		
		Arrays.sort(alphabet);
		
		combi(0, 0);
	}
	
	private static void combi(int depth, int start) {
		
		if (depth == L) {
			int count = 0;
			for (int i = 0; i < L; i++) {
				if (isVowel(password[i])) {
					count++;
				}
			}
			
			if (count >= 1 && (L - count) >= 2) {
				System.out.println(String.valueOf(password));
			}
			
			return;
		}
		
		for (int i = start; i < C; i++) {
			password[depth] = alphabet[i];
			combi(depth + 1, i + 1);
		}
	}
	
	private static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

}
