/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritence_1;

public class PortakalliKek extends SadeKek {
    private int portakal;
    private int portakalSuyu;
    private int tarcin;

    public PortakalliKek() {
        super();
    }

    public PortakalliKek(String name, int un, int seker, int yag, int sut, int yumurta, int kabartmaTozu) {
        super(name, un, seker, yag, sut, yumurta, kabartmaTozu);
    }

    public int getPortakal() {
        return portakal;
    }

    public void setPortakal(int portakal) {
        this.portakal = portakal;
    }

    public int getPortakalSuyu() {
        return portakalSuyu;
    }

    public void setPortakalSuyu(int portakalSuyu) {
        this.portakalSuyu = portakalSuyu;
    }

    public int getTarcin() {
        return tarcin;
    }

    public void setTarcin(int tarcin) {
        this.tarcin = tarcin;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str +=       "  Portakal Miktarı(gr) : " + getPortakal() + "\n";
        str +=       "  Portakal Suyu(kaşık) : " + getPortakalSuyu() + "\n";
        str +=       "  Tarçın  Miktarı(Ç.Kş): " + getTarcin() + "\n";
        return str;
    }

    @Override
    public void pisir(){
        super.pisir();
        System.out.println("Fırın içerinde en az 10 dakika dinlendiriniz.");
    }
}
