package al.vertex;

public class Graph {
    private Vertex[] vertex;
    private int curSize = 0;
    public int[][] adjMat;

    public Graph(int size) {
        vertex = new Vertex[size];
        adjMat = new int[size][size];
        for(int i = 0;i<size;i++) {
            for(int j = 0;j<size;j++) {
                if(i == j) {
                    adjMat[i][j] = 1;
                }
            }
        }
    }

    public void add(Vertex v) {
        vertex[curSize++] = v;
    }

    public void addEdge(String v1,String v2) {
        // 找出两个顶点的下标
        int index1 = 0;
        for(int i = 0; i < vertex.length;i++) {
            if(vertex[i].getValue().equals(v1)) {
                index1 = i;
            }
        }
        int index2 = 0;
        for(int i = 0; i < vertex.length;i++) {
            if(vertex[i].getValue().equals(v2)) {
                index2 = i;
            }
        }
        // 相连两个顶点互相标1
        adjMat[index1][index2] = 1;
        adjMat[index2][index1] = 1;
    }

}