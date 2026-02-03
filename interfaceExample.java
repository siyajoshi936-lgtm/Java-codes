interface Animal{
    void sound(); //abstract method, logic is not mentioned

}
interface Animal1{
    void movement();
}

class Dog implements Animal, Animal1{   //similar to dof EXTENDS animal
    public void sound(){
            System.out.println("Dog barks");
    }
    public void movement(){
        System.out.println("Dog walks.");
    }
}

public class interfaceExample
{
    public static void main(String[] args) {
        Dog a = new Dog();
        a.sound();
        Dog b = new Dog();
        b.movement();
    }
}

