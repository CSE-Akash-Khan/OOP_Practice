package wk2.Calculation;

public class Calculator {
    int a,b;
    Calculator(int x, int x2){
        a = x;
        b = x2;
    }
    public void jogkori(){
        System.out.println("Addition " + (a+b));
    }
    public void biyogkori(){
        System.out.println("Subtraction " + (a - b));
    }
    public void gunkori(){
        System.out.println("Multiplication " + (a * b));
    }
    public void vagkori(){
        System.out.println("Division " + (a / b));
    }
    public void showAlloperation(){
        jogkori();
        biyogkori();
        gunkori();
        vagkori();
    }
}
