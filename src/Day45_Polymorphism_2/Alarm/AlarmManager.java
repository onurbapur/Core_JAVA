/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2.Alarm;

import java.util.ArrayList;

public class AlarmManager {

    public void birimInform(ArrayList<IAlarm> birimler,Sensor sensor){
        for (IAlarm birim: birimler){
            birim.inform(sensor);
        }
    }

    public void birimInform(Sensor sensor, IAlarm ... birimler){//Var args
        for (IAlarm birim: birimler){
            birim.inform(sensor);
        }
    }
    public void birimInform(IAlarm birim, Sensor sensor){
        birim.inform(sensor);
    }
}
