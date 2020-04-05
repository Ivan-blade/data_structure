package al.vertex;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("a");
        Vertex v2 = new Vertex("b");
        Vertex v3 = new Vertex("c");
        Vertex v4 = new Vertex("d");
        Vertex v5 = new Vertex("e");
        Graph g = new Graph(5);
        g.add(v1);
        g.add(v2);
        g.add(v3);
        g.add(v4);
        g.add(v5);
        g.addEdge("a", "b");
        g.addEdge("a", "c");
        g.addEdge("c", "b");
        g.addEdge("d", "b");
        g.addEdge("e", "b");

        for(int[] a:g.adjMat) {
            System.out.println(Arrays.toString(a));
        }
    }
}