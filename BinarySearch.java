import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = createRandomizedArray(20);
        selectionSort(arr);

        printArr(arr);

        //System.out.println(binarySearch(arr, 6));
        System.out.println(recursionBinarySearch(arr, 0, arr.length - 1, 6));
    }

    /**
     * Binary search for a given array with search key
     *
     * @param arr - array to search through
     * @param key - the value being searched for
     * @return int index of value found
     */

    public static int binarySearch(int[] arr, int key){
        int lowIndex = 0;
        int highIndex = arr.length - 1;

        int midIndex;
        int currValue;

        while(lowIndex <= highIndex){
            midIndex = (lowIndex + highIndex) / 2;
            currValue = arr[midIndex];

            if(currValue == key){
                return midIndex;
            }
            else if (currValue > key){
                highIndex = midIndex - 1;
            }
            else {
                lowIndex = midIndex + 1;
            }
        }

        return -1; //if not found return negative index
    }

    public static int recursionBinarySearch(int[] arr, int lowIndex, int highIndex, int key){
        int midIndex = (lowIndex + highIndex) / 2;
        if(lowIndex >= highIndex){
            return -1;
        }

        if(arr[midIndex] == key){
            return midIndex;
        }
        else if(arr[midIndex] > key){
            return recursionBinarySearch(arr, lowIndex, highIndex - 1, key);
        }
        else {
            return recursionBinarySearch(arr, lowIndex + 1, highIndex, key);
        }
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

    /**
     * initializes array with in order values from 0 to given length. ex. 0,1,2,3,4,5,6,..., length
     *
     * @param length - the max length
     *
     * @return int[] array with values
     */
    public static int[] initializeArrayWithValues(int length){
        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = i;
        }

        return arr;
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
            // Generate random integer in range 0 to 50
            int randomInt = randomizer.nextInt(51);

            arr[i]= randomInt;
        }
        return arr;
    }

    /**
     * Sorts array from least to greatest using selection sort
     *
     * @param arr  array to be sorted
     */
    public static void selectionSort(int[] arr){
        int swapVariable;   //temporary variable to aid in value swapping
        int minIndex = 0;


        for(int i = 0; i < arr.length-1; i++){
            minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            //only swap if new max value found
            if(minIndex != i){
                swapVariable = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = swapVariable;
            }
        }
    }
}
