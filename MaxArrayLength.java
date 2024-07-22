/*
        MUST RUN WITH "java -Xmx4096m MaxArrayLength.java" on terminal to have 4gb of java heap size.
 */

public class MaxArrayLength {
    public static void main(String[] args) {
        long heapMaxSize = Runtime.getRuntime().maxMemory();

        /*
        Largest Array Length java can handle with 4gb heap space should be 1,073,741,824 elements since for int[] each
        element takes 4 bytes.

        However, the most elements I was able to allocate was 1,072,168,950. Yes... I took time trying to squeeze the
        most I can lol.

        (Could possibly squeeze more... but haven't tried adding more little by little. Don't know why it won't let the
        theoretical amount of elements work. Especially since freeMemory() shows that there is still bytes left to be
        used. Could be since other variables are using memory and then the JVM might be garbage collecting when
        the freeMemory() runs again.)

        4gb -> 4,294,967,296 (shown when running code calling maxMemory()... )
        4,294,967,296 bytes/4 bytes per element = 1,073,741,824 elements (java uses 4bytes per element for int[])
         */
        int[] largestArray = new int[1072168950];
        largestArray[1072168949] = Integer.MAX_VALUE;

        // Used this method to see how much free memory was left after creating array.
        long heapFreeSize = Runtime.getRuntime().freeMemory();

        System.out.println("Max heap size " + heapMaxSize);
        System.out.println("Free heap size " + heapFreeSize);

        System.out.println("Successfully created an array with " + largestArray.length + " elements");
        System.out.println("Index 1072168949 value: " + largestArray[1072168949]);
    }
}
