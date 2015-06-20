public class Node {
    //Classcode Node
    private int data;
    private Node left,right;

    public Node(int n) { 
        data = n;
    }

    public void setLeft(Node n) { 
        left = n;
    }

    public void setRight(Node n) { 
        right = n;
    }
    
    public Node getLeft() { 
        return left;
    }

    public Node getRight() { 
        return right;
    }

    public int getData() {
        return data;
    }

    public void setData(int n){
        data = n;
    }

    public String toString() {
	   return ""+this.getData();
    }
}