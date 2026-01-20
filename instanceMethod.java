class Person{
    String name;

    void display(){
        System.out.println("Name: "+ name);
    }
}

public class instanceMethod{
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Siya";
        p.display();
    }
}