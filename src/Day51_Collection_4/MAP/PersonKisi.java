/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day51_Collection_4.MAP;

public class PersonKisi {
    private int TCNO;
    private String name;
    private String address;
    private String fatherName;

    PersonKisi(){

    }

    public PersonKisi(int TcNo, String name, String address, String fatherName) {
        this.TCNO = TcNo;
        this.name = name;
        this.address = address;
        this.fatherName = fatherName;
    }

    public int getTCNO() {
        return TCNO;
    }

    public void setTCNO(int TCNO) {
        this.TCNO = TCNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "PersonKisi{" +
                "TCNO=" + TCNO +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}
