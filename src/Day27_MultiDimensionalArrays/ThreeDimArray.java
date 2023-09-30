package Day27_MultiDimensionalArrays;

public class ThreeDimArray {
    public static void main(String[] args) {
        int[][][] ogrNotlari = new int[3][2][2]; //3 öğrencinin 2 dersine ait her bir ders için 2 ders notu

        ogrNotlari[0][0][0] = 75; //1. öğrencinin birinci dersinin birinci notu
        ogrNotlari[0][0][1] = 45; //1. öğrencinin birinci dersinin ikinci notu
        ogrNotlari[0][1][0] = 95; //1. öğrencinin ikinci dersinin birinci notu
        ogrNotlari[0][1][1] = 60; //1. öğrencinin ikinci dersinin ikinci notu

        ogrNotlari[1][0][0] = 60; //2. öğrencinin birinci dersinin birinci notu
        ogrNotlari[1][0][1] = 80; //2. öğrencinin birinci dersinin ikinci notu
        ogrNotlari[1][1][0] = 70; //2. öğrencinin ikinci dersinin birinci notu
        ogrNotlari[1][1][1] = 50; //2. öğrencinin ikinci dersinin ikinci notu

        ogrNotlari[2][0][0] = 50; //3. öğrencinin birinci dersinin birinci notu
        ogrNotlari[2][0][1] = 85; //3. öğrencinin birinci dersinin ikinci notu
        ogrNotlari[2][1][0] = 40; //3. öğrencinin ikinci dersinin birinci notu
        ogrNotlari[2][1][1] = 70; //3. öğrencinin ikinci dersinin ikinci notu

        for (int ogrNo = 0; ogrNo < ogrNotlari.length; ogrNo++) {// Her bir öğrenciyi dolaşır
            System.out.println("----------------------");
            System.out.println("Öğrenci numarası : " + (ogrNo + 1));
            for (int ders = 0; ders < ogrNotlari[ogrNo].length; ders++) { //Öğrencinin Her bir dersini dolaşır
                System.out.println("----------------------");
                System.out.println("Ders no : " + (ders + 1));
                System.out.print("Notlar : ");

                for (int notlar = 0; notlar < ogrNotlari[ogrNo][ders].length; notlar++) {//Öğrencinin herbir dersinin notlarını dolaşır
                    System.out.print(ogrNotlari[ogrNo][ders][notlar] + "\t");
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Tablo halindeki gösterim.(for...loop)");
        for (int ogrNo = 0; ogrNo < ogrNotlari.length; ogrNo++) {// Her bir öğrenciyi dolaşır
            System.out.println("------------------------------");
            System.out.println("ÖğrNo\tDersNo\tNot1\tNot2 ");
            System.out.println("-----\t------\t----\t------");
            System.out.print((ogrNo + 1));
            for (int ders = 0; ders < ogrNotlari[ogrNo].length; ders++) { //Öğrencinin Her bir dersini dolaşır
                System.out.print("\t\t" + (ders + 1));
                for (int notlar = 0; notlar < ogrNotlari[ogrNo][ders].length; notlar++) {//Öğrencinin herbir dersinin notlarını dolaşır
                    System.out.print("\t\t" + ogrNotlari[ogrNo][ders][notlar] + "");
                }
                System.out.println();
            }
        }

        //Traversing three-dimensional array with for each loop
        /*
        for...each loop to iterate through elements of 3d array
            int[][][] array3D;
                for (int[][] array2D: array3D) {
                    for (int[] array1D: array2D) {
                        for(int item: array1D) {
                            System.out.println(item);
                        }
                    }
                }
         */
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Tablo halindeki gösterim.(for...each loop)");
        int ogrNo=0;
        int dersNo=0;
        for (int[][] ogrenciler: ogrNotlari) {
            System.out.println("------------------------------");
            System.out.println("ÖğrNo\tDersNo\tNot1\tNot2 ");
            System.out.println("-----\t------\t----\t------");
            System.out.print((++ogrNo));
            for (int[] dersler: ogrenciler) {
                System.out.print("\t\t" + (++dersNo));
                for(int notlar: dersler) {
                    System.out.print("\t\t" + notlar );
                }
                System.out.println();
            }
            dersNo = 0;
        }
    }
}
