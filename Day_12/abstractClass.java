package Day_12;

abstract class animal{
    abstract void makeSound();
}


class dog extends animal{
    void makeSound(){
        System.out.println("Bark");
}
}

class cat extends animal{
    void makeSound(){
        System.out.println("Meow");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.makeSound();

        cat c1 = new cat();
        c1.makeSound();
    }
}
