package Lab2_BinarySearchTree;

public class main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();


        System.out.println("=== Inserting Elements ===");
        bst.add(new Node(50));
        bst.add(new Node(30));
        bst.add(new Node(70));
        bst.add(new Node(20));
        bst.add(new Node(40));
        bst.add(new Node(60));
        bst.add(new Node(80));
        bst.add(new Node(30)); // duplicate test

        System.out.println("\n=== Displaying Tree (In-Order) ===");
        bst.display(); // should print: 20 30 40 50 60 70 80

        System.out.println("\n=== Search Tests ===");
        System.out.println("Search 50: " + bst.search(50)); // true
        System.out.println("Search 25: " + bst.search(25)); // false
        System.out.println("Search 80: " + bst.search(80)); // true
        System.out.println("Search 0: " + bst.search(0));   // false

        System.out.println("\n=== Deletion Tests ===");
        System.out.println("Deleting leaf node 20:");
        bst.remove(20); // leaf
        bst.display();  // should no longer include 20

        System.out.println("Deleting node with one child 30:");
        bst.remove(30); // has one child now
        bst.display();

        System.out.println("Deleting node with two children (root node 50):");
        bst.remove(50);
        bst.display();

        System.out.println("Deleting non-existent node 999:");
        bst.remove(999); // should print "could not be found."

        System.out.println("Deleting all remaining nodes:");
        bst.remove(40);
        bst.remove(60);
        bst.remove(70);
        bst.remove(80);
        bst.display(); // Should show "Tree is empty."
    }
}
