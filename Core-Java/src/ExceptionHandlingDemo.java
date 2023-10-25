package src;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 15;
        String value = null;
        var arr = new int[] { 1, 2, 3, 4, 5 };

        int result = 0;
        int arrValue = 0;
        String name = null;
        try {
            result = num2 / num1;
            arrValue = arr[1];
            // arrValue = arr[5];
            name = value.toString();
        } catch (ArithmeticException aex) {
            System.out.println("Can not divide by zero");
        } catch (ArrayIndexOutOfBoundsException arrex) {
            System.out.println("Array index is out of bound");
        } catch (Exception ex) {
            System.out.println("Something went wrong: " + ex);
        }

        System.out.println("Result: " + result);
        System.out.println("Name: " + name);
        System.out.println("Array value: " + arrValue);
    }
}
