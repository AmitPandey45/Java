package src.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(62);
        nums.add(65);
        nums.add(36);
        nums.add(10);
        nums.add(6);
        nums.add(12);
        nums.add(62);

        for (Integer num : nums) {
            System.out.println(num);
        }

        Set<Integer> nums1 = new TreeSet<Integer>();
        nums1.add(65);
        nums1.add(62);
        nums1.add(36);
        nums1.add(10);
        nums1.add(6);
        nums1.add(12);
        nums1.add(62);

        System.out.println(nums1);

        Iterator<Integer> iterator = nums1.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
