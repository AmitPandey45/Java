package src;
public class ConditionalStatements {
    public static void main(String[] args) {
        int x = 15;
        int y = 9;
        int z = 17;
        
        // if (x > y)
        // {
        //     System.out.println("x > y = "+ x);
        // }
        // else
        // {
        //     System.out.println("x < y = "+ y);
        // }

        if (x > y && x > z)
        {
            System.out.println("x > y && x > z = "+ x);
        }
        else if (y > z)
        {
            System.out.println("y > x && y > z = "+ y);
        }
        else
        {
            System.out.println("z >= x && z >= y = "+ z);
        }
    }
}
