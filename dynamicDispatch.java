class parent{
    void show(){
        System.out.println("Parent's show method");
    }
}

class child extends parent{
    @Override
    void show(){
        System.out.println("Child's show method.");
    }
}

public class dynamicDispatch{
    public static void main(String[] args) {
        parent obj = new child();  //upcasting
        obj.show();     //calls childs show method at runtime
    }
}