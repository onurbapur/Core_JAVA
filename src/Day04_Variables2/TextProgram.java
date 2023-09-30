package Day04_Variables2;

public class TextProgram {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String schoolName;

        boolean isMarried;
        boolean isFinished;
        boolean isLessonStart;

        String ilkAdi, soyaAdi;
        boolean evliMi, dersBittiMi;

        firstName ="Ali";
        lastName = "Falanca";
        schoolName = "BootFlow Academy";

        isMarried = false;
        isFinished = true;
        isLessonStart = true;
        evliMi = true;

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(schoolName);

        System.out.println("Evli mi? = " + isMarried);
        System.out.println("Ders başladı mı? = " + isLessonStart);
    }
}
