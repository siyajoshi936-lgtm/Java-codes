import java.io.*;

public class ThrowsExample {

    static void readFile() throws IOException {     //function

        FileReader file = new FileReader("abc.txt");    //file is the ref variable
        System.out.println("File opened");
    }

    public static void main(String[] args) throws IOException {
        readFile();
    }
}