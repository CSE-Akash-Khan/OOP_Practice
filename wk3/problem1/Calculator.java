package wk3.problem1;

public class Calculator {
    private int a,b;

    Calculator(int x,int y){
        this.a = x;
        this.b = y;
    }

//    public void set_plus(int x, int y){
//        this.a = x;
//        this.b = y;
//    }
    public void get_plus(){
        System.out.println("Addition: " + (a + b));
    }
//    public void set_substract(int x, int y){
//        this.a = x;
//        this.b = y;
//    }
    public void get_substract(){
        System.out.println("Subtraction: " + (a - b));
    }
}
