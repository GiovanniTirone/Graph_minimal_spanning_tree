package vtx_edge;

public class Vertex {

    private String name;

    public Vertex (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString () {
        return getName();
    }

}
