public class BinarySearch {
    public static void main(String[] args) {
        int arr = new int[10];

        printArr(arr);
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
