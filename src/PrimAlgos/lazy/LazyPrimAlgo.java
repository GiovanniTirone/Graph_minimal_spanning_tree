package PrimAlgos.lazy;

import vtx_edge.Edge;
import vtx_edge.Vtx_Prim_lazy;

import java.util.*;

public class LazyPrimAlgo {

    private Set<Vtx_Prim_lazy> unvisitedVtx;
    private List<Edge<Vtx_Prim_lazy>> minSpanTree;
    private PriorityQueue<Edge<Vtx_Prim_lazy>> heap;

    private double fullCost;

    public LazyPrimAlgo(List<Vtx_Prim_lazy> vtxList){
        this.unvisitedVtx = new HashSet<>(vtxList);
        this.minSpanTree = new ArrayList<>();
        this.heap = new PriorityQueue<>();
    }

    /*
    public void computeTree (Vtx_Prim startVtx) {
        Vtx_Prim currentVtx = startVtx;

        do {
            unvisitedVtx.remove(currentVtx);
            for (Edge<Vtx_Prim> edge : currentVtx.getAdjacencyList()) {
                if (unvisitedVtx.contains(edge.getTarget()))
                    heap.add(edge);
            }
            Edge<Vtx_Prim> minEdge = heap.remove();
            currentVtx = minEdge.getTarget();
            if(!unvisitedVtx.contains(minEdge.getTarget()))
                  continue;
            minSpanTree.add(minEdge);
            fullCost += minEdge.getWeight();

        } while (!unvisitedVtx.isEmpty());

    }
    */


    public void computeTree (Vtx_Prim_lazy startVtx) {
        Vtx_Prim_lazy currentVtx = startVtx;
        unvisitedVtx.remove(currentVtx);
        while(!unvisitedVtx.isEmpty()){
            for(Edge<Vtx_Prim_lazy> edge : currentVtx.getAdjacencyList()){
                if(unvisitedVtx.contains(edge.getTarget()))
                    heap.add(edge);
            }

            Edge<Vtx_Prim_lazy> minEdge = heap.remove();
            currentVtx = minEdge.getTarget();
            if(!unvisitedVtx.contains(minEdge.getTarget()))
                 continue;
            unvisitedVtx.remove(currentVtx);
            minSpanTree.add(minEdge);
            fullCost += minEdge.getWeight();
        }
    }




    public void printMinSpanTree () {
        System.out.println("TotalCost: " + fullCost);
        minSpanTree.forEach(System.out::println);
    }


}
