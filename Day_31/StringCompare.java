package Day_31;

public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Nepathya";
        String s2 = "nepathya";

        System.out.println("String 1: " + s1);
        System.out.println("String 2: "+ s2);

        // Checks exact string(Case-sensitive)
        System.out.println("Equals: " + s1.equals(s2));

        // Checks string equals ignoring case
        System.out.println("Equals Ignoring Case: " + s1.equalsIgnoreCase(s2));
    }
}
