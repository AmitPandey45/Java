import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        int answer = new RomanToInt().approach2("MCMXCIV");
        System.out.println("Corresponding value for Roman to Int = " + answer);

        // int[] nums = { 5, 4, 3, 2, 1 };
        // int[] nums = { 5, 4, 3 };
        // nums = new MergeSort().mergeSort(nums);
        // System.out.println("Get sorted array by merge sort" + Arrays.toString(nums));

        int[] nums = { 5, 4, 3, 2, 1 };
        // int[] nums = { 5, 4, 3 };
        new MergeSortInPlace().mergeSortInPlace(nums, 0, nums.length);
        System.out.println("Get sorted array by merge sort" + Arrays.toString(nums));
    }
}