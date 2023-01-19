package vtx_edge;

public class Vtx_Krus extends Vertex {


    private Vtx_Krus parent;
    private int height;

    public Vtx_Krus(String name){
        super(name);
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Vtx_Krus getParent() {
        return parent;
    }

    public void setParent(Vtx_Krus parent) {
        this.parent = parent;
    }

    public Vtx_Krus find () {
        Vtx_Krus actualVtx = this;
        while(actualVtx.getParent() != null)
            actualVtx = actualVtx.getParent();
        // path compression:
        Vtx_Krus root = actualVtx;
        actualVtx = this;
        while(actualVtx!=root){
            Vtx_Krus temp = actualVtx.getParent();
            actualVtx.setParent(root);
            actualVtx = temp;
        }
        return root;
    }

    public void union (Vtx_Krus vertex) {
        Vtx_Krus root1 = this.find();
        Vtx_Krus root2 = vertex.find();
        if(root1 == root2) return;
        if(root1.getHeight() < root2.getHeight()){
            root1.setParent(root2);
        }
        else if(root1.getHeight() > root2.getHeight()){
            root2.setParent(root1);
        }
        else{
            root2.setParent(root1);
            root1.setHeight(root1.getHeight()+1);
        }
    }

}
