package src;
public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Day "+i);

            for (int j = 1; j <= 9; j++) {
                System.out.println("    "+ getHourTime(j));
            }
        }
    }

    private static String getHourTime(int value) {
        int hourTime = 8 + value;

        return hourTime > 12 ? (hourTime - 12)+ " PM" : hourTime + " AM";
    }
}
