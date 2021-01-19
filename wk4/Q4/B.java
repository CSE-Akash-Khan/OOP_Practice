package wk4.Q4;

public class B extends Marks{
    int english,math,economics,accounting;

    B(int english,int math,int economics,int accounting){
        this.english = english;
        this.math = math;
        this.economics = economics;
        this.accounting = accounting;
    }

    @Override
    public int getPercentage() {
        int total_marks = english + math + economics + accounting;
        return total_marks * 100 /400;
    }
}
