class Counter {
    static int count = 0;  // static variable

    Counter() {
        count++;   // increment static variable
        System.out.println("Object created. Current count: " + count);
    }
}

public class staticDemo
 {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("Final count: " + Counter.count); // access using class
    }
}
