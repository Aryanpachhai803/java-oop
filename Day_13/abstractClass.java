package Day_13;

// abstract class animal{
//     abstract void makeSound();
// }


// class cow extends animal{
//     void makeSound(){
//         System.out.println("Mow");
// }
// }

// class tiger extends animal{
//     void makeSound(){
//         System.out.println("Roar");
//     }
// }

// public class abstractClass {
//     public static void main(String[] args) {
//         cow c1 = new cow();
//         c1.makeSound();

//         tiger t1 = new tiger();
//         t1.makeSound();
//     }
// }


abstract class Shape{
    int dim1;
    int dim2;

    abstract void area();

    public Shape(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
}

class Rectangle extends Shape{
    
    public Rectangle(int dim1,int dim2){
        super(dim1,dim2);
    }

    @Override
    void area(){
        int result = dim1*dim2;
        System.out.println("Area of a rectangle " + result);
    }
}

class Triangle extends Shape{

    public Triangle(int dim1,int dim2){
        super(dim1,dim2);
    }

    @Override
    void area(){
        double result = 0.5*(dim1*dim2);
        System.out.println("Area of a triangle " + result);
    }
}

public class abstractClass{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 3);
        r1.area();

        Triangle t1 = new Triangle(2, 3);
        t1.area();
    }
}