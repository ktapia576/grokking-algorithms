public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr2 = initializeArrayWithValues(100);

        printArr(arr);
        printArr(arr2);
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
     * initializes array with sorted values from 0 to given length. ex. 0,1,2,3,4,5,6,..., length
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
