package src;
public class TypeConversion {
 public static void main(String[] args) {
    // Type conversion in java
    byte b1 = 127;
    int i1 = b1;

    System.out.println("i1 = "+ i1);

    int i2 = 257;
    byte b2 = (byte) i2;

    System.out.println("b2 = "+ b2);

    int i3 = 124;
    float f1 = i3;

    System.out.println("f1 = "+f1);

    float f2 = 5.66f;
    int i4 = (int) f2;

    System.out.println("i4 = "+i4);

    int i5 = 75675;
    double d1 = i5;

    System.out.println("d1 = "+d1);

    double d2 = 54456.66576;
    int i6 = (int) d2;

    System.out.println("i6 = "+i6);

    // Type promotion
    byte b3 = 10;
    byte b4 = 40;
    int i7 = b3 * b4;

    System.out.println("i7 = "+i7);
 }   
}
