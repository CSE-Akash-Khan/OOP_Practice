package wk3.problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your id: ");
        int id = input.nextInt();
        Money m1 = new Money("Akash",id,"01766","mkakash779@gmail.com");

        //todo***********************************
        if(m1.login()){
            System.out.println("Login successful");
            int x;
            do {
                System.out.println("........................");
                System.out.println("Choose Instruction");
                System.out.println("1 Add money\n2 Widthdraw money\n3 Check balance");
                x = input.nextInt();
                if(x == 1){
                    System.out.print("Enter amount: ");
                    int add = input.nextInt();
                    m1.add_money(add);
                    System.out.print("Enter press for any key for Main menu or 0 for exit: ");
                    int n = input.nextInt();
                    if(n == 0){
                        x = n;
                    }
                }
                else if(x == 2){
                    System.out.print("Enter amount: ");
                    int add = input.nextInt();
                    m1.widthdraw_money(add);
                    System.out.print("press for any key Main menu or 0 for exit: ");
                    int n = input.nextInt();
                    if(n == 0){
                        x = n;
                    }
                }
                else if(x == 3){
                    m1.check_balance();
                    System.out.print("press for any key Main menu or 0 for exit: ");
                    int n = input.nextInt();
                    if(n == 0){
                        x = n;
                    }
                }
            }
            while (x != 0);
        }
        else {
            System.out.println("Id is incorrect");
        }
    }
}
