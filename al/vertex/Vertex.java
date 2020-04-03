package al.vertex;


// 顶点类
public class Vertex {
    private String value;

    public void setValue(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public Vertex(String value) {
        super();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}