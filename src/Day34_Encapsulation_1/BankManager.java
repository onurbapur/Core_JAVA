package Day34_Encapsulation_1;

public class BankManager {
    public static void main(String[] args) {
        Bank bankaObj = new Bank();
        bankaObj.setName("  abc bank    ");
        bankaObj.setAddress("  ortaköy İsTanBul   ");

        Account account1 = new Account("TL Hesabı", 1500);
        Account account2 = new Account("Dolar Hesabı", 2500);
        Account account3 = new Account("Euro hesabı", 1750);

        Customer customer1 = new Customer("Ahmet Falanca");
        Customer customer2 = new Customer("Merry Webster");

        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer1.addAccount(new Account("Altın Hesabı",10));//Another way to create and add account to customer

        customer2.addAccount(account2);
        customer2.addAccount(account3);

        bankaObj.addCustomer(customer1);
        bankaObj.addCustomer(customer2);

        customer1.showMyAccounts();
        customer2.showMyAccounts();

        bankaObj.showCustomers();

        customer1.hesabaParaYatir(account1,300);
        customer1.showMyAccounts();
        customer1.hesapBul("TL Hesabı");

    }

}
