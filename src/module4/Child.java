package module4;

public class Child extends Parent{
    int c;

    public Child(){
        System.out.println("Child Default COnstructor");
    }

    public int getC(){
        return c;
    }

    public void setC(int c){
        System.out.println("setting c in child");
    }
}

