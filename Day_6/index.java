package Day_6;

class Box{
    int length,width,height;

    int volume(){
        return length*width*height;
    }

    void setData(int l,int w,int h){
        length= l;
        width= w;
        height= h;
    }
}
public class index {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();

        // b1.length= 10;
        // b1.width= 20;
        // b1.height= 10;
        // b1.volume();

        b1.setData(10, 30, 10);
        b2.setData(10, 40, 10);

        System.out.println("Volume of b1 " +b1.volume() );
        System.out.println("Volume of b2 " +b2.volume());
    }
}
