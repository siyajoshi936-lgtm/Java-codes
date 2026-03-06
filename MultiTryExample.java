public class MultiTryExample{

    public static void main(String[] args) {

        try {
            String str = "123a";
            int num = Integer.parseInt(str);

            int result = 10 / 0;

            System.out.println("Number: " + num);
            System.out.println("Result: " + result);
        }

        catch (NumberFormatException | ArithmeticException e) {
            System.out.println("invalid");
        }

        System.out.println("Program continues after exception handling.");

    }
}