package module2;
public class Account {
    private String name;
    private double mainBalance;
    public void deposit(double amount){
        mainBalance = mainBalance+ amount;
    }
    public void setMainBalance(double mainBalance) {
        this.mainBalance = mainBalance;
    }
    public Account(String name, double mainBalance) {
        this.name = name;
        this.mainBalance = mainBalance;
    }
    public String getName() {
        return name;
    }
    public double getMainBalance() {
        return mainBalance;
    }
}