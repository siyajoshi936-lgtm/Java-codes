class Animal {
    void eat(){
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal{
    void barks(){
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat eats rats");
    }
}

public class Hierarchial{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.barks();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
