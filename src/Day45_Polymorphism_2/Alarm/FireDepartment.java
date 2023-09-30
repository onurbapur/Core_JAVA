/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.Alarm;

public class FireDepartment implements IAlarm {
    @Override
    public void inform(Sensor sensor) {
        System.out.println("Alarm gönderen istasyon : " + sensor.getName());
        System.out.println("Alarma durumu           : " + sensor.isStatus());
        System.out.println("İtfaiyeye bilgi verildi : ");
        System.out.println();
    }
}
