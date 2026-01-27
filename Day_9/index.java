package Day_9;

import java.util.Scanner;

class Rectangle{
    int length,breadth;
    int computeArea(){
        return length*breadth;
    }
    void displayArea(){
        System.out.println("Area : " + computeArea());
    }
    
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}

public class index {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(30, 50);
        Rectangle r2 = new Rectangle(30,10);

        System.out.println("Rectangle area of r1: " + r1.computeArea());
        System.out.println("Rectangle area of r2: " + r2.computeArea());

        if(r1.computeArea()>r2.computeArea()){
            System.out.println("Area of larger area is:" + r1.computeArea());
        }
        else{
            System.out.println("Area of larger area is:" + r2.computeArea());
        }
    }
}
