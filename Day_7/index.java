package Day_7;

class Box{
    int length,width,height;

    int volume(){
        return length*width*height;
    }
    
    Box(){
        System.out.println("Non-parameterzied constructor");
    }
    Box(int l,int w,int h){
        length = l;
        width = w;
        height = h;
    }
}

public class index {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        Box b2 = new Box();
        System.out.println("B1 volume: " +b1.volume());
    }
}
