package src;
public class RelationalOperators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 9;

        boolean result = num1 > num2;
        System.out.println("num1 > num2 = "+result);

        result = num1 < num2;
        System.out.println("num1 > num2 = "+result);

        result = num1 >= num2;
        System.out.println("num1 > num2 = "+result);

        result = num1 <= num2;
        System.out.println("num1 > num2 = "+result);

        int num3 = 7;

        result = num3 == num1;
        System.out.println("num3 == num1 = "+result);

        result = num1 < num2 && num3 == num1;
        System.out.println("num1 < num2 && num3 == num1 = "+result);
    }
}
