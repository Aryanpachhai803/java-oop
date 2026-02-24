package Day_29;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileDemo {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("text.txt");
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            System.out.println(str);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
