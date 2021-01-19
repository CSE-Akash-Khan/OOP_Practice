package wk3.problem2;

public class Test2 {
    public static void main(String[] args) {
        User2 p1 = new User2("Akash","01766..","mkakash@gmail.com","123");
        p1.isAuthenticatedUser("mkakash@gmail.com","123");
        System.out.println("..............");
        User2 p2 = new User2("Rana","017142..","rana@gmail.com","246");
        p2.isAuthenticatedUser("rana@gmail.com","246");

    }
}
