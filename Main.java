public class Main{

    int x=20;
    public static void main ( String[]args)
    {
        
        for (int i = 1; i <= 3; i++) 
            {
            for (int j = 1; j <= i; j++) 
            {
            System.out.print(j + " ");
            }
            System.out.println();
            }

        Main myObj = new Main();  //creating object in Main class
        System.out.println(myObj.x);  //accessing x through object of Main
        System.out.println("Hello World");

    }
}

