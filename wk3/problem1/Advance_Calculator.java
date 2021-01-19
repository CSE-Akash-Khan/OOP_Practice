package wk3.problem1;

public class Advance_Calculator extends Calculator {
    private int v1,v2;
    private double x,y;

    Advance_Calculator(int x,int y){
        super(x,y);
        this.v1 = x;
        this.v2 = y;
        this.x = x;
        this.y = y;
    }

//    public void set_multiply(int v1,int v2){
//        this.v1 = v1;
//        this.v2 = v2;
//    }
    public void get_multiply(){
        System.out.println("Multiplication: " + (v1 * v2));
    }

//    public void set_divide(double v1,double v2){
//        this.x = v1;
//        this.y = v2;
//    }
    public void get_divide(){
        System.out.println("Division: " + String.format("%.3f",(x / y)));
    }

//    public void set_root(double a){
//        this.x = a;
//    }
    public void get_root(){
        System.out.println("Root: " + String.format("%.3f",Math.sqrt(x)));
    }
//    public void set_squqare(int v1){
//        this.v1 = v1;
//    }
    public void get_square(){
        System.out.println("Square: " + (v1 * v1));
    }
//    public void All_set(){
//        set_plus(v1,v2);
//        set_substract(v1,v2);
//        set_multiply(v1,v2);
//        set_divide(v1,v2);
//        set_squqare(v1);
//        set_root(v1);
//    }
    //todo: used for without constructor
//    public void All_set(int x,int y){
//        set_plus(x,y);
//        set_substract(x, y);
//        set_multiply(x, y);
//        set_divide(x, y);
//        set_squqare(x);
//        set_root(x);
//    }

    public void All_get(){
        get_plus();
        get_substract();
        get_multiply();
        get_divide();
        get_square();
        get_root();
    }
}
