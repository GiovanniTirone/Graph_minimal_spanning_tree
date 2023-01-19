package PrimAlgos.lazy;

import vtx_edge.Vtx_Prim_lazy;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestLazyPrimAlgo {

    public static void main(String[] args) {

        List<Vtx_Prim_lazy> vtxList = createVtxList(new String[]{"a","b","c","d","e","f","g"});
        createEdges(vtxList,new int[][]{
                {0,1,1},
                {0,2,2},
                {0,3,12},
                {1,0,1},
                {1,3,4},
                {1,4,7},
                {1,6,8},
                {2,0,2},
                {2,3,6},
                {2,5,3},
                {3,0,12},
                {3,1,4},
                {3,2,6},
                {3,4,2},
                {3,5,5},
                {4,1,7},
                {4,3,2},
                {4,5,4},
                {4,6,9},
                {5,2,3},
                {5,3,5},
                {5,4,4},
                {5,6,2},
                {6,1,8},
                {6,4,9},
                {6,5,2}
        });

        System.out.println(vtxList);
        vtxList.forEach(vtx_primLazy -> System.out.println(vtx_primLazy.getAdjacencyList()));

        LazyPrimAlgo lpa = new LazyPrimAlgo(vtxList);
        lpa.computeTree(vtxList.get(0));
        lpa.printMinSpanTree();


    }

    public static List<Vtx_Prim_lazy> createVtxList (String [] names){
        return Arrays.stream(names).map(Vtx_Prim_lazy::new).collect(Collectors.toList());
    }

    public static void createEdges (List<Vtx_Prim_lazy> vtxList, int [][] start_end_weight) {
         Arrays.stream(start_end_weight)
                .forEach(sew -> vtxList.get(sew[0]).createEdge(sew[2],vtxList.get(sew[1])));
    }

}
