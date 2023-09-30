package Day36_StaticClassMembers_1;

public class StudentStc {
    final static double PI_Sayisi = 3.14;
    String name;
    static int number = 1000;
    int schoolNumber;
    private static String schoolName = "Boot flow Academy";

    StudentStc(){
        number++;
        setSchoolNumber(number);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public  int getSchoolNumber() {

        return schoolNumber;
    }

    public void setSchoolNumber(int number) {

        schoolNumber = number;
    }

    public static String getSchoolName() {
        return schoolName;
    }

   /* public static void setSchoolName(String schoolName) {
        StudentStc.schoolName = schoolName;
    }*/

    @Override
    public String toString() {
        return "StudentStc{" +
                "name='" + name + '\'' +
                ", schoolNumber=" + schoolNumber +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
