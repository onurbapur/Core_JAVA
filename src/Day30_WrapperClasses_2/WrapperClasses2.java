package Day30_WrapperClasses_2;

public class WrapperClasses2 {
    public static void main(String[] args) {
        System.out.println("Wrapper Classes-2 in Java.");
        String str = "AbC2sŞüĞ375!?";
        String tempLetter="";
        String tempSpecial="";
        String tempDigit ="";
        boolean isHasDigit =false;
        boolean isHasLetter =false;
        boolean isHasSpecial =false;

        for (int i = 0; i < str.length(); i++) {
           // System.out.println("str.charAt(i) = " + str.charAt(i));
              if(Character.isDigit(str.charAt(i)))  {
                tempDigit +=str.charAt(i) + " ";
                isHasDigit = true;
              } else if (Character.isLetter(str.charAt(i))) {
                  tempLetter +=str.charAt(i) + " ";
                  isHasLetter = true;
              }else {
                  tempSpecial +=str.charAt(i) +" ";
                  isHasSpecial = true;
              }
        }
        System.out.print("Letters = " + tempLetter);
        System.out.println();
        System.out.print("Digits = " + tempDigit );
        System.out.println();
        System.out.println("Specials = " + tempSpecial);

        if(isHasDigit && isHasLetter && isHasSpecial){
            System.out.println("Password is valid.");
        }else System.out.println("Password is not valid!");

    }
}
