import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = createRandomizedArray(10);

        System.out.println("Before sort: ");
        printArr(arr);

        selectionSort(arr);

        System.out.println("After sort: ");
        printArr(arr);
    }

    /**
     * Sorts array from greatest to least using selection sort
     *
     * @param arr  array to be sorted
     */
    public static void selectionSort(int[] arr){
        int swapVariable;   //temporary variable to aid in value swapping
        int maxIndex = 0;


        for(int i = 0; i < arr.length-1; i++){
            maxIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }

            //only swap if new max value found
            if(maxIndex != i){
                swapVariable = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = swapVariable;
            }
        }
    }

    /**
     * Create randomized array with given size
     *
     * @param size the size of array wanted to be created.
     * @return int[] array with randomized values with given size.
     */
    public static int[] createRandomizedArray(int size){
        int[] arr = new int[size];
        Random randomizer = new Random();

        for(int i = 0; i < arr.length; i++){
            // Generate random integer in range 0 to 135
            int randomInt = randomizer.nextInt(136);

            arr[i]= randomInt;
        }
        return arr;
    }

    /**
     * Prints array in order.
     *
     * @param arr - array to be printed
     */
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); //add new line
    }
}
