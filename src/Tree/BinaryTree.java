package Tree;

public class BinaryTree {
    static class  Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTrees{
        static int idx = -1;
        public static Node builtTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1) return null;
            Node newNode = new Node(nodes[idx]);
            newNode.left = builtTree(nodes);
            newNode.right = builtTree(nodes);
            return newNode;
        }
    }


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.builtTree(nodes);
        System.out.println(root.data);
    }
}
