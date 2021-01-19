package wk4.Q4;

public class A extends Marks{
    int english,math,economics;

    A(int english,int math,int economics){
        this.english = english;
        this.math = math;
        this.economics = economics;
    }

    @Override
    public int getPercentage() {
        int total_marks = english + math + economics;
        return (total_marks * 100) /300;
    }
}
