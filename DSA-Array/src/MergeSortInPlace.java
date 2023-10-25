public class MergeSortInPlace {

    public void mergeSortInPlace(int[] nums, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int m = s + (e - s) / 2;

        mergeSortInPlace(nums, s, m);
        mergeSortInPlace(nums, m, e);

        mergeInPlace(nums, s, m, e);
    }

    public void mergeInPlace(int[] nums, int s, int m, int e) {
        int[] mix = new int[e - s];
        int idx1 = e;
        int idx2 = m;
        int idx3 = 0;

        while (idx1 < m && idx2 < e) {
            if (nums[idx1] < nums[idx2]) {
                mix[idx3++] = nums[idx1++];
            } else {
                mix[idx3++] = nums[idx2++];
            }
        }

        while (idx1 < m) {
            mix[idx3++] = nums[idx1++];
        }

        while (idx2 < e) {
            mix[idx3++] = nums[idx2++];
        }

        for (int i = s; i < e; i++) {
            nums[i] = mix[i];
        }
    }
}
