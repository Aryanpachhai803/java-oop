package Day_8;

class Box{
    int length,width,height;
    int volume(){
        return length*width*height;
    }
    Box(int length,int width,int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
}
public class index {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        System.out.println("B1 volume: " +b1.volume());
    }
}
