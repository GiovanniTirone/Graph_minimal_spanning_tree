package KruskalAlgo;

import vtx_edge.Edge;
import vtx_edge.Vtx_Krus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestKruskalAlgo {

    public static void main(String[] args) {

        Vtx_Krus a = new Vtx_Krus("a");
        Vtx_Krus b = new Vtx_Krus("b");
        Vtx_Krus c = new Vtx_Krus("c");
        Vtx_Krus d = new Vtx_Krus("d");
        Vtx_Krus e = new Vtx_Krus("e");
        Vtx_Krus f = new Vtx_Krus("f");
        Vtx_Krus g = new Vtx_Krus("g");
        Vtx_Krus h = new Vtx_Krus("h");


        Edge<Vtx_Krus> ab = new Edge(3,a,b);
        Edge<Vtx_Krus> ac = new Edge(2,a,c);
        Edge<Vtx_Krus> ad = new Edge(5,a,d);
        Edge<Vtx_Krus> bf = new Edge(13,b,f);
        Edge<Vtx_Krus> bd = new Edge(2,b,d);
        Edge<Vtx_Krus> ce = new Edge(5,c,e);
        Edge<Vtx_Krus> cd = new Edge(2,c,d);
        Edge<Vtx_Krus> de = new Edge(4,d,e);
        Edge<Vtx_Krus> df = new Edge(6,d,f);
        Edge<Vtx_Krus> dg = new Edge(3,d,g);
        Edge<Vtx_Krus> eg = new Edge(6,e,g);
        Edge<Vtx_Krus> fg = new Edge(2,f,g);
        Edge<Vtx_Krus> fh = new Edge(3,f,h);
        Edge<Vtx_Krus> gh = new Edge(6,g,h);

        List<Edge<Vtx_Krus>> edgeList = new ArrayList<>(
                Arrays.asList(ab,ac,ad,bf,bd,ce,cd,de,df,dg,eg,fg,fh,gh));

        KruskalAlgo ka = new KruskalAlgo(edgeList);
        ka.computeTree();
        ka.printMinSpanTree();
    }

}
