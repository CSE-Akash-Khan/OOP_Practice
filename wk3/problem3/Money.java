package wk3.problem3;

public class Money extends Person_details{
    private int m_id = 13631,money = 0;


    Money(String name,int id,String phone,String email){
        super(name,id,phone,email);
    }

    public void add_money(int n){
        if(id == m_id){
            money += n;
            System.out.println("Add money " + n +" successful.");
        }
        else {
            System.out.println("Incorrect id");
        }
    }
    public void widthdraw_money(int n){
        if(id == m_id){
            if(n <= 20000 && money >= n){
                money -= n;
                System.out.println("widthdraw " + n + " is successful");
                System.out.println("Current balance is " + money);
            }
            else{
                if(n > 20000){
                    System.out.println("You can't widthdraw up to 20k");
                }
                else {
                    System.out.println("You have not sufficient balance");
                    System.out.println("Your balance is: " + money);
                }
            }
        }
        else {
            System.out.println("Incorrect id");
        }
    }
    public void check_balance(){
        if (id == m_id){
            System.out.println("Your  balance is: " + money);
        }
        else {
            System.out.println("Incorrect id");
        }
    }

    public boolean login(){
        return id == m_id;
    }

}
