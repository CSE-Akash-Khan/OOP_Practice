package wk4.Q3;

public class Main {
    public static void main(String[] args) {
        Bank B;
        B = new BankA();
        B.getUserBalance();
        B = new BankB();
        B.getUserBalance();
        B = new BankC();
        B.getUserBalance();
    }
}
