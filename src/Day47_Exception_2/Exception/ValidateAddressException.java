/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception_2.Exception;

public class ValidateAddressException extends RuntimeException {//Unchecked exception-RunTime- compiler does not check
    ValidateAddressException(String mesaj){
        super(mesaj);
    }
}
