package Lab4_Heaps;

import java.util.ArrayList;

public class MaxHeap {

    ArrayList<Integer> heap;

    MaxHeap() {
        heap = new ArrayList<Integer>();
    }

    private int parent (int i){
        return (i-1)/2;
    }

    private int leftChild(int i){
        return (i*2) + 1;
    }

    private int rightChild(int i){
        return (i*2) + 2;
    }

    private void swap(int a, int b){
        int temp = heap.get(a);
        heap.set(a, heap.get(b));
        heap.set(b, temp);
    }

    public void insert (int i){

        int current = heap.size();
        heap.add(i);

        while(current > 0 && heap.get(current) > heap.get(parent(current))){
            swap(current, parent(current));
            current = parent(current);
        }

    }

    public int remove(){

        if(heap.isEmpty()){
            System.out.println("Heap is empty. Nothing to remove.");
            return -1;
        }


        int root = heap.getFirst();

        heap.set(0, heap.getLast());
        heap.removeLast();
        heapifyDown(0);

        return root;
    }

    private void heapifyDown(int i){

        int largest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < heap.size() && heap.get(largest) < heap.get(left)){
            largest = left;
        }

        if (right < heap.size() && heap.get(largest) < heap.get(right)){
            largest = right;
        }

        if(largest != i){
            swap(i, largest);
            heapifyDown(largest);
        }


    }

    public void print(){
        System.out.println(heap);

    }


}
