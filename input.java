import java.util.Scanner;
public class input {
    public static void main(String[]args){
        //creating an bject of scanner class
        Scanner sc = new Scanner(System.in);
        //reading two integer numbers
        //using nextInt() method
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        //calculating the sum
        int sum = num1+num2;
        //printing the sum
        System.out.println("Sum of the numbers is: " +sum);

    }
}
