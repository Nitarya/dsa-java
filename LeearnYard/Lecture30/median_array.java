public class MedianFinder {
    public static double findMedian(int[] arr) {
        int n = arr.length;
        if (n % 2 == 1) {
            return arr[n/2]; // Odd length, return the middle element
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] sortedArray1 = {1, 3, 5, 7, 9}; //Odd length
        int[] sortedArray2 = {2, 4, 6, 8, 10, 12}; //Even length


        System.out.println("Median of sortedArray1: " + findMedian(sortedArray1));
        System.out.println("Median of sortedArray2: " + findMedian(sortedArray2));

    }
}