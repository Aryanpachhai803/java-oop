package Day_32;

import java.util.Scanner;

public class StringWrapper {
    String text;
    public StringWrapper(String text){
        this.text = text;
    }

    public String getVowels(){
        String result = "";

        for(int i=0;i<text.length();i++){
            char c = text.charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                result +=c;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        StringWrapper sw = new StringWrapper(input);

        System.out.println("Vowels only: " + sw.getVowels());

        sc.close();
    }
}
