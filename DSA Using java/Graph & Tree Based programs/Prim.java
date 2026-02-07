import java.util.*;

public class Prim {
    private static final int INF = Integer.MAX_VALUE;

    public static void primMst(int[][] graph, int V) {
        int[] key = new int[V];        // min edge weight to connect vertex to MST
        int[] parent = new int[V];     // store MST structure
        boolean[] mstSet = new boolean[V]; // true if vertex included in MST

        Arrays.fill(key, INF);
        Arrays.fill(mstSet, false);

        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, mstSet, V);
            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                // edge exists, v not in MST, and weight smaller than current key[v]
                if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, graph, V);
    }

    private static int minKey(int[] key, boolean[] mstSet, int V) {
        int min = INF, minIndex = -1;

        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    private static void printMST(int[] parent, int[][] graph, int V) {
        System.out.println("Edge\tWeight");
        int total = 0;

        for (int i = 1; i < V; i++) {
            int w = graph[parent[i]][i];
            total += w;
            System.out.println(parent[i] + " - " + i + "\t" + w);
        }
        System.out.println("Total weight = " + total);
    }

    // Example usage
    public static void main(String[] args) {
        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        primMst(graph, graph.length);
    }
}
