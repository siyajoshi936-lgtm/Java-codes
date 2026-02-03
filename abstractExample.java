abstract class Shape{
    abstract void draw();  //abstract method

    void message(){
        System.out.println("This is a shape");

    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing a circle");
    }
}

public class abstractExample{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.message();
    }

}
