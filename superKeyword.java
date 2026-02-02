class Parent{
    void display(){
        System.out.println("Parent class method");

    }

    void example(){
        System.out.println("My name is Siya");
    }
}

class Child extends Parent{
    void display(){
        super.display();  //calls parent class method  even though both are named display
        System.out.println("Child class method");
    }
    void example(){
        System.out.println("Example Child class method");
    }
}

public class superKeyword{
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.example();   //will not call function example of parent class
    }
}