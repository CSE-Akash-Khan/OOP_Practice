package wk2.Car;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("BMW","red","BM105",5,903,5);
        cars[0].Display_information();
        System.out.println("........................");
        cars[1] = new Car("Ferrari","Black","fr502",4,8006,6);
        cars[1].Display_information();
        System.out.println("......................");
        cars[2] = new Car("Honda","Yellow","hn325",6,720,2);
        cars[2].Display_information();
        //Another way to make cars array
//        Car[] cars = new Car[3];
//        String[] brand = {"BMW","Ferrari","Honda"};
//        String[] color = {"Red","Black","Yellow"};
//        String[] model = {"BM565","Fe456","Hn654"};
//        int[] set = {5,6,4};
//        int[] hp = {845,965,547};
//        int[] price = {4,5,3};
//        for(int i = 0; i<3; i++){
//            cars[i] = new Car(brand[i],color[i],model[i],set[i],hp[i],price[i]);
//            cars[i].Display_information();
//            System.out.println("................");
//        }

    }
}
