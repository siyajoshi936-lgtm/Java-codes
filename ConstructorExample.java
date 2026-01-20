
    class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Default name";
        age = 19;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Student student1 = new Student(); // default constructor is called
        student1.display();               // calling display method
    }
}
