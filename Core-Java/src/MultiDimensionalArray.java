package src;
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int numsOfNums[][] = new int[3][4];

        for (int i = 0; i < numsOfNums.length; i++) {
            for (int j = 0; j < numsOfNums[i].length; j++) {
                numsOfNums[i][j] = (int) (10 * Math.random());
                System.out.println(numsOfNums[i][j]);
            }
        }

        for (int i = 0; i < numsOfNums.length; i++) {
            for (int j = 0; j < numsOfNums[i].length; j++) {
                System.out.print(numsOfNums[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();

        for (int[] nums : numsOfNums) {
            for (int n : nums) {
                System.out.print(n + " ");
            }

            System.out.println();
        }
    }
}
