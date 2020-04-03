package al.vertex;

public class Graph {
    private Vertex[] vertex;
    private int curSize = 0;
    public Graph(int size) {
        vertex = new Vertex[size];
    }

    public void add(Vertex v) {
        vertex[curSize++] = v;
    }

}