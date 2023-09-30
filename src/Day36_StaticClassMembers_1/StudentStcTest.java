package Day36_StaticClassMembers_1;

public class StudentStcTest {

    public static void main(String[] args) {
        StudentStc ogrObj1 = new StudentStc();
        StudentStc ogrObj2 = new StudentStc();
        StudentStc ogrObj3 = new StudentStc();
        StudentStc ogrObj4 = new StudentStc();
        StudentStc ogrObj5 = new StudentStc();

        ogrObj1.name = "Ahmet";
     //   ogrObj1.schoolName = "Boot flow Academy";
     //   ogrObj1.schoolNumber = 1001;

        ogrObj2.name = "Mehmet";
     //   ogrObj2.schoolName = "Boot flow Academy";
     //   ogrObj2.schoolNumber = 1003;

        ogrObj3.name = "Hasan";
     //   ogrObj3.schoolName = "Boot flow Academy";
      //  ogrObj3.schoolNumber = 1002;

        System.out.println("ogrObj1 = " + ogrObj1);
        System.out.println("ogrObj2 = " + ogrObj2);
        System.out.println("ogrObj3 = " + ogrObj3);


     //  StudentStc.schoolName = "Boot flow Academy okulu";
        System.out.println("ogrObj1 = " + ogrObj1);
        System.out.println("ogrObj2 = " + ogrObj2);
        System.out.println("ogrObj3 = " + ogrObj3);

        System.out.println("StudentStc.getSchoolName() = " + StudentStc.getSchoolName());
        System.out.println("StudentStc.PI_Sayisi = " + StudentStc.PI_Sayisi);

    }
}
