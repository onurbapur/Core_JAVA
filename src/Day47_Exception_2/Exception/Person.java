/*
 * Copyright (c) 2022.
 * SDET- Java Core
 * Armada-prog
 * armada.dscrd@gmail.com
 */

package Day47_Exception_2.Exception;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws ValidateFieldException {
        this.name = validateName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws ValidateFieldException {
        this.age = validateAge(age);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws ValidateAddressException{
        this.address = validateAddress(address);
    }

    private String validateName(String name) throws ValidateFieldException {
        if(name.isEmpty()){
            throw new ValidateFieldException("Ad alanı boş geçilemez!");
        } else if (name.length() < 3) {
            throw new ValidateFieldException("Ad alanı en az 3 harften oluşmak zorundadır!");
        } else return name;
    }
    private int validateAge(int age) throws ValidateFieldException{
        if(age > 0 && age <= 120){
            return age;
        } else throw new ValidateFieldException("Yaş bilgisi 0-120 aralığında olmalıdır!");
    }

    private String validateAddress(String adres) throws ValidateAddressException{
        if(adres.isEmpty()){
            throw new ValidateAddressException("Adres alanı boş geçilemez!");
        } else if (adres.length() < 10) {
            throw new ValidateAddressException("Adres bilgisi 10 karakterden küçük olamaz!");
        }else return adres;
    }
    public String showInfo(){
        String str = "Adı         : " + getName() + "\n";
        str += "Yaşı        : " + getAge() + "\n";
        str += "Adresi      : " + getAddress();
        return str;
    }
}
