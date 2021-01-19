package wk2.getter_setter;

public class Animal2 {
    private String name,kingdom;
    private double height;
    public void setName(String a){
        this.name = a;
    }
    public String getName(){
        return name;
    }
    public void setKingdom(String a){

        this.kingdom = a;
    }
    public String getKingdom(){

        return kingdom;
    }
    public void setHeight(double x){

        this.height = x;
    }
    public double getHeight(){

        return height;
    }
    public void all_set_name(String n,String k,double h){
        setName(n);
        setKingdom(k);
        setHeight(h);
    }
    public void display(){
        System.out.println(getName());
        System.out.println(getKingdom());
        System.out.println(getHeight());
    }
}
