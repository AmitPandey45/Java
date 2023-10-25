package src;
public class NewerSwitchStatements {
    public static void main(String[] args) {
        String day = "Monday";
        // switch (day) {
        // case "Saturday", "Sunday":
        // System.out.println("6am");
        // break;
        // case "Monday":
        // System.out.println("8am");
        // break;
        // default:
        // System.out.println("7am");
        // }

        switch (day) {
            case "Saturday", "Sunday" -> System.out.println("6am");
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");
        }

        String result = "";

        switch (day) {
            case "Saturday", "Sunday" -> result = "6am";
            case "Monday" -> result = "8am";
            default -> result = "7am";
        }

        System.out.println("Set result = " + result);

        result = switch (day) {
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "8am";
            default -> "7am";
        };

        System.out.println("result with return -> =" + result);

        result = switch (day) {
            case "Saturday", "Sunday":
                yield "6am";
            case "Monday":
                yield "8am";
            default:
                yield "7am";
        };

        System.out.println("result with yield return =" + result);
    }
}
