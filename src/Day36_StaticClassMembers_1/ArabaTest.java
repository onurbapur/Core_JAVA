package Day36_StaticClassMembers_1;

public class ArabaTest {
    public static void main(String[] args) {
        System.out.println(Araba.arabalar.size());
        Araba araba1 = new Araba("Tofaş","Şahin");
        Araba.arabalar.add(araba1);

        for (Araba araba:Araba.arabalar){
            System.out.println("Araba markası : " + araba.getName());
            System.out.println("Araba modeli  : " + araba.getModel());
            System.out.println();
        }
    }
}
