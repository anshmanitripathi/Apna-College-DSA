import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class c_dfs_traversal {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.println(curr + " ");
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                DFS(graph, e.dest, visited);
            }
        }

    }

    public static void main(String[] args) {

        /*
         * (5)
         * 0------ 1
         * / \
         * (1) / \ (3)
         * / \
         * 2 ------3
         * | (1)
         * (2)|
         * |
         * 4
         */

        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // for vertex 0
        graph[0].add(new Edge(0, 1, 5));

        // for vertex 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // for vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // for vertex 3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // for vertex 4
        graph[4].add(new Edge(4, 2, 2));

        // BFS(graph);

        DFS(graph, 0, new boolean[V]);

    }
}
