package Lab4_Heaps;

import java.util.ArrayList;

public class MinHeap {

    ArrayList<Integer> heap;

    MinHeap() {
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

        while(current > 0 && heap.get(current) < heap.get(parent(current))){
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

        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < heap.size() && heap.get(smallest) > heap.get(left)){
            smallest = left;
        }

        if (right < heap.size() && heap.get(smallest) > heap.get(right)){
            smallest = right;
        }

        if(smallest != i){
            swap(i, smallest);
            heapifyDown(smallest);
        }


    }

    public void print(){
        System.out.print("[");
        for(int i = 0; i < heap.size(); i++){
            if (i == heap.size() - 1){
                System.out.print(heap.get(i));
            }
            else {
                System.out.print(heap.get(i) + ", ");
            }
        }
        System.out.print("]");
        System.out.println();

    }


}
