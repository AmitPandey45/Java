package src;
public class JaggedArray {
    public static void main(String[] args) {
        int numsOfNums[][] = new int[3][];

        for (int[] nums : numsOfNums) {
            int size = 1 + (int) (Math.random() * 5);
            nums = new int[size];
            for (int num : nums) {
                num = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < numsOfNums.length; i++) {
            int size = 1 + (int) (Math.random() * 5);
            numsOfNums[i] = new int[size];
            for (int j = 0; j < numsOfNums[i].length; j++) {
                numsOfNums[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int[] nums : numsOfNums) {
            for (int num : nums) {
                System.out.print(num + " ");
            }

            System.out.println();
        }

    }
}
