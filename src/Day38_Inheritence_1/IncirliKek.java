/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritence_1;

public class IncirliKek extends SadeKek {
    private int incir;

    public IncirliKek(int incir) {
        this.incir = incir;
    }

    public IncirliKek(String name, int un, int seker, int yag, int sut, int yumurta, int kabartmaTozu, int incir) {
        super(name, un, seker, yag, sut, yumurta, kabartmaTozu);
        this.incir = incir;
    }

    public IncirliKek() {
        super();
    }

    public int getIncir() {
        return incir;
    }

    public void setIncir(int incir) {
        this.incir = incir;
    }
}
