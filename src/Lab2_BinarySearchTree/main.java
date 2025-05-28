package Lab2_BinarySearchTree;

public class main {

    public static void main(String[] args){

        BinarySearchTree tree = new BinarySearchTree();
        tree.display();

        tree.add(new Node(50));
        tree.add(new Node(30));
        tree.add(new Node(70));
        tree.add(new Node(20));
        tree.add(new Node(40));
        tree.add(new Node(60));
        tree.add(new Node(80));

        tree.display();

        tree.add(new Node(80));
        tree.add(new Node(20));
        tree.add(new Node(30));


    }
}
