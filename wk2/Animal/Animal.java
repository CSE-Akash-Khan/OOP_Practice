package wk2.Animal;
public class Animal {
    String name,kingdom;
    double height;
    Animal(String a,String b,double x){
        name = a;
        kingdom = b;
        height = x;
    }
    void display() {
        System.out.println(name);
        System.out.println(kingdom);
        System.out.println(height + "fut");
    }
    void eat(String a) {
        System.out.println(a);
    }
}
