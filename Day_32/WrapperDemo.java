package Day_32;

public class WrapperDemo {
    public static void main(String[] args) {
        int i = 10;
        Integer i1 = new Integer(i); //Boxing 
        int j = Integer.valueOf(i1); //Unboxing
        Integer v = i;               //Auto-Boxing
        int w = v;                   //Auto-Unboxing

        System.out.println(i);
        System.out.println(i1);
        System.out.println(j);
        System.out.println(v);
        System.out.println(w);
    }
}
 