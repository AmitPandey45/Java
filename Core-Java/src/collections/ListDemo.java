package src.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>(List.of(2, 5, 6, 10, 7));

        System.out.println(nums);
        nums.retainAll(new ArrayList<Integer>(List.of(10, 7)));

        System.out.println(nums);
    }
}
