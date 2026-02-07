import java.util.*;

public class KruskalAlgorithm {

    static class Edge {
        int a, b, w;
        Edge(int a, int b, int w) { this.a = a; this.b = b; this.w = w; }
    }

    static int find(int x, int[] parent) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x], parent); 
    }

    static boolean union(int a, int b, int[] parent) {
        a = find(a, parent);
        b = find(b, parent);
        if (a == b) return false;     
        parent[b] = a;                
        return true;
    }

    public static void main(String[] args) {
        int n = 4; // nodes: 0..3
        ArrayList<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        edges.sort(Comparator.comparingInt(e -> e.w)); 

        int[] parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;

        int total = 0, picked = 0;
        for (Edge e : edges) {
            if (union(e.a, e.b, parent)) {
                System.out.println(e.a + " - " + e.b + " : " + e.w);
                total += e.w;
                picked++;
                if (picked == n - 1) break;
            }
        }
        System.out.println("Total = " + total);
    }
}
