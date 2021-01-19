package wk3.problem2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Email: ");
        String email = input.nextLine();
        System.out.print("Enter your password: ");
        String password = input.nextLine();
        User p1 = new User();
        p1.isAuthenticatedUser(email,password);
    }
}
