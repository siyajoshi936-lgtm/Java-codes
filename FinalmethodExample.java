class Parent{
    final void display(){   
        System.out.println("Final method in parent class");
    }
}
class Child extends Parent{
    //void display() {} //compilation error it attempted
}

public class FinalmethodExample{
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}