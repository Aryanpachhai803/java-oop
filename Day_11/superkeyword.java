package Day_11;

// class vehicle {
//     int maxspeed = 1200;
// }
// class car extends vehicle {
//     int maxspeed = 300;

//     void display(){
//         System.out.println("vehicle speed is" + super.maxspeed);
//         System.out.println("car speed is" + maxspeed);
//     }
// }

// public class superkeyword {
//     public static void main(String[] args) {
//         car c = new car();
//         c.display();
//     }
// }

// class vehichle{
//     void message(){
//         System.out.println("This is vehicle!!");
//     }
// }
// class car extends vehicle{
//     void message(){
//         System.out.println("This is car!!");
//     }
//     void dislay(){
//         super.message();
//         message();
//     }
// }

// public class superkeyword {

//     public static void main(String[] args) {
//         car c = new car();

//         c.dislay();
//     }
// }


class vehicle{
    vehicle(){
        System.out.println("Vehicle Constructor!!");
    }
}

class car extends vehicle{
    car(){
        super();
        System.out.println("Car Constructor!!");
    }
}
public class superkeyword {

    public static void main(String[] args) {
        car c = new car();
        
    }
}
