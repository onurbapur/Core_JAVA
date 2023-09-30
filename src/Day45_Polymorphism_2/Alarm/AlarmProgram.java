/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.Alarm;

import java.util.ArrayList;

public class AlarmProgram {
    public static void main(String[] args) {
        System.out.println("Alarm programı");
        System.out.println("-----------------------------------");

        AlarmManager alarmManager = new AlarmManager();
        Sensor sensor1 = new Sensor(1001,"Honda Plaza",true);
        Sensor sensor2 = new Sensor(1901,"ABC Bankası",true);
/*

        alarmManager.birimInform(new FireDepartment(),sensor1);
        alarmManager.birimInform(new FireDepartment(),sensor2);

        alarmManager.birimInform(new Police(),sensor2);
        alarmManager.birimInform(new AFAD(),sensor1);
*/

        ArrayList<IAlarm> alarmBirimleri = new ArrayList<>();
        alarmBirimleri.add(new FireDepartment());
        alarmBirimleri.add(new Police());
        alarmBirimleri.add(new AFAD());
        alarmBirimleri.add(new Database());

        alarmManager.birimInform(alarmBirimleri,sensor1);
        alarmManager.birimInform(alarmBirimleri,sensor2);

        System.out.println("---------------------------");
        alarmManager.birimInform(new AFAD(),sensor1);

        System.out.println("---------------------------");
        alarmManager.birimInform(new AcilServis(),sensor2);

        System.out.println("Var args.....");
        alarmManager.birimInform(sensor1,new FireDepartment(),new Police()); //Var args

    }
}
