/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritence_1;

public class KekTest {

    public static void main(String[] args) {
        CevizliKek cvz = new CevizliKek();
        PortakalliKek prtkl = new PortakalliKek();
        VanilyaliKek vanillaliKek = new VanilyaliKek();
        IncirliKek incir = new IncirliKek();

        cvz.setName("Cevizli Kek");
        cvz.setUn(3);
        cvz.setYag(100);
        cvz.setSeker(2);
        cvz.setKabartmaTozu(1);
        cvz.setYumurta(3);
        cvz.setSut(2);
        cvz.setCeviz(150);

        System.out.println(cvz);

        prtkl.setName("Portakallı Kek");
        prtkl.setUn(3);
        prtkl.setYag(100);
        prtkl.setSeker(2);
        prtkl.setKabartmaTozu(1);
        prtkl.setYumurta(3);
        prtkl.setSut(2);
        prtkl.setPortakal(1);
        prtkl.setPortakalSuyu(2);
        prtkl.setTarcin(2);

        System.out.println(prtkl);

        prtkl.karistir();

        prtkl.pisir();

        Firin minFirin = new Firin();

        minFirin.setDerece(180);
        minFirin.setSure(45);
        minFirin.tepsiyeEkle(prtkl);
        minFirin.tepsiyeEkle(cvz);

        System.out.println("minFirin = " + minFirin);

        minFirin.pisir();
    }
}
