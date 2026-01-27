package Day_14;

// abstract class animal{
//     abstract void makeSound();
// }


// class dog extends animal{
//     void makeSound(){
//         System.out.println("Bark");
// }
// }

// class cat extends animal{
//     void makeSound(){
//         System.out.println("Meow");
//     }
// }

// public class abstraction {
//     public static void main(String[] args) {
//         dog d1 = new dog();
//         d1.makeSound();

//         cat c1 = new cat();
//         c1.makeSound();
//     }
// }


// abstract class Shape{
//     int dim1;
//     int dim2;

//     abstract void area();

//     public Shape(int dim1, int dim2){
//         this.dim1 = dim1;
//         this.dim2 = dim2;
//     }
// }

// class Rectangle extends Shape{
    
//     public Rectangle(int dim1,int dim2){
//         super(dim1,dim2);
//     }

//     @Override
//     void area(){
//         int result = dim1*dim2;
//         System.out.println("Area of a rectangle " + result);
//     }
// }

// class Triangle extends Shape{

//     public Triangle(int dim1,int dim2){
//         super(dim1,dim2);
//     }

//     @Override
//     void area(){
//         double result = 0.5*(dim1*dim2);
//         System.out.println("Area of a triangle " + result);
//     }
// }

// public class abstraction{
//     public static void main(String[] args) {
//         Rectangle r1 = new Rectangle(2, 3);
//         r1.area();

//         Triangle t1 = new Triangle(2, 3);
//         t1.area();
//     }
// }





// abstract class Machine{
//     abstract void putData();
//     abstract void getData();
// }



// public class Airplane{
//     int code;
//     String name;
//     int capacity;

//     @Override
//     void putData(int code,String name,int capacity){
//         this.code = code;
//         this.name = name;
//         this.capacity = capacity;
//     }
// }

// public class abstraction{
//     public static void main(String[] args) {
        
//     }
// }