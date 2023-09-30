package Day10_IfElse_ElseIf;

public class if_Alarm {
    public static void main(String[] args) {
        System.out.println("Alarm sistemi...");
        System.out.println("----------------");

        boolean kapi1=false,kapi2=false,pencer1=false,pencer2=false;
        boolean alarmlambasi = false;

        boolean alarmTetiklendi = false;

        pencer1 = true;
        kapi2 = true;

        alarmTetiklendi = (kapi1 || kapi2 || pencer1 || pencer2);

        System.out.println();
        System.out.println();

        if (alarmTetiklendi){
            alarmlambasi = true;
            System.out.println("Alarm durumu ---> " + alarmTetiklendi);
            System.out.println("Kapılardan veya pencerelerden enaz birisi açılmış!");
            System.out.println("Kapı 1 - " + kapi1);
            System.out.println("Kapı 2 - " + kapi2);
            System.out.println("Pencere 1 - " + pencer1);
            System.out.println("Pencere 2 - " + pencer2);
        }else {
            System.out.println("Alarm tetiklenmemiş. Bir problem yok.");
        }

        System.out.println();
        System.out.println("---------------------------------");
        if(alarmTetiklendi){

            if(kapi1){
                System.out.println("Alarm tetiklendi. Kapı 1 açılmış!");
                alarmlambasi = true;
            }
            if(kapi2){
                System.out.println("Alarm tetiklendi. Kapı 2 açılmış!");
                alarmlambasi = true;
            }
            if(pencer1){
                System.out.println("Alarm tetiklendi. Pencere 1 açılmış!");
                alarmlambasi = true;
            }
            if(pencer2){
                System.out.println("Alarm tetiklendi. Pencere 2 açılmış!");
                alarmlambasi = true;
            }

        }else System.out.println("Alarm tetiklenmedi. Bir problem yok.");
    }
}
