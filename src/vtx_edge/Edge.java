package vtx_edge;

public class Edge<V extends  Vertex> implements Comparable<Edge> {

    private double weight;
    private V start;
    private V target;

    public Edge (double weight, V start, V target){
        this.weight = weight;
        this.start = start;
        this.target = target;
    }

    public double getWeight() {
        return weight;
    }

    public V getStart() {
        return start;
    }

    public V getTarget() {
        return target;
    }

    @Override
    public int compareTo(Edge edge) {
        return Double.compare(this.weight,edge.weight);
    }

    @Override
    public String toString () {
        return this.start.getName() + this.target.getName();
    }

}
