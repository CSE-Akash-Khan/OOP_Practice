package wk4.Q3;

public class BankC extends Bank{
    int balance = 200;
    @Override
    public void getUserBalance() {
        System.out.println("$"+balance);
    }
}
