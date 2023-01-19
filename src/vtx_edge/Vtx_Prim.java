package vtx_edge;

import java.util.ArrayList;
import java.util.List;

public class Vtx_Prim<V extends Vtx_Prim> extends  Vertex{

    private List<Edge<V>> adjacencyList;

    public Vtx_Prim(String name){
        super(name);
        this.adjacencyList = new ArrayList<>();
    }

    public void createEdge (double weight, V target){
        this.adjacencyList.add(new Edge<>(weight,(V)this,target));
    }

    public void addEdge (Edge<V> edge){
        this.adjacencyList.add(edge);
    }

    public List<Edge<V>> getAdjacencyList() {
        return adjacencyList;
    }
}
