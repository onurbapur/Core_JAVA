/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileOpsException {

    public static void main(String[] args) {

        File file = new File("src/Day47_Exception_2/abc.txt");
        Scanner satirOku = null;
        try {
            System.out.println("Try bloğunun içindeyim");

            satirOku = new Scanner(file);

            while (satirOku.hasNextLine()){
                System.out.println(satirOku.nextLine());
            }
            System.out.println("satirOku.nextLine() = " + satirOku.nextLine());

          /*  System.out.println("satirOku.nextLine() = " + satirOku.nextLine());
            System.out.println("satirOku.nextLine() = " + satirOku.nextLine());
            System.out.println("satirOku.nextLine() = " + satirOku.nextLine());*/

            System.out.println("Dosyayı okudum.");
        }
        catch (NoSuchElementException olmayanSatirOku){
            System.out.println("Dosyada olmayan bir satırı okumaya çalışıyorsunuz!");
        }
        catch (FileNotFoundException dosyaYok){
            System.out.println("Beliritilen dosya sistemde bulunamadı!");
        }

        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally bloğundayım");
            if(satirOku!=null){
                System.out.println("Dosyayı kapattım.");
                satirOku.close();
            }
        }
    }
}
