class DisplayVariables {
    public static void main(String[] args) {

        // String variables
        String fName = "SI";
        String lName = "College";

        // Concatenating strings
        String fullName = fName + " " + lName;
        System.out.println("Full Name: " + fullName);

        // Integer variables
        int x = 5;
        int y = 15;
        System.out.println("x + y = " + (x + y));

        // Different data types
        char ch = '6';
        int i = 89;
        byte b = 4;
        short s = 56;
        float f = 4.775848f;
        double d = 4.35543352;
        long l = 122121;

        // Displaying variables
        System.out.println("char: " + ch);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);

        // Final variable (cannot be changed)
        final int a = 20;
        //a = 22  will show error
        System.out.println("final variable a: " + a);

        String studentName = "Siya Joshi";
        int age = 19;
        int id = 200;
        float fee = 45.56f;
        char grade = 'B';

        System.out.println("Student name: " +studentName);
        System.out.println("Student age: " +age);
        System.out.println("Student id: " +id);
        System.out.println("Student fee: " +fee);
        System.out.println("Student grade: " +grade);

        //finding area of a circle
        float radius = 67.89f;
        float pi = 3.14f;
        System.out.println("Area of circle is: " +2*pi*radius);
    }
}
 

