package Day_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
