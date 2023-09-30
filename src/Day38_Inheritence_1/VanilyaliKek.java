/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritence_1;

public class VanilyaliKek extends SadeKek {

    private int vanilla;

    public VanilyaliKek() {
        super();
    }

    public VanilyaliKek(String name, int un, int seker, int yag, int sut, int yumurta, int kabartmaTozu) {
        super(name, un, seker, yag, sut, yumurta, kabartmaTozu);
    }

    public int getVanilla() {
        return vanilla;
    }

    public void setVanilla(int vanilla) {
        this.vanilla = vanilla;
    }

    @Override
    public String toString() {
        String str = super.toString();
        str +=       "  Vanilla Miktarı(gr) : " + getVanilla() + "\n";
        return str;
    }
}
