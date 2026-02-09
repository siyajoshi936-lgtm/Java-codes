class Calculator{
    //method overloading(diff parameters)
int add(int a,int b){return a+b;}
double add(double a,double b){return a+b;}
int add(int a,int b, int c){return a+b+c;}
}

public class overloading{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5,10));  //calls int version
        System.out.println(calc.add(5.5,2.2));  //calls double version
        System.out.println(calc.add(1,2,3)); //calls three int version    
        }
}