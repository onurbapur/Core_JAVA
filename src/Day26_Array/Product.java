package Day26_Array;

public class Product {
    String name;
    double price;
    int adetYadaMiktar;

    public Product(String name, double price, int adetYadaMiktar) {
        this.name = name;
        this.price = price;
        this.adetYadaMiktar = adetYadaMiktar;
    }

    public void fiyatHesapla(){
        System.out.println("Ürün tutarı : " + (price * adetYadaMiktar));
    }
}
