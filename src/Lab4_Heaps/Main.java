package Lab4_Heaps;

import java.util.ArrayList;
public class Main {

    public static void main (String[] args){
        MinHeap minHeap = new MinHeap();

        int[] testValues = {45, 20, 14, 12, 31, 7, 11, 13, 7};

        System.out.println("Inserting values:");
        for (int val : testValues) {
            minHeap.insert(val);
            minHeap.print();
        }

        System.out.println("\nRemoving elements:");
        while (minHeap.heap.size() > 0) {
            System.out.println("Removed: " + minHeap.remove());
            minHeap.print();
        }

        System.out.println();

        MaxHeap maxHeap = new MaxHeap();

        int[] testValues2 = {45, 20, 14, 12, 31, 7, 11, 13, 7};

        System.out.println("Inserting values:");
        for (int val : testValues2) {
            maxHeap.insert(val);
            maxHeap.print();
        }

        System.out.println("\nRemoving elements:");
        while (maxHeap.heap.size() > 0) {
            System.out.println("Removed: " + maxHeap.remove());
            maxHeap.print();
        }
    }



}
