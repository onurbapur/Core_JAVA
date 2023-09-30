package Day34_Encapsulation_1;

public class TestGetterSetter {
    public static void main(String[] args) {
        BasitSetterGetter bst1 = new BasitSetterGetter();
        bst1.setNumber(100000);
        System.out.println("bst1.getNumber() = " + bst1.getNumber());

        System.out.println("bst1.veriAta(150) = " + bst1.veriAtaNumber(15));

        if (bst1.veriAtaNumber(50)){
            System.out.println("bst1.getNumber() = " + bst1.getNumber());
        } else System.out.println("Veri atama işleminiz başarısız! Sayı 100 den  büyük olamaz");

        bst1.setNumber(17);
        System.out.println("bst1.getNumber() = " + bst1.getNumber());

        System.out.println("bst1.getResult() = " + bst1.getResult());

        System.out.println("bst1.veriGosterNumber() = " + bst1.veriGosterNumber());

        System.out.println("bst1.getNumber() = " + bst1.getNumber());
    }
}
