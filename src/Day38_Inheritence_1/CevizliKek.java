/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day38_Inheritence_1;

public class CevizliKek extends SadeKek{
  private int ceviz;

  public CevizliKek(){
    super();
  }
  public CevizliKek(String name, int un, int seker, int yag, int sut, int yumurta, int kabartmaTozu) {
    super(name, un, seker, yag, sut, yumurta, kabartmaTozu);
  }


  public int getCeviz() {
    return ceviz;
  }

  public void setCeviz(int ceviz) {
    this.ceviz = ceviz;
  }

  @Override
  public String toString() {
    String str = super.toString();
    str +=       "  Ceviz Miktarı(gr) : " + getCeviz() + "\n";
    return str;
  }
}
