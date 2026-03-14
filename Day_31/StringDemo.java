package Day_31;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Nepathya College";
        String s2 = "College";

        System.out.println("The length is " + s1.length());
        System.out.println("To Lowercase: " + s1.toLowerCase());
        System.out.println("Concate: " + s1.concat(s2));
        System.out.println("CharAt: " + s1.charAt(3));
        System.out.println("Trim: " + s1.trim());
        System.out.println("Compare: " + s1.compareTo(s2));
        System.out.println("SubString: " + s1.substring(5));
    }
}
