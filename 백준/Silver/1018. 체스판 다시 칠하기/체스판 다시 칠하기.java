import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m ; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int min = 64;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int count = 0;

                for (int x = i ;x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {

                        if ((x + y) % 2 == 0) {
                            if (arr[x][y] != 'W') {
                                count++;
                            }
                        } else {
                            if (arr[x][y] != 'B') {
                                count++;
                            }
                        }
                    }
                }

                count = Math.min(count, 64 - count);

                min = Math.min(min, count);
            }
        }

        System.out.print(min);

    }
}
