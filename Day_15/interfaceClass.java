package Day_15;

//Interface is blueprint of class
 
interface Polygon{
    void getArea(int length,int width);
}

class Rectangle implements Polygon{
    public void getArea(int length,int width){
        int Area = length * width;
        System.out.println("Area is " + Area);
    }
}

public class interfaceClass {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(2, 3);
    }
}
