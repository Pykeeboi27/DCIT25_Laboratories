package Lab2_BinarySearchTree;

public class main {

    public static void main(String[] args){

        BinarySearchTree tree = new BinarySearchTree();
        tree.add(new Node(5));
        tree.add(new Node(1));
        tree.add(new Node(9));
        tree.add(new Node(2));
        tree.add(new Node(7));
        tree.add(new Node(3));
        tree.add(new Node(6));
        tree.add(new Node(4));
        tree.add(new Node(8));

        tree.display();
    }
}
