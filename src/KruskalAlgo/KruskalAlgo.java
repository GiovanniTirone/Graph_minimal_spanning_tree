package KruskalAlgo;

import vtx_edge.Edge;
import vtx_edge.Vtx_Krus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgo {

    private List<Edge<Vtx_Krus>> edgesList;
    private  List<Edge<Vtx_Krus>> minSpanTree ;

    public KruskalAlgo (List<Edge<Vtx_Krus>> edgesList) {
        Collections.sort(edgesList);
        this.edgesList = edgesList;
        this.minSpanTree = new ArrayList<>();
    }

    public void computeTree (){
        for(Edge<Vtx_Krus> edge : edgesList){
            Vtx_Krus u = edge.getStart();
            Vtx_Krus v = edge.getTarget();

            if(u.find() != v.find()) {
                minSpanTree.add(edge);
                u.union(v);
            }
        }
    }

    public void printMinSpanTree () {
        for(Edge<Vtx_Krus> e : minSpanTree)
            System.out.println(e);
    }

}
