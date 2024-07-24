public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {32,12,30,3,2,6,10,39,54,104,643,123,1,5,0};

        System.out.println("Before sort: ");
        printArr(arr);

        selectionSort(arr);

        System.out.println("After sort: ");
        printArr(arr);
    }

    public static void selectionSort(int[] arr){
        int max;
        int swapVariable;   //temporary variable to aid in value swapping
        int maxIndex = 0;


        for(int i = 0; i < arr.length-1; i++){
            max = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(max < arr[j]){
                    max = arr[j];
                    maxIndex = j;
                }
            }

            //swap arr[i] with the new max value
            swapVariable = arr[i];
            arr[i] = max;
            arr[maxIndex] = swapVariable;
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
}
