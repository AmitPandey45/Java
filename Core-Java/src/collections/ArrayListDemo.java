package src.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListDemo {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(10);
        nums.add(18);
        nums.add(2);
        nums.add(7);
        nums.add(14);

        System.out.println(nums);
        for (int num : nums) {
            System.out.println(num);
        }

        // Define a predicate to specify the condition for removal
        Predicate<Integer> condition = num -> num % 2 == 0; // Remove even numbers
        // Use removeIf to remove elements that meet the condition
        nums.removeIf(condition);

        nums.add(50);
        boolean isRemoved = nums.removeIf(num -> num % 2 == 0);

        System.out.println("isRemoved: " + isRemoved);
        System.out.println("After removeIf");
        System.out.println(nums);

        var newNums = new ArrayList<Integer>();
        newNums.add(35);
        newNums.add(67);

        nums.addAll(newNums);
        System.out.println(nums);

        boolean isExist = nums.containsAll(newNums);
        System.out.println("Is Exists: " + isExist);

        nums.forEach(num -> {
            System.out.println("Processing the data");
            System.out.println("Double num: " + num * 2);
        });

        nums.addAll(new ArrayList<Integer>() {
            {
                add(37);
                add(38);
            }
        });

        System.out.println(nums);

        Collection<Integer> nums2 = new ArrayList<>(List.of(5, 10, 18, 2));
        System.out.println(nums2);
    }
}
