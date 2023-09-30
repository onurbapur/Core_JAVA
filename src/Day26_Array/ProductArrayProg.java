package Day26_Array;

public class ProductArrayProg {
    public static void main(String[] args) {
        Product[] products = new Product[2];

        Product product1 = new Product("Armut",17,3);
        Product product2 = new Product("Peynir",130,3);
        Product product3 = new Product("Peynir",130,3);

//        product1.name = "Elma";
//        product1.adetYadaMiktar = 5;
//        product1.price = 25;
//
//        product2.name = "Peynir";
//        product2.adetYadaMiktar = 2;
//        product2.price = 100;

        products[0] = product1;
        products[1] = product2;

        System.out.println("For each loop ");
        System.out.println("------------------------------");
        for (Product urun: products) {
            System.out.println("Ürün.name = " + urun.name);
            System.out.println("Ürün.price = " + urun.price);
            System.out.println("Ürün.adetYadaMiktar = " + urun.adetYadaMiktar);
            urun.fiyatHesapla();
            System.out.println("------------------------------");
        }

        System.out.println();
        System.out.println("For loop ");
        System.out.println("------------------------------");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Ürün.name = " + products[i].name);
            System.out.println("Ürün.price = " + products[i].price);
            System.out.println("Ürün.adetYadaMiktar = " + products[i].adetYadaMiktar);
            products[i].fiyatHesapla();
            System.out.println("------------------------------");
        }
    }

}
