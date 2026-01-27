package Day_4;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number element in an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter number all the element of an array");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        
        System.out.println("The even numbers are: ");
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i] + " ");
            }
        }

        System.out.println("The odd numbers are: ");
        for(int i=0;i<n;i++){
            if(arr[i]%2 != 0){
                System.out.println(arr[i] + " ");
            }
        }

       }    
}
