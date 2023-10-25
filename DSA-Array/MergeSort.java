import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        nums = merge(left, right);

        return nums;
    }

    public int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int idx1 = 0;
        int idx2 = 0;
        int idx3 = 0;

        while (idx1 < first.length && idx2 < second.length) {
            if (first[idx1] < second[idx2]) {
                mix[idx3++] = first[idx1++];
            } else {
                mix[idx3++] = second[idx2++];
            }
        }

        while (idx1 < first.length) {
            mix[idx3++] = first[idx1++];
        }

        while (idx2 < second.length) {
            mix[idx3++] = second[idx2++];
        }

        return mix;
    }
}