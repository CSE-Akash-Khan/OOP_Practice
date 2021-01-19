package wk2.Animal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal tiger = new Animal("Tiger","Free",5.6);
        tiger.display();
        System.out.println("...................");
        Animal lion = new Animal("Lion","free",6.3);
        lion.display();
        System.out.println("..................");
        Animal cow = new Animal("cow","Domestic",5.2);
        cow.display();
    }
}
