package src;
public class Operators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        int sum = num1 + num2;

        System.out.println("Sum = "+sum);

        int substraction = num1 * num2;

        System.out.println("Substraction = "+substraction);

        int multiplication = num1 * num2;

        System.out.println("Multiplication = "+multiplication);

        int division = num1 / num2;

        System.out.println("Division = "+division);

        int remainder = num1 % num2;

        System.out.println("Remainder = "+remainder);

        // Add
        int num = 10;
        num = num + 10;
        num += 10;
        num = num + 1;
        num += 1;
        num++;
        ++num;

        System.out.println("Add operations on Num = "+num);

        num = 10;
        int result = num++;
        System.out.println("Result num++ = "+result);
        result = ++num;
        System.out.println("Result num++ = "+result);

        // Substract
        num = 34;
        num = num - 10;
        num -= 10;
        num = num - 1;
        num -= 1;
        num--;
        --num;
        System.out.println("Substract operations on Num = "+num);
    }
}
