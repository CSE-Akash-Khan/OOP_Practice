package wk3.problem2;

public class User2 {
    private String name,phone,email,password;
    User2(String a,String b, String c, String d){//constructor working as setter methode
        this.name = a;
        this.phone = b;
        this.email = c;
        this.password = d;
    }
    public void getNamegetPhone(){ //show name and phone both
        System.out.println("Name " + name);
        System.out.println("Phone number: " + phone);
    }
    public boolean AuthenticadedUser(String eml,String pass){
        return email.equals(eml) && password.equals(pass);
    }
    public void isAuthenticatedUser(String a,String b){
        if(AuthenticadedUser(a,b)){
            System.out.println("Login successful");
            getNamegetPhone();
        }
        else {
            System.out.println("Login unsuccessful!");
        }
    }
}
