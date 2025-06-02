package Lab4_Heaps;

import java.util.ArrayList;
public class Main {

    public static void main (String[] args){
        MinHeap minHeap = new MinHeap();

        minHeap.insert(15);
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(17);
        minHeap.insert(8);

        System.out.println("Min Heap:");
        minHeap.print();

        System.out.println("Removed Min: " + minHeap.remove());
        minHeap.print();

    }



}
