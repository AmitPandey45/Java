package src;

public class WrapperClass {
    public static void main(String[] args) {
        int num1 = 10;
        // Integer num2 = new Integer(11);
        // Integer num3 = new Integer(num1);
        Integer num4 = num1; // auto-boxing

        System.out.println("num4: "+num4);

        int num5 = num4; // auto-unboxing
        System.out.println("num5: "+num5);

        String value = "12";
        int num6 = Integer.parseInt(value);
        System.out.println("num6 * 2: "+num6 * 2);
    }
}
