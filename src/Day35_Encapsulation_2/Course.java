package Day35_Encapsulation_2;

import java.util.ArrayList;

public class Course {
    private static int id = 9000;
    private String courseName;
    private double coursePrice;


    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Lesson> lessons;

    public Course() {
        id++;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        lessons = new ArrayList<>();
    }

    public Course(String courseName, double coursePrice) {
        id++;
        setCourseName(courseName);
        this.coursePrice = coursePrice;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        lessons = new ArrayList<>();
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Course.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName.trim().toUpperCase();
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }


    public String showTeachers(){
         String str = this.courseName + " - Teachers List\n";
         str += "--------------------------------\n";
         str += "Sn\tTeacher Id\tTeacher Name\n";
         str += "--\t----------\t----------------\n";
         int sno = 1;
         for (Teacher teacher:teachers){
             str += sno++ + "-\t" + teacher.getTeacherId() + "\t" + teacher.getName() + "\n";
         }
         return str;
    }
    public String showStudents(){
        String str = this.courseName + " - Students List\n";
        str += "--------------------------------\n";
        str += "Sn\tStudent Id\tStudent Name\n";
        str += "--\t----------\t----------------\n";
        int sno = 1;
        for (Student student:students){
            str += sno++ + "-\t" + student.getStudentId() + "\t" + student.getName() + "\n";
        }
        return str;
    }

    public String showLessons(){
        String str = this.courseName + " - Lessons List\n";
        str += "--------------------------------\n";
        str += "Sn\tLesson Id\tLesson Name\n";
        str += "--\t----------\t----------------\n";
        int sno = 1;
        for (Lesson lesson:lessons){
            str += sno++ + "-\t" + lesson.getLessonId() + "\t\t" + lesson.getLessonName() + "\n";
        }
        return str;
    }

    @Override
    public String toString() {
        String str = showTeachers() + "\n";
        str += "--------------------------------\n";
        str += showLessons() + "\n";
        str += "--------------------------------\n";
        str += showStudents() + "\n";
        return str;
    }
}
