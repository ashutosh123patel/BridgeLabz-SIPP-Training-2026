import java.util.*;

/**
 * GraphByList
 */
public class GraphByList {
    int vertex;
    List<List<Integer>> adjList;

    GraphByList(int vertex) {
        this.vertex = vertex;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertex; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdges(int source, int dest) {
        adjList.get(source).add(dest);
        adjList.get(dest).add(source);

    }

    void bfs(int startVertex) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> hs = new HashSet<>();

        q.offer(startVertex);
        hs.add(startVertex);

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (int neigh : adjList.get(curr)) {
                if (!hs.contains(neigh)) {
                    q.offer(neigh);
                    hs.add(neigh);
                }
            }
        }
    }

    void dfs(int startVertex) {
        boolean[] visited = new boolean[vertex];
        dfsHelper(startVertex, visited);
    }

    void dfsHelper(int curr, boolean[] visited) {
        visited[curr] = true;
        System.out.print(curr + " ");

        for (int neigh : adjList.get(curr)) {
            if (!visited[neigh]) {
                dfsHelper(neigh, visited);
            }
        }
    }

    public void print() {
        for (int i = 0; i < vertex; i++) {
            System.out.print(i + ": ");
            for (int j : adjList.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        GraphByList g = new GraphByList(5);
        g.addEdges(0, 1);
        g.addEdges(0, 2);
        g.addEdges(1, 3);
        g.addEdges(1, 4);
        g.addEdges(2, 3);

        g.bfs(0);
        // System.out.println();
        // g.print();

    }
}