package wk4.Q3;

public class BankB extends Bank{
    int balance = 150;

    @Override
    public void getUserBalance() {
        System.out.println("$"+balance);
    }
}
