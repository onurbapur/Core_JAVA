package Day37_Review_Encapsulation_Static.Galeri;

import java.util.ArrayList;

public class Galeri {
  static String name;
  static String address;

  static ArrayList<Araba> arabalar = new ArrayList<>();

  static {
      name = "ABC Araba Galerisi";
      address = "Falanca yerdeki galeri.";

      Araba araba1 = new Araba("Toyota","Corolla");
      arabalar.add(araba1);

      arabalar.add(new Araba("Honda","Accord"));
      arabalar.add(new Araba("Honda","Accord"));
      arabalar.add(new Araba("Honda","Civic"));
      arabalar.add(new Araba("Honda","City"));
      arabalar.add(new Araba("Toyota","Corolla"));
      arabalar.add(new Araba("Honda","Jazz"));
      arabalar.add(new Araba("Mercedes","E500"));
      arabalar.add(new Araba("Ford","Taunus"));
      arabalar.add(new Araba("Ford","Focus"));
      arabalar.add(new Araba("Toyota","Avensis"));
      arabalar.add(new Araba("Toyota","City"));
      arabalar.add(new Araba("Volkswagen","Passat"));
  }

  public static void showArabalar(){
      System.out.println("Galerideki arabaların listesi");
      System.out.println("-----------------------------");
      for (Araba araba:Galeri.arabalar){
          System.out.println(araba.marka + "-" + araba.model);
      }
  }
  public static void showInfo(Araba araba){
      System.out.println(araba.marka + "-" + araba.model);
  }
  public static void listByMarka(String marka){
      int sayi = 0;
      for (Araba araba:arabalar){
          if(araba.marka.equalsIgnoreCase(marka)){
              showInfo(araba);
              sayi++;
          }
      }
      if (sayi == 0){
          System.out.println("Galeride " + marka + " araç yok.");
      }else System.out.println(sayi + " adet " + marka + " marka araç var.");
  }
    public static void listByModel(String model){
        int sayi = 0;
        for (Araba araba:arabalar){
            if(araba.model.equalsIgnoreCase(model)){
                showInfo(araba);
                sayi++;
            }
        }
        if (sayi == 0){
            System.out.println("Galeride " + model + " araç yok.");
        }else System.out.println(sayi + " adet " + model + " model araç var.");
    }

    public static void listByMarkaModel(String marka, String  model){
        int sayi = 0;
        for (Araba araba:arabalar){
            if(araba.marka.equalsIgnoreCase(marka)){
                if (araba.model.equalsIgnoreCase(model)){
                    showInfo(araba);
                    sayi++;
                }
            }
        }
        if (sayi == 0){
            System.out.println("Galeride " + marka + " model " + model + " araç yok.");
        }else System.out.println(sayi + " adet " + marka + "-" + model+ " araç var.");
    }


    public static void main(String[] args) {
        System.out.println(name); //Aynı class içerisinde Class ismini kullanmadan metod ya da değişkenlere erişebiliriz.
        System.out.println(Galeri.address);
        System.out.println();

        Galeri.arabalar.add(new Araba("Tofaş","Şahin"));
        showArabalar(); // Aynı class içerisinde Class ismini kullanmadan metod ya da değişkenlere erişebiliriz.

     /*   listByMarka("HONDA");
        listByModel("city");*/

        listByMarkaModel("honda","accord");
    }
}
