/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritence_1;

public class SadeKek {
    private String name;
    private int un;
    private int seker;
    private int yag;
    private int sut;
    private int yumurta;
    private int kabartmaTozu;

    public SadeKek() {
    }

    public SadeKek(String name, int un, int seker, int yag, int sut, int yumurta, int kabartmaTozu) {
        this.name = name;
        this.un = un;
        this.seker = seker;
        this.yag = yag;
        this.sut = sut;
        this.yumurta = yumurta;
        this.kabartmaTozu = kabartmaTozu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUn() {
        return un;
    }

    public void setUn(int un) {
        this.un = un;
    }

    public int getSeker() {
        return seker;
    }

    public void setSeker(int seker) {
        this.seker = seker;
    }

    public int getYag() {
        return yag;
    }

    public void setYag(int yag) {
        this.yag = yag;
    }

    public int getSut() {
        return sut;
    }

    public void setSut(int sut) {
        this.sut = sut;
    }

    public int getYumurta() {
        return yumurta;
    }

    public void setYumurta(int yumurta) {
        this.yumurta = yumurta;
    }

    public int getKabartmaTozu() {
        return kabartmaTozu;
    }

    public void setKabartmaTozu(int kabartmaTozu) {
        this.kabartmaTozu = kabartmaTozu;
    }

    public void karistir(){
        System.out.println(toString());
        System.out.println("Yukarıdaki malzemeleri en az 10 dakika karıştırın");
    }
    public void pisir(){
        System.out.println(getName() + " en az 30 dakika 180 derece fırında pişirin.");
    }

    @Override
    public String toString() {
        String str = "Kekin adı             : " + getName() + "\n";
        str +=       "  Un miktarı(gr)      : " + getUn() + "\n";
        str +=       "  Şeker miktarı(gr)   : " + getSeker() +"\n";
        str +=       "  Yağ miktarı(gr)     : " + getYag() + "\n";
        str +=       "  Süt miktarı(gr)     : " + getSut() + "\n";
        str +=       "  Yumurta (adet)      : " + getYumurta()+ "\n";
        str +=       "  Kabarma Tozu(pkt)   : " + getKabartmaTozu() + "\n";
        return str;
    }

}
