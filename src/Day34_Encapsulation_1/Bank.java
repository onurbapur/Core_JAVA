package Day34_Encapsulation_1;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String address;
    private ArrayList<Customer> customers;

    public Bank(){

    }
    public Bank(String name, String address) {
       /* this.name = name;
        this.address = address;*/
        customers = new ArrayList<>();
        setName(name);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.toUpperCase().trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address.toUpperCase().trim();
    }
    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
    public void showCustomers(){
        System.out.println("Banka adı       : " + this.name);
        System.out.println("Banka adresi    : " + this.address);
        System.out.println("----------------------------------");
        System.out.println("Banka müşterileri");
        System.out.println("----------------------------------");
        for (Customer customer : customers){
          //  System.out.println("Müşteri adı     : " + customer.getName());
            customer.showMyAccounts();
    //        System.out.println("----------------------------------");
        }
    }
}
