package Day_5;

public class index {
    int height,width,length;
    void volume(){
        System.out.println("Volume: " + height*width*length);
    }

public static void main(String[] args){
    index Box = new index();
    Box.length = 10;
    Box.width = 20;
    Box.height = 10;
    Box.volume();
}
} 