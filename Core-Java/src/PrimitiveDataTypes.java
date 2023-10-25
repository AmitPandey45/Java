package src;
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // DataTypes for Numeric types in Java => to stored the value
        byte b = 127;
        short s = 1213;
        int i = 4534535;
        long l = 343531212l;
        
        System.out.println("byte b = "+ b);
        System.out.println("short s = "+ s);
        System.out.println("int i = "+ i);
        System.out.println("long l = "+ l);

        // DataTypes for floating types in java => to stored floating types number in java
        float f = 5.789f;
        double d = 5.657533;

        System.out.println("float f = "+ f);
        System.out.println("double d = "+ d);

        // DataTypes for char types in java => to stored character types value in java
        char c = 'K';

        System.out.println("char c = "+ c);

        // Boolean for char types in java => to stored boolean types value in java
        boolean bln = true;

        System.out.println("boolean bln = "+ bln);
        
        // -> => === == >= <= !== looks good 

        // Playing with literals
        int bformat = 0b101;
        int hformat = 0x8E;
        int _format = 1000_00_000_0;

        System.out.println("binary format bformat = "+ bformat);
        System.out.println("hexa format hformat = "+ hformat);
        System.out.println("format _format = "+ _format);

        char ca = 'a';
        ca++;

        System.out.println("char ca = "+ ca);
    }
}
