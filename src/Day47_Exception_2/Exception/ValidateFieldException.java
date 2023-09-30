/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception_2.Exception;

public class ValidateFieldException extends Exception{//Checked exception-Compile time...code can not be compiled by java
    ValidateFieldException(String mesaj){
        super(mesaj);
    }
}
