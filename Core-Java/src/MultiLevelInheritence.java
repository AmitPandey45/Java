package src;
class SimpleCalculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double substract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public int remainder(int num1, int num2) {
        return num1 % num2;
    }

    public double percentage(double num1, double percentage) {
        return num1 * percentage / 100;
    }
}

class AdvanceCalculator extends SimpleCalculator {
    public double square(double num) {
        return num * num;
    }

    public double cube(double num) {
        return num * num * num;
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

class ScientificCalculator extends AdvanceCalculator {
    public double sine(double radians) {
        return Math.sin(radians);
    }

    public double cosine(double radians) {
        return Math.cos(radians);
    }

    public double tangent(double radians) {
        return Math.tan(radians);
    }

    public double log(double num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Logarithm of a non-positive number is not defined");
        }
        return Math.log(num);
    }

    public double base10Log(double num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Logarithm of a non-positive number is not defined");
        }
        return Math.log10(num);
    }
}

public class MultiLevelInheritence {
    public static void main(String[] args) {
        var simpleCal = new SimpleCalculator();
        System.out.println("Add: " + simpleCal.add(10.44, 4.67));
        System.out.println("Substract: " + simpleCal.substract(10.44, 4.67));
        System.out.println("Multiply: " + simpleCal.multiply(10.44, 4.67));
        System.out.println("Divide: " + simpleCal.divide(10.44, 4.67));
        System.out.println("Remainder: " + simpleCal.remainder(10, 3));
        System.out.println("Percentage: " + simpleCal.percentage(500, 5));

        var advanceCal = new AdvanceCalculator();
        System.out.println("Square: " + advanceCal.square(5));
        System.out.println("Cube: " + advanceCal.cube(5));
        System.out.println("SquareRoot: " + advanceCal.squareRoot(25));
        System.out.println("Power: " + advanceCal.power(2, 4));

        var scientificCal = new ScientificCalculator();
        System.out.println("Sine 30: " + scientificCal.sine(30));
        System.out.println("Cosine 30: " + scientificCal.cosine(30));
        System.out.println("Tangent 30: " + scientificCal.tangent(30));
        System.out.println("Log base 2: " + scientificCal.log(16));
        System.out.println("Log base 10: " + scientificCal.log(100));
    }
}
