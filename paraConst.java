class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class paraConst {
    public static void main(String[] args) {
        Student s1 = new Student("Siya", 19);
        s1.display();
    }
}
