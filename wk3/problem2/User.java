package wk3.problem2;

public class User {
    private String name = "Akash",phone = "01766738256";
    private String email = "khanakash779@gmail.com";
    private String password = "12345";

    public void get(){
        System.out.println("Name " + name);
        System.out.println("Phone number " + phone);
    }

    public boolean AuthenticatedUser(String eml, String pass){
        return email.equals(eml) && password.equals(pass);
    }

    public void isAuthenticatedUser(String a,String b){
        if(AuthenticatedUser(a,b)){
            System.out.println("Log in successful");
            get();
        }
        else {
            System.out.println("Login unsuccessful!\nemail and password don't matched");
        }
    }
}
