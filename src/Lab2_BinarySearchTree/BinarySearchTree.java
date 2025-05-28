package Lab2_BinarySearchTree;

public class BinarySearchTree {

    Node root;

    public void add(Node newNode){
        root = addHelper(root, newNode);
    }

    public Node addHelper(Node root, Node newNode){
        int data = newNode.data;

        if (root == null){
            root = newNode;
            return root;
        }

        else if (data < root.data){
            root.left = addHelper(root.left, newNode);
        }
        else {
            root.right = addHelper(root.right, newNode);
        }

        return root;
    }

    public void display(){
        displayHelper(root);
        System.out.println();
    }

    public void displayHelper(Node root){
        if (root != null) {
            displayHelper(root.left);
            System.out.print(root.data + " ");
            displayHelper(root.right);
        }
    }
}

