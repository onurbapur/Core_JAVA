/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day45_Polymorphism_2;

public class Polymorphism2 {
    public static void main(String[] args) {
        System.out.println("Polymorphism-2 in Java.");

        ClassABC objABC = new ClassABC();
        ClassXYZ objXYZ = new ClassXYZ();

        //How to print class of an object?
   /*     System.out.println("obj.getClass() = " + objABC.getClass());
        System.out.println("obj.getClass().getName() = " + objABC.getClass().getName());
        System.out.println("obj.getClass().getSimpleName() = " + objABC.getClass().getSimpleName());*/

        //How to print interfaces of an object?
//        System.out.println("Inteface/interfaces of object.");

       /* printInterfacesOfObject(objABC);
        printInterfacesOfObject(objXYZ);
*/
       /* for (Class inteF: objABC.getClass().getInterfaces()){
            System.out.println("inteF.getSimpleName() = " + inteF.getSimpleName());
        }*/
        printInterfacesOfObject(objABC);

        if((Object)objABC instanceof ClassXYZ){
            System.out.println("objABC object is an istance of : " + objABC.getClass().getSimpleName());
        }else System.out.println("objABC object is not an istance of the class");

    }
    static void printInterfacesOfObject(Object obj){
        Class tempClass = obj.getClass();
        Class[] interfaces = tempClass.getInterfaces();
        System.out.println("Class name of object = " + tempClass.getSimpleName());
        System.out.println("---------------------------------------");

        for (Class interfacesOfObj : interfaces ){
            System.out.println("interfacesOfObj = " + interfacesOfObj.getSimpleName());
        }
    }
}
