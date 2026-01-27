package Day_3;

public class index {

    //Declartion method
    // int ary[] = new int[5];
    // int []ary = new int[5];
    // int ary[];ary = new int[5];
       public static void main(String[] args) {
        int[] newNumbers = new int[12];

        newNumbers[0] = 10;
        newNumbers[1] = 6;
        newNumbers[2] = 88;
        newNumbers[3] = 91; 
        newNumbers[4] = 25;
        newNumbers[5] = 77;
        newNumbers[6] = 14;
        newNumbers[7] = 23;
        newNumbers[8] = 4;
        newNumbers[9] = 235;
        newNumbers[10] = 66;
        newNumbers[11] = 81;

        System.out.println("Length of Array: " + newNumbers.length);
        System.out.println("5th element Array: " + newNumbers[4]);
        newNumbers[4] =35;
        System.out.println("Value changed of 5th element into : " + newNumbers[4]);

        int sum =0;
        for(int i=0;i<newNumbers.length;i++){
            sum += newNumbers[i];
        }
       }    
}
