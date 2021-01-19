package wk3.problem3;

public class Person_details {
    String name,phone,email;
    int id;
    Person_details(String name,int id,String phone, String email){
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.email = email;
    }
    public void person_details(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
}
