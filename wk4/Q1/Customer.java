package wk4.Q1;

public class Customer extends User{
    String email = "akaskhan@gmail.com",cellno = "01766738256";

    public void login(String loginId,String password){
        if(super.loginId.equals(loginId) && super.password.equals(password)){
            System.out.println("login successful");
        }
        else {
            System.out.println("Login failed!");
        }
    }
    @Override
    public void display() {
        System.out.println("Name: " + super.name);
        System.out.println("Email: " + email);
        System.out.println("Cellno: " + cellno);
    }
}
