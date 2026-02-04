class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {        //same method names
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.makeSound();   // Dog barks

        a = new Cat();
        a.makeSound();   // Cat meows
    }
}
