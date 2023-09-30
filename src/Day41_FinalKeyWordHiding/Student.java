/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day41_FinalKeyWordHiding;

public class Student extends Person{
    int studentNumber = 0;
    //Constructor
    Student(){
        Person.id++;
        studentNumber = Person.id;
        //Local variable-exist in constructor scope. Outside can not be exist and reached
        String nameUpperCase;
        if (name != null){
            nameUpperCase = name.toUpperCase();
        }

    }

    {  //Local variable-exist in code block scope. Outside can not be exist and reached
        int salary = 1000 ;
        salary = salary * 3;
    }

    void notHesapla(){
        //Local variable-exist in method code block scope. Outside can not be exist and reached
        int vize1 = 0;
        int vize2 = 0;
        double finalNotu = 0;
        finalNotu = (vize1 + vize2) / 2 + finalNotu;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Student number=" + studentNumber +
                "age=" + age +
                ", name='" + name + '\'' +
                ", workAddress='" + Person.workAddress + '\'' +
                ", workWebAddress='" + Person.workWebAddress + '\'' +
                '}';
    }
}
