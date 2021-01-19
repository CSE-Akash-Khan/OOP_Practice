package wk4.Q3;

public class BankA extends Bank{
    int balance = 100;
    @Override
    public void getUserBalance() {
        System.out.println("$"+balance);
    }
}
