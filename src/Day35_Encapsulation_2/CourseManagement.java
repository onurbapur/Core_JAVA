package Day35_Encapsulation_2;

import java.util.Scanner;

public class CourseManagement {
    public static void main(String[] args) {
        System.out.println("Welcome to Course Management Application.");
        Student std1 = new Student();
        Student std2 = new Student();

        std1.setName("Ahmet Falanca");
        std2.setName("Mehmet Smithson");
        System.out.println(std1);
        System.out.println(std2);

        Teacher tchr1 = new Teacher();
        Teacher tchr2 = new Teacher();
        tchr1.setName("John Carl");
        tchr2.setName("Merry Mery");
        System.out.println(tchr1);
        System.out.println(tchr2);

        Lesson lsn1 = new Lesson("Java");
        Lesson lsn2 = new Lesson("SDLC");

        lsn1.addTeacher(tchr1);
        lsn1.addTeacher(tchr2);
        lsn2.addTeacher(tchr2);

        System.out.println("lsn1 = " + lsn1);
        System.out.println("lsn2 = " + lsn2);

        Course course1 = new Course("Core Java",2500);
        course1.addLesson(lsn1);
        course1.addLesson(lsn2);

        course1.addTeacher(tchr1);
        course1.addTeacher(tchr2);

        course1.addStudent(std1);
        course1.addStudent(std2);
        System.out.println();

        //Klavyeden girdi alarak öğrenci ekleyen bir metod
        //Öğrenciyi hangi kursa ekleyeceksek metoda o kursu parametre olarak gönderiyoruz.
        addStudent(course1);

        /*System.out.println(course1.showTeachers());
        System.out.println(course1.showStudents());
        System.out.println(course1.showLessons());*/

        System.out.println(course1);
    }
    private static void addStudent(Course course) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String strName;
            System.out.print("Please enter Student's Name : ");
            strName = scanner.nextLine();
            if(strName.isBlank() || strName.isEmpty()){
                System.out.println("Name field cannot be empty or blank!");
                System.out.print("Continue to add student (Y/N)? ");
                if (scanner.nextLine().equalsIgnoreCase("N")){
                    break;
                }
            } else{
                Student std = new Student();
                std.setName(strName);
                course.addStudent(std);
                System.out.println("Student added to course..");
            }
        }
    }
}
