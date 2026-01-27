class Student{
    String name;

    Student(String name){
        this.name = name;  //this is a keyword
    }
    void display(){
        System.out.println("Name : "+this.name);
    }
}
public class keyword{
    public static void main(String[] args) {
        Student s = new Student("Alice");
        s.display();
    }
}