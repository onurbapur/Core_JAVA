/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding.Galeri;

public class GaleriTest {
    public static void main(String[] args) {
        Galeri galeri1 = new Galeri();
        Sedan sedan = new Sedan();
        Kamyonet kamyonet = new Kamyonet();

        Vehicle vehicle;

        vehicle= new Sedan();
        galeri1.aracEkle(vehicle);

        vehicle = new Kamyonet();
        galeri1.aracEkle(vehicle);

        vehicle = new Kamyonet();
        galeri1.aracEkle(vehicle);
        vehicle= new Sedan();
        galeri1.aracEkle(vehicle);
        vehicle= new Sedan();
        galeri1.aracEkle(vehicle);

        galeri1.aracEkleSedan(sedan);
        galeri1.aracEkleKamyonet(kamyonet);

        galeri1.aracEkle(sedan);
        galeri1.aracEkle(kamyonet);
        galeri1.aracEkle(vehicle);

        galeri1.aracTipsizEkle(vehicle);
        galeri1.aracTipsizEkle(kamyonet);
        galeri1.aracTipsizEkle(sedan);
        galeri1.aracTipsizEkle("Ben de bir aracım");
        galeri1.aracTipsizEkle(1234);

        System.out.println("galeri1.galeriAraclar.size() = " + galeri1.galeriAraclar.size());

        for (Vehicle vehicle1: galeri1.galeriAraclar){
            System.out.println("vehicle.getClass().getSimpleName() = " + vehicle1.getClass().getSimpleName());
        }

        for (Object obj: galeri1.tipsizArray){
            System.out.println("obj.getClass().getSimpleName() = " + obj.getClass().getSimpleName());
        }

    }
}
