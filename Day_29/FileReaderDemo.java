package Day_29;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        char str;
        try{
            FileInputStream fr = new FileInputStream("text.txt");
            do{
            str = (char)fr.read();
            System.out.println(str);
            }while(str != -1);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
