public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of first n+1 numbers
        int expectedSum = (n + 1) * (n + 2) / 2;
        
        // Calculate the sum of elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // The missing number is the difference between the expected sum and actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length; // length of the array
        System.out.println("The missing number is: " + findMissingNumber(arr, n));
    }
}
