package vtx_edge;

public class Vtx_Prim_eager extends Vtx_Prim<Vtx_Prim_eager> implements Comparable<Vtx_Prim_eager>{

    //shortest edge from tree vertex to non-tree vertex
    private Edge<Vtx_Prim_eager> minEdge ;
    private boolean visited;
    // to detect whether heap is in need of refresh because of better weighted edge
    private double distance;

    public Vtx_Prim_eager(String name) {
        super(name);
        this.visited = false;
        this.distance = Double.MAX_VALUE;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Edge<Vtx_Prim_eager> getMinEdge() {
        return minEdge;
    }

    public void setMinEdge(Edge<Vtx_Prim_eager> minEdge) {
        this.minEdge = minEdge;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public int compareTo(Vtx_Prim_eager v) {
        return Double.compare(this.distance,v.getDistance());
    }
}
