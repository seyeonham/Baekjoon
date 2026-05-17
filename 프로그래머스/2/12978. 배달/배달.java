import java.util.*;

class Solution {
    static class Node {
        int to;
        int cost;

        Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    public int solution(int N, int[][] road, int K) {
        ArrayList<Node>[] graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] r : road) {
            int a = r[0];
            int b = r[1];
            int c = r[2];

            graph[a].add(new Node(b, c));
            graph[b].add(new Node(a, c));
        }

        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        pq.offer(new Node(1, 0));

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if (now.cost > dist[now.to]) continue;

            for (Node next : graph[now.to]) {
                int newCost = now.cost + next.cost;

                if (newCost < dist[next.to]) {
                    dist[next.to] = newCost;
                    pq.offer(new Node(next.to, newCost));
                }
            }
        }

        int answer = 0;

        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) {
                answer++;
            }
        }

        return answer;
    }
}