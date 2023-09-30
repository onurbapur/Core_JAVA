package Day35_Encapsulation_2;

import java.util.ArrayList;

public class Lesson {
    private static int id;
    private String lessonId;
    private String lessonName;
    private ArrayList<Teacher> teachers ;
    private ArrayList<Student> students ;

    public Lesson() {
        id++;
        setLessonId(id);
        teachers = new ArrayList<>();
        students = new ArrayList<>();
    }

    public Lesson(String lessonName) {
        id++;
        this.lessonName = lessonName;
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        setLessonId(id);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Lesson.id = id;
    }

    public String  getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = this.lessonName + "-" + lessonId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonId=" + lessonId +
                ", lessonName='" + lessonName + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
