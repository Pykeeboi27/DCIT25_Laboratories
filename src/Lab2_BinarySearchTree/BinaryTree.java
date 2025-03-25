package Lab2_BinarySearchTree;

class TreeNode{
    int value;
    TreeNode left, right;

    TreeNode(int value){
        this.value = value;
        this.right = null;
        this.left = null;
    }
}

public class BinaryTree {

    TreeNode root;

    public void add(int value){
        root = addRecursive(root, value);
    }

    private TreeNode addRecursive(TreeNode current, int value){
        if (current == null){
            System.out.println(value + " added!");
            return new TreeNode(value);
        }

        if (current.value == value){
            System.out.println(value + " is already on the list.");
            return current;
        }
        if (value > current.value){
            current.left = addRecursive(current.left, value);
        }
        else{
            current.right = addRecursive(current.right, value);
        }
        return current;
    }



}

