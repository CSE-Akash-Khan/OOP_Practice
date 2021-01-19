package wk4.Q4;

public class Main {
    public static void main(String[] args) {
        A s1 = new A(80,70,90);
        System.out.println("Student A: "+s1.getPercentage() + "%");
        B s2 = new B(70,80,90,50);
        System.out.println("Student B: " + s2.getPercentage() + "%");
    }
}
