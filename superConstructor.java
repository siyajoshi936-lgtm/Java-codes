class Parent{
    Parent(){
        System.out.println("Parent class constructor");
    
    }

}

class Child extends Parent{
    Child(){
        super();   ///calls parent class constructor
        System.out.println("Child class constructor");


    }
}

public class superConstructor{
    public static void main(String[] args) {
        new Child();
    }
}