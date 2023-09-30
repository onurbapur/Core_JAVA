package Day36_StaticClassMembers_1;

public class Ulkeler {
    static int ulkelerSayac;
    String name;
    int dummyCounter;
    private Ulkeler(){ //private modifier olduğu için bu konstructor kullanarak nesne üretilemez
       ulkelerSayac++;
   }

   Ulkeler(String name){
       ulkelerSayac++;
       this.name = name;
       this.dummyCounter++;
   }

    @Override
    public String toString() {
        return "Ulkeler{" +
                "name='" + name + '\'' +
                ", dummyCounter=" + dummyCounter +
                '}';
    }

    public static void main(String[] args) {
        //Creating intance
        Ulkeler ulke1 = new Ulkeler();
        ulke1.name = "Türkiye";
        ulke1.dummyCounter = 90;
        System.out.println("Oluşturlan Ülke sayısı = " + Ulkeler.ulkelerSayac);

        Ulkeler ulke2 = new Ulkeler("India");
        Ulkeler ulke3 = new Ulkeler("France");

        System.out.println("ulke1.ulkelerSayac = " + ulke1.ulkelerSayac);
        System.out.println("ulke1 = " + ulke1);
        System.out.println("ulke2 = " + ulke2);
        System.out.println("ulke3 = " + ulke3);
        System.out.println("Oluşturlan Ülke sayısı = " + Ulkeler.ulkelerSayac);


    }
}
