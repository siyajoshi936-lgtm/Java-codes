public class thwr {

    public static void main(String[] args) {

        int age = 15;

        if(age < 18) {
            throw new ArithmeticException("Age too small");
        }

        System.out.println("You can vote");
    }
}