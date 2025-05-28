package Lab2_BinarySearchTree;

public class BinarySearchTree {

    Node root;

    public void add(Node newNode){
        root = addHelper(root, newNode);
    }

    private Node addHelper(Node root, Node newNode){
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

        if (root == null){
            System.out.println("Tree is empty.");
        }
        else {
            displayHelper(root);
            System.out.println();
        }
    }

    private void displayHelper(Node root){
        if (root != null) {
            displayHelper(root.left);
            System.out.print(root.data + " ");
            displayHelper(root.right);
        }
    }

    public boolean search(int data){
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data){

        if (root == null){
            return false;
        }
        else if (root.data == data){
            return true;
        }
        else if (root.data > data){
            return searchHelper(root.left, data);
        }
        else{
            return searchHelper(root.right, data);
        }

    }
}

