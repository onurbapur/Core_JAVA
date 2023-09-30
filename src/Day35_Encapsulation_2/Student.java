package Day35_Encapsulation_2;

public class Student {
    private static int id = 1000;
    private String studentId;
    private String name;
    private double payment;

    public Student() {
        setId();
        setStudentId();
    }

    public Student(String name, double payment) {
        setId();
        setStudentId();
        setName(name);
        this.payment = payment;
    }

    public static int getId() {
        return id;
    }

    public static void setId() {
        id++;
        Student.id = id;

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId() {
        this.studentId = "2022-" + id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", payment=" + payment +
                '}';
    }
}
