package sorting;


/* Selection sort : Time => O(n^2) ; space => O(1)
*
* */
public class selectionSort {
    public static void selectionSort(int[] arr) {

        for (int j = 0; j <= arr.length - 2; j++) { // will move from 0 to (N-1) => second last element
            int minIndex = j;
            int minElement = arr[j];
            for (int i = j+1; i < arr.length; i++) { // will move from j+ 1 to (N-1)
                if (minElement > arr[i]) {
                    minElement = arr[i]; // find the smallest value and its index
                    minIndex = i;
                }

            }
        //    do the swap with the jth element and the minimum index element
            arr[minIndex] = arr[j]; // swap the small element with the current element in j
            arr[j] = minElement; // swap the current element with the small element
        }
        System.out.print("\nAfter sorting : ");
        for (int temp : arr) {
            System.out.print(temp + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};
        System.out.print("Before sorting : ");
        for (int temp : arr) {
            System.out.print(temp + " ");
        }
        selectionSort(arr);

    }
}
