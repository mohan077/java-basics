package module2;
import java.util.Scanner;
public class AccountMain {
    public static void main(String[] args) {
        Account a1= new Account(
                "MOhan Rawat",
                7900
        );
        System.out.println("Current Balance for "+ a1.getName()+ " is "+a1.getMainBalance());
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter your deposit amount \n");
        double amount = sc.nextDouble();
        a1.deposit(amount);
        System.out.println("Current Amount of "+a1.getName()+" is "+a1.getMainBalance());
    }
}
