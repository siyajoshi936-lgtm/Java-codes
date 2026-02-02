class Demo {
    Demo(){
        this("Default Construtor"); //calls parametrised constructor
        }

    Demo(String message){
        System.out.println(message);
    }

}

public class constructorusingThis{
    public static void main(String[] args){
        new Demo();
    }
}