import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int white;
	static int blue;
	static int[][] board;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		board = new int[N][N];
		
		white = 0;
		blue = 0;
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		divide(0, 0, N);
		
		System.out.println(white);
		System.out.println(blue);
	}
	
	private static void divide(int r, int c, int size) {
		if (isSameColor(r, c, size)) {
			if (board[r][c] == 0) white++;
			else blue++;
			return;
		}
		
		int newSize = size >> 1;
		
		divide(r, c, newSize);
		divide(r, c + newSize, newSize);
		divide(r + newSize, c, newSize);
		divide(r + newSize, c + newSize, newSize);
	}
	
	private static boolean isSameColor(int r, int c, int size) {
		int color = board[r][c];
		
		for (int i = r; i < r + size; i++) {
			for (int j = c; j < c + size; j++) {
				if (board[i][j] != color) {
                    return false;
                }
			}
		}
		
		return true;
	}

}
