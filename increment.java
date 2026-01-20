public class increment {
    
    public static void main(String[] args) {

        int i = 5;
        int a = ++i;   // pre-increment
        System.out.println("After ++i: i = " + i + ", a = " + a);

        int j = 5;
        int b = j++;   // post-increment
        System.out.println("After j++: j = " + j + ", b = " + b);
    }
}


