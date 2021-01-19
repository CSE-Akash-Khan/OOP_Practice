package wk2.Car;

public class Car {
    String brand,color,model;
    int num_of_seat,price,horse_power;
    Car(String a,String b, String c,int x,int hp,int x2){
        brand = a;
        color = b;
        model = c;
        num_of_seat = x;
        horse_power = hp;
        price = x2;
    }
    void Display_information(){
        System.out.println(brand);
        System.out.println(color);
        System.out.println(model);
        System.out.println(num_of_seat);
        System.out.println(horse_power + " HP");
        System.out.println(price + "M");
    }
}
