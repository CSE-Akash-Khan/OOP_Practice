package wk4.Q2;

public abstract class Animal {
    String kingdom;
    Animal(String kingdom){
        this.kingdom = kingdom;
    }
    public abstract void display();
}
