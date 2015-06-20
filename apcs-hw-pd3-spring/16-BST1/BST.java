public class BST {

    private Node root;

    public BST() {
        root = null;
    }
// HW 16 Starts here
    public void insert(Node first, Node n){
        if (n.getData() < first.getData()) {
            if (first.getLeft()!=null)
                insert(first.getLeft(),n);
            else
                first.setLeft(n);
        } 
        else{
            if (first.getRight()!=null)
                insert(first.getRight(),n);
            else
                first.setRight(n);
        }
    }


    public void insert(int x){
        Node n = new Node(x);
        Node tmp = this.root;

        while (tmp != null && tmp.getData() != x) {
            if (x > tmp.getData() && tmp.getRight()==null){
                tmp.setRight(n);
                return;
            }
            else if (x <= tmp.getData() && tmp.getLeft()==null){
                tmp.setLeft(n);
                return;
            }
            else if (x>tmp.getData())
                tmp = tmp.getRight();
            else
                tmp = tmp.getLeft();
        }
    }

    public Node search(int x){
        Node tmp = this.root;
        while (tmp != null && tmp.getData() != x) {
            if (x > tmp.getData())
                tmp = tmp.getRight();
            else
                tmp = tmp.getLeft();
        }
        return tmp;
    }

    public Node search2(Node n, int x){
        Node tmp = n.root;
        if (x > tmp.getData())
            return search2(tmp.getRight(), x);
        else if(x < tmp.getData())
            return search2(tmp.getLeft(), x);
        return tmp;
    }
//HW 17 Starts here
    public Node searchparent(Node n){
        Node tmp = this.root;
        int x = n.getData();
        while(tmp != null){
            if(tmp.getRight().getData() == x || tmp.getLeft().getData() == x)
                return tmp;
            else if (x > tmp.getData())
                tmp = tmp.getRight();
            else
                tmp = tmp.getLeft();
        }
        return null;
    }

    public boolean delete(int x){
        Node tmp = search(x);
        Node parent = searchparent(tmp);

        if (tmp == null)
            return;

        else if (tmp.getLeft() == null && tmp.getRight() == null){
            tmp = null;
            return;
        }

        else if (tmp.getLeft() == null){
            parent.setRight(tmp.getRight());
            return;
        }
        
        else {
            parent.setLeft(tmp.getLeft());
            return;
        }
    }
}