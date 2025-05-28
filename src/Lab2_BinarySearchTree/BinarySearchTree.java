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
        else if (data == root.data){
            System.out.println(root.data + " is already in the list. Try again.");
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

    public void remove(int data){
        if (search(data)){
            removeHelper(root, data);
        }
        else{
            System.out.println(data + " could not be found.");
        }
    }

    private Node removeHelper(Node root, int data){

        if (root == null){
            return root;
        }
        else if (root.data > data){
            root.left = removeHelper(root.left, data);
        }
        else if (root.data < data){
            root.right = removeHelper(root.right, data);
        }
        else{ //node found
            if (root.left == null && root.right == null){
                root = null;
            }
            else if (root.right != null){
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else{
                root.data = predeccessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(Node root){
        root = root.right;

        while(root.left != null){
            root = root.left;
        }

        return root.data;
    }
    private int predeccessor(Node root){
        root = root.left;

        while(root.right != null){
            root = root.right;
        }

        return root.data;
    }

}

