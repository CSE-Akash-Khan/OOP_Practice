package wk4.Q2;

public class Dinosaur extends Animal implements Habits {
    int age;
    String size = "20ft";

    Dinosaur(int age,String kingdom){
        super(kingdom);
        this.age = age;
    }

    @Override
    public void running() {
        System.out.println("run fast");
    }

    @Override
    public void eating() {
        System.out.println("eat: Meat");
    }

    @Override
    public void display() {
        System.out.println("age "+ age);
        System.out.println("kingdom "+kingdom);
        System.out.println("size "+size);
    }
}
