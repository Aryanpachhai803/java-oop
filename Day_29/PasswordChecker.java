package Day_29;

import java.util.*;
import java.io.*;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUser = sc.nextLine();

        System.out.print("Enter password: ");
        String inputPass = sc.nextLine();

        boolean found = false;

        try {
            FileReader fr = new FileReader("users.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");

                String username = data[0];
                String password = data[1];

                if (username.equals(inputUser) && password.equals(inputPass)) {
                    found = true;
                    break;
                }
            }

            br.close(); 

            if (found) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid username or password");
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}