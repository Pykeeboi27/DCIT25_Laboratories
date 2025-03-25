
import java.util.ArrayList;
public class Lab3_SelectionSort {

    public static void selectionSort(int[] array){

        for (int i = 0; i < array.length - 1; i++){
            int min = i;

            for (int j = i+1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }

            if (min != 1){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
    public static void main(String[] args){

        int[] numbers = {42, 17, 89, 5, 23, 76, 31, 8, 55, 91};
        System.out.print("Unsorted list: ");
        for (int i:numbers){
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(numbers);

        System.out.print("Sorted list: ");
        for (int i:numbers){
            System.out.print(i + " ");
        }
    }
}
