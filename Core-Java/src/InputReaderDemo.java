package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class InputReaderDemo {
    public static void main(String[] args) throws IOException {
        // System.out.println("Please enter first & second number: ");
        // int num1 = System.in.read();
        // int num2 = System.in.read();

        // int result = Multiply(num1 - 48, num2 - 48);
        // System.out.println("Multiplication: " + result);

        // var sr = new InputStreamReader(System.in);
        // var br = new BufferedReader(sr);
        // System.out.println("Please enter first number: ");
        // int num1 = Integer.parseInt(br.readLine());
        // System.out.println("Please enter second number: ");
        // int num2 = Integer.parseInt(br.readLine());

        var sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Please enter second number: ");
        short num2 = sc.nextShort();
        sc.close();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double result = Multiply(num1, num2);
        String formattedResult = decimalFormat.format(result);
        System.out.println("Multiplication: " + formattedResult);
        BigDecimal bd = new BigDecimal(result);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double roundedNumber = bd.doubleValue();
        System.out.println("Multiplication: " + roundedNumber);

        // double result = Multiply(num1, num2);
        // System.out.println("Multiplication: " + result);
    }

    public static double Multiply(double num1, short num2) {
        return num1 * num2;
    }

    public static int Multiply(int num1, int num2) {
        return num1 * num2;
    }
}
