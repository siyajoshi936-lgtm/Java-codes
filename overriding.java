//parent class
class BankAccount{
    double getInterestRate(){
        return 0.0; //default interest rate
    }
}

//child class-Savings account
class SavingsAccount extends BankAccount{
    @Override
    double getInterestRate(){
        return 4.5;  // Savings interest rate
    }
}

class CurrentAccount extends BankAccount{
    @Override
    double getInterestRate(){
        return 3.0;  //current account interest rate
    }
}

public class overriding{
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount();
        BankAccount ca = new CurrentAccount();
        System.out.println("Saving "+sa.getInterestRate());
        System.out.println("Current int rate:" +ca.getInterestRate());
    }
}