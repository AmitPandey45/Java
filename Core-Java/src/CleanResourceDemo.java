package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CleanResourceDemo {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = null;
        try {
            System.out.println("Please enter a number: ");
            br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            System.out.println("Your magic number is: " + ((int) (100 * Math.random()) *
                    num));
        } finally {
            br.close();
        }

        try (var br1 = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please enter a number: ");
            int num1 = Integer.parseInt(br1.readLine());
            System.out.println("Your magic number is: " + ((int) (10 * Math.random()) * num1));
        }
    }
}
