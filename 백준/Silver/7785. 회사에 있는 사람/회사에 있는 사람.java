import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();

            if (state.equals("enter")) {
                map.put(name, state);
            } else if (state.equals("leave")) {
                map.remove(name);
            }

        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (s1, s2) ->
            s2.compareTo(s1)
        );

        StringBuilder sb = new StringBuilder();
        for (String value : list) {
            sb.append(value).append('\n');
        }

        System.out.print(sb);
    }
}
