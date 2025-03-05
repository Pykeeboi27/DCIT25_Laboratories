package Lab1_LinkedList;

public class main {
    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        linkedList.printList();

        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.printList();

        linkedList.delete(3);
        linkedList.printList();
        linkedList.add(3);

        linkedList.delete(2);
        linkedList.printList();
        linkedList.delete(5);
    }
}

