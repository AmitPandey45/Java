package src;

class CustomMathException extends Exception {
    public CustomMathException(String message) {
        super(message);
    }
}

public class ThrowExceptionDemo {
    public static void main(String[] args) {
        int num = 18;
        int denominator = 20;
        int result = 0;

        try {
            result = num / denominator;
            if (result == 0)
                throw new CustomMathException(
                        "If the denominator is greater than number, the default out put would be the number it self.");

        } catch (CustomMathException cmex) {
            result = num / 1;
            System.out.println("that's the default output " + cmex);
        } catch (Exception ex) {
            System.out.println("Something went wrong..." + ex);
        }

        System.out.println("Result: " + result);
    }
}
