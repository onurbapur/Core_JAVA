/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding;

    public class Hesapla { //final keyword makes class non-inheritable

    final double KDV = 0.18;

   final public double kdvHesapla(double amount){//Can not be override by sub classes
        return amount * KDV + amount;
    }

    //can be overload
    public  double kdvHesapla(int amount){ //can be override by sub classes.
        return amount * KDV + amount;
    }
}
