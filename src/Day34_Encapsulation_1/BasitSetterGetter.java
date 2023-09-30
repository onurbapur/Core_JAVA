package Day34_Encapsulation_1;

public class BasitSetterGetter {
    //Encapsulation
    private int number;
    private int result;

    //Setter method
    public void setNumber(int sayi){
      if (sayi > 100){
          System.out.println("Sayı değeri 100 den büyük olamaz");
      } else  {
        this.number = sayi;
        this.result = this.number * 20;
      }
    }
    //Getter method
    public int getNumber(){
      return this.number;
    }

    public int getResult(){
        return this.result;
    }
    //Setter
    public boolean veriAtaNumber(int number){
      if (number > 100){
        return false;
      } else  this.number = number;
      return true;
    }
    //Getter
    public int veriGosterNumber(){
        return this.number;
    }
}
