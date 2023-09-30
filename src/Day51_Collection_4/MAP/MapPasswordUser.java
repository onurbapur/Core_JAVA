/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection_4.MAP;

import java.util.HashMap;
import java.util.Map;

public class MapPasswordUser {
    public static void main(String[] args) {
        Map<String ,String> userPassWordList = new HashMap<>();

        userPassWordList.put("mehmet@abc.com.xyz","12345abc");
        userPassWordList.put("mery","xyz123");
        userPassWordList.put("ahmet","abcdx123");

        String userName = "ahmet" ;
        String password = "abcdx123";

        for (Map.Entry<String ,String > userEntry : userPassWordList.entrySet()){
          if(userName.equals(userEntry.getKey()) && password.equals(userEntry.getValue())){
              System.out.println("Login successful");
              break;
          }else {
              System.out.println("User or password is not match!");
              break;
          }

        }
    }
}
