package src;
public class StringBuilderDemo {
    public static void main(String[] args) {
        var sb = new StringBuilder();

        sb.append("Amit");
        sb.append("nPnadey rr");

        int index = sb.indexOf("rr");
        sb.delete(index - 1, index + "rr".length());

        System.out.println(index);
        System.out.println(sb);

        int ind1 = sb.indexOf("n");
        sb.replace(ind1, ind1 + 1, " ");
        System.out.println(sb);

        int ind2 = sb.indexOf("n");
        int ind3 = sb.lastIndexOf("a");
        sb.setCharAt(ind2, 'a');
        sb.setCharAt(ind3, 'n');

        System.out.println(sb);
    }
}
