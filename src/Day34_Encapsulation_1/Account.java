package Day34_Encapsulation_1;

public class Account {
    private String type;
    private int balance;

    public Account() {
    }
    public Account(String type, int balance) {
        this.type = type;
        this.balance = balance;
    }
    public void setType(String type){
        this.type = type.toUpperCase().trim();
    }
    public String getType() {
        return type;
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int money){
        if (money > 0){
            this.balance += money;
        }
    }
    public void withDraw(int money){
        if(balance <= money && money > 0){
            this.balance -= money;
        }
    }
}
