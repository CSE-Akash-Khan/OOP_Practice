package wk2.getter_setter;

public class Main {
    public static void main(String[] args) {
        Animal2 a1 = new Animal2();
        Animal2 a2 = new Animal2();
        a1.setName("Bear");
        System.out.println(a1.getName());
        a1.setKingdom("Free");
        System.out.println(a1.getKingdom());
        a1.setHeight(7.6);
        System.out.println(a1.getHeight());
        a1.all_set_name("Bear","Free",7.6);
        a1.display();
        System.out.println("..............");
        a2.all_set_name("Horse","Domestic",5.5);
        a2.display();
//        a1.setName("Akash");
//        System.out.println(a1.getName());
    }
}
