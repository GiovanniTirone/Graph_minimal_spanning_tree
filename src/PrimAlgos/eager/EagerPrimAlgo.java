package PrimAlgos.eager;



import vtx_edge.Edge;
import vtx_edge.Vertex;
import vtx_edge.Vtx_Prim_eager;

import java.util.List;
import java.util.PriorityQueue;

public class EagerPrimAlgo {

    private List<Vtx_Prim_eager> verticesList;
    private PriorityQueue<Vtx_Prim_eager> heap; //frontiera = vertici adiacenti al minSpanTree

    public EagerPrimAlgo(List<Vtx_Prim_eager> verticesList){
        this.verticesList = verticesList;
        this.heap = new PriorityQueue<>();
    }

    public void computeTree (Vtx_Prim_eager start){
        start.setDistance(0);
        heap.add(start);
        while(!heap.isEmpty()){
            scanVertex(heap.remove());
        }
    }

    private void scanVertex (Vtx_Prim_eager u){
        u.setVisited(true);
        for(Edge<Vtx_Prim_eager> edge : u.getAdjacencyList()){
            Vtx_Prim_eager v = edge.getTarget();
            if(v.isVisited()) continue;
            if(edge.getWeight() < v.getDistance()){
                v.setDistance(edge.getWeight());
                v.setMinEdge(edge);
                this.heap.remove(v); // if v is present in the heap
                this.heap.add(v);
                }
            }
        }

    public void printMinSpanTree ( ) {
        double totalCost = 0;
        for(Vtx_Prim_eager vtx : verticesList){
            if(vtx.getMinEdge() != null){
                Edge edge = vtx.getMinEdge();
                System.out.println(edge);
                totalCost += edge.getWeight();
            }
        }
        System.out.println("Total cost: " + totalCost);
    }



}


