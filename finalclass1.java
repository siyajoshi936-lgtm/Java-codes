final class FinalClass{
    void display(){
        System.out.println("This is a final class");
    }
}

//class subclass extends Finalclass{}// compilation error, inheritance not possible

public class finalclass1{
    public static void main(String[] args) {
      FinalClass obj = new FinalClass();
      obj.display();  
    }
}
