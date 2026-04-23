import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int r;
	static int c;
	static int res;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		res = 0;
		
		int size = 1 << N;
		
		divide(0, 0, size);
				
	}
	
	private static void divide(int y, int x, int size) {
		if (x == c && y == r) {
			System.out.println(res);
			return;
		}
		
		if (c >= x && c < x + size && r >= y && r < y + size) {
			int half = size >> 1;
		
			divide(y, x, half);
			divide(y, x + half, half);
			divide(y + half, x, half);
			divide(y + half, x + half, half);
			
		} else {
			res += size * size;
		}
	}

}
