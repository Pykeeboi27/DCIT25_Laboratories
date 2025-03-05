package Lab1_LinkedList;

class ListNode{
    int value;
    ListNode next;

    ListNode(int value){
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {

    private ListNode head;

    public void add(int value){

        ListNode newNode = new ListNode(value);

        if (head == null){
            head = newNode;
            return;
        }

        else{
            ListNode currentNode = head;

            while (currentNode.next != null){
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void printList(){
        ListNode currentNode = head;

        while (currentNode != null){
            System.out.print(currentNode.value + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("null");
    }

    public void delete(int value){

        if (head == null){
            System.out.println("No value to delete. List is empty");
            return;
        }
        else if (head.value == value){
            head = head.next;
        }

        else{
            ListNode currentNode = head;

            while (currentNode.next.value != value){

                if (currentNode.next.next == null){
                    System.out.println("The value " + value + ", is not on the list.");
                    return;
                }
                else{
                    currentNode = currentNode.next;
                }
            }
            currentNode.next = currentNode.next.next;

        }
    }
}
