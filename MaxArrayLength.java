public class MaxArrayLength {
    public static void main(String[] args) {
        int heapFreeSize1 = (int)Runtime.getRuntime().freeMemory();

        int[] largestArray = new int[heapFreeSize1];


        long heapMaxSize = Runtime.getRuntime().maxMemory();
        long heapFreeSize = Runtime.getRuntime().freeMemory();

        System.out.println("Max heap size " + heapMaxSize);
        System.out.println("Free heap size " + heapFreeSize);

        System.out.println("Successfully created an array with " + largestArray.length + " elements");
    }
}
