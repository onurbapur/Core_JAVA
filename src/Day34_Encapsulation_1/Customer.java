package Day34_Encapsulation_1;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Account> accounts;//Müşteriye ait hesaplar

    public Customer() {
        accounts = new ArrayList<>();//Müşteriye ait hesaplar
    }

    public Customer(String name) {
       // this.name = name;
        setName(name);
        accounts = new ArrayList<>();//Müşteriye ait hesaplar
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase().trim();
    }
    public void addAccount(Account account){
        this.accounts.add(account);
    }

    public void hesabaParaYatir(Account account, int money){
        account.deposit(money);
    }
    public void showMyAccounts(){
        for (Account account : this.accounts){
            System.out.println("Hesap sahibi    : " + this.name);
            System.out.println("Account type    : " + account.getType());
            System.out.println("Account balance : " + account.getBalance());
            System.out.println("--------------------------------");
        }
    }
    public  Account hesapBul(String hesapAdi) {
        System.out.println("Hesap bul method called");
        Account hesap = null;
        for (Account account : accounts) {
            if ((hesapAdi.equals(account.getType())))  {
                hesap = account;
                System.out.println(this.name + " " + account.getType() + " " + account.getBalance());
            }
        }
        return hesap;
    }
}
