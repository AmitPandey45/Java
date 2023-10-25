package src;
public class LogicalOperators {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x > y && a > b;
        System.out.println("x > y && a > b = "+result);

        result = x > y && a < b;
        System.out.println("x > y && a < b = "+result);

        result = x > y || a > b;
        System.out.println("x > y || a > b = "+result);

        result = a > 9;
        System.out.println("a > 9 = "+!result);
    }
}