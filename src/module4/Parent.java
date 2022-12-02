package module4;

public class Parent {
   private int p ;
    public int getP(){
        return p;
    }

    public void setP(int p){
        System.out.println("setting P in parent ");
        this.p = p;
    }

    public void printValue(){
        System.out.println("parent Method");
    }
}




