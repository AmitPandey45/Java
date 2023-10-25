package src;
public class ArrayDemo {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};    
        int arr1[] = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr.toString());
    }
}
