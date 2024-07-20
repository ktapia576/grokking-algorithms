public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr2 = initializeArrayWithValues(100);

        printArr(arr);
        printArr(arr2);

        System.out.println(binarySearch(arr2, 6));
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
}
