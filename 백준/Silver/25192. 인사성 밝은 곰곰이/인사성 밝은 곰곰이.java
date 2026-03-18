import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.equals("ENTER")) {
                set.clear();
            } else {
                if (!set.contains(s)) {
                    set.add(s);
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}
